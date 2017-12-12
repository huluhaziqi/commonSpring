package com.lin.commonspring.config;

import com.lin.commonspring.interceptor.LoginInterceptor;
import com.lin.commonspring.resolver.AdminResolver;
import com.lin.commonspring.resolver.UserResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Autowired
    private UserResolver userResolver;

    @Autowired
    private AdminResolver adminResolver;

    @Autowired
    private BeanNameViewResolver beanNameViewResolver;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor);
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.viewResolver(beanNameViewResolver);
        registry.enableContentNegotiation(new MappingJackson2JsonView());
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(userResolver);
        argumentResolvers.add(adminResolver);
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(Timestamp.class, new Formatter<Timestamp>() {
            @Override
            public Timestamp parse(String s, Locale locale) throws ParseException {
                return new Timestamp(Long.parseLong(s));
            }

            @Override
            public String print(Timestamp timestamp, Locale locale) {
                return String.valueOf(timestamp.getTime());
            }
        });
    }
}
