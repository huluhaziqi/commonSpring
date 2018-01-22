package com.lin.commonspring.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lin.commonspring.annotation.RetrofitEnqueue;
import com.lin.commonspring.exception.AbstractNetException;
import com.lin.commonspring.exception.QCloudVODNetException;
import com.lin.commonspring.service.QCloudVODClient;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.*;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;

@Configuration
public class RetrofitClientConfig {

    @Value("https://vod.api.qcloud.com")
    private String qCloudVODBaseUrl;

    @Bean
    public QCloudVODClient qCloudVODClient() {
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(new RetrofitInterceptor(QCloudVODNetException.class)).build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(qCloudVODBaseUrl).client(httpClient)
                .addConverterFactory(JacksonConverterFactory.create())
                .addCallAdapterFactory(
                        new CustomCallAdapterFactory(QCloudVODNetException.class, "code", "0", "message", null))
                .build();
        return retrofit.create(QCloudVODClient.class);
    }

    private static class RetrofitInterceptor implements Interceptor {

        private Class<? extends AbstractNetException> exceptionClass;

        private RetrofitInterceptor(Class<? extends AbstractNetException> exceptionClass) {
            this.exceptionClass = exceptionClass;
        }

        @Override
        public okhttp3.Response intercept(Chain chain) throws IOException {
            Request request = chain.request().newBuilder().header("Accept", "application/json").build();
            okhttp3.Response response = chain.proceed(request);
            if (!response.isSuccessful()) {
                AbstractNetException ex;
                try {
                    ex = exceptionClass.newInstance();
                } catch (InstantiationException | IllegalAccessException e) {
                    throw new RuntimeException(e); // should never happen
                }
                ex.setUrl(request.url().toString());
                ex.setCode(String.valueOf(response.code()));
                ex.setMsg(response.message());
                response.close();
                throw ex;
            }
            return response;
        }
    }

    private static class CustomCallAdapterFactory extends CallAdapter.Factory {

        private Class<? extends AbstractNetException> exceptionClass;

        private String statusKey;
        private String statusSuccessValue;
        private String resultKey;
        private String errorMessageKey;


        /**
         * @param exceptionClass     请求失败时抛出的异常
         * @param statusKey          标志请求是否成功的jsonKey
         * @param statusSuccessValue 请求成功时的jsonValue
         * @param errorMessageKey    请求失败详细信息的jsonKey
         * @param resultKey          请求内容的jsonKey,可以为空,为空时则解析整个response
         */
        private CustomCallAdapterFactory(Class<? extends AbstractNetException> exceptionClass, String statusKey,
                                         String statusSuccessValue, String errorMessageKey, String resultKey) {
            this.exceptionClass = exceptionClass;
            this.statusKey = statusKey;
            this.statusSuccessValue = statusSuccessValue;
            this.errorMessageKey = errorMessageKey;
            this.resultKey = resultKey;
        }

        @Override
        public CallAdapter<?> get(Type returnType, Annotation[] annotations, Retrofit retrofit) {

            return new CallAdapter<Object>() {

                @Override
                public Type responseType() {
                    return JsonNode.class;
                }

                @Override
                public <R> Object adapt(Call<R> call) {
                    if (isEnqueue(annotations)) {
                        // async
                        call.enqueue(new Callback<R>() {
                            @Override
                            public void onResponse(Call<R> call, Response<R> response) {
                            }

                            @Override
                            public void onFailure(Call<R> call, Throwable t) {
                            }
                        });
                        return null;
                    }

                    JsonNode responseBody;
                    try {
                        // sync
                        @SuppressWarnings("unchecked")
                        Response<JsonNode> response = (Response<JsonNode>) call.execute();
                        responseBody = response.body();
                    } catch (IOException e) {
                        AbstractNetException exception;
                        try {
                            exception = exceptionClass.newInstance();
                        } catch (InstantiationException | IllegalAccessException e1) {
                            throw new RuntimeException(e);
                        }
                        exception.setUrl(call.request().url().toString());
                        exception.setMsg(e.getMessage());
                        throw exception;
                    }
                    // 判断status
                    if (statusKey != null) {
                        String status = responseBody.get(statusKey).asText("");
                        if (!status.equals(statusSuccessValue)) {
                            // 构造exception
                            AbstractNetException exception;
                            try {
                                exception = exceptionClass.newInstance();
                            } catch (InstantiationException | IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                            exception.setUrl(call.request().url().toString());
                            exception.setCode(status);
                            if (errorMessageKey != null) {
                                exception.setMsg(responseBody.get(errorMessageKey).asText());
                            }
                            throw exception;
                        }
                    }

                    ObjectMapper objectMapper = new ObjectMapper();
                    JsonNode responseData;
                    // 获取data
                    if (resultKey == null) {
                        // 获取全部responseBody
                        responseData = responseBody;
                    } else {
                        // 只获取data部分
                        responseData = responseBody.get(resultKey);
                    }

                    // 处理空返回
//					if (returnType.equals(void.class)) {
                    if (Void.class.equals(returnType)) {
                        return null;
                    }

                    if (returnType instanceof ParameterizedType) {
                        // 处理Map
                        if (((ParameterizedType) returnType).getRawType().equals(Map.class)) {
                            TypeReference<Map<Long, Boolean>> typeReference = new TypeReference<Map<Long, Boolean>>() {
                                @Override
                                public Type getType() {
                                    return returnType;
                                }
                            };

                            return objectMapper.convertValue(responseData, typeReference);
                        }

                        // 处理list
                        Class<?> realType = (Class<?>) ((ParameterizedType) returnType).getActualTypeArguments()[0];
                        try {
                            // 转为数组
                            Object object = objectMapper.convertValue(responseData,
                                    Class.forName("[L" + realType.getName() + ";"));
                            Object[] objects = (Object[]) object;
                            return Arrays.asList(objects);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        return objectMapper.convertValue(responseData, (Class<?>) returnType);
                    }
                }
            };
        }
    }

    private static boolean isEnqueue(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            if (annotation.annotationType() == RetrofitEnqueue.class) {
                return true;
            }
        }
        return false;
    }
}
