package com.lin.commonspring.util;

import com.lin.commonspring.util.utilities.Base64;
import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.TreeMap;

public class QCloudVODSignUtils {

    private static final String CONTENT_CHARSET = "UTF-8";//编码方式

    private static final String HMAC_ALGORITHM = "HmacSHA1";//HMAC算法

    private static final String REQUEST_PATH = "/v2/index.php";//云API的请求路径固定为/v2/index.php

    public static final int FILE_TRANS = 1;
    public static final int FILE_IS_SCREEN_SHOT = 1;
    public static final int FILE_WATER_MARK = 1;
    public static final int UGC_SIGN_VALID_DURATION = 3600 * 24 * 2;

    private static byte[] byteMerger(byte[] byte_1, byte[] byte_2) {
        byte[] byte_3 = new byte[byte_1.length + byte_2.length];
        System.arraycopy(byte_1, 0, byte_3, 0, byte_1.length);
        System.arraycopy(byte_2, 0, byte_3, byte_1.length, byte_2.length);
        return byte_3;
    }

    //上传视频签名验证
    public static  String getUploadSignature(long uid,String mSecretId, String mSecretKey) {
        String strSign = "";
        String contextStr = "";
        long m_qwNowTime = System.currentTimeMillis() / 1000;
        int m_iRandom = new Random().nextInt(java.lang.Integer.MAX_VALUE);
        long endTime = (System.currentTimeMillis() / 1000 + UGC_SIGN_VALID_DURATION);
        try {

            contextStr += "secretId=" + java.net.URLEncoder.encode(mSecretId, "utf8");
            contextStr += "&currentTimeStamp=" + m_qwNowTime;
            contextStr += "&expireTime=" + endTime;
            contextStr += "&random=" + m_iRandom;
            contextStr += "&uid=" + uid;
            contextStr += "&isTranscode=" + FILE_TRANS;
            contextStr += "&isScreenshot=" + FILE_IS_SCREEN_SHOT;
            contextStr += "&isWatermark=" + FILE_WATER_MARK;
            contextStr += "&procedure=QCVB_SimpleProcessFile({10,20,30,210,220,230,10046,10047,10048},1,0,0)";
            String s = contextStr;
            String sig = null;
            Mac mac = Mac.getInstance(HMAC_ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(mSecretKey.getBytes(CONTENT_CHARSET), mac.getAlgorithm());
            mac.init(secretKey);
            byte[] hash = mac.doFinal(contextStr.getBytes(CONTENT_CHARSET));
            byte[] sigBuf = byteMerger(hash, contextStr.getBytes("utf8"));
            strSign = new String(new BASE64Encoder().encode(sigBuf).getBytes());
            strSign = strSign.replace(" ", "").replace("\n", "").replace("\r", "");
        } catch (Exception e) {
            System.out.print(e.toString());
            return "";
        }
        return strSign;
    }

    public static String generateVODSign(TreeMap<String, Object> paramMap, String requestMethod,
                                         String requestHost, String secredKey) {

        String signPlainString; //签名原文字符串
        String prefix = requestMethod + requestHost + REQUEST_PATH;
        String requestString = generateRequestString(paramMap, requestMethod);
        signPlainString = prefix + requestString;
        try {
            return signAndEncode(signPlainString, secredKey);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException | InvalidKeyException e) {
            return null;
        }
    }

    //拼接请求字符串
    private static String generateRequestString(TreeMap<String, Object> paramMap, String requestMethod) {
        StringBuilder result = new StringBuilder();

        for (String key : paramMap.keySet()) {
            //排除上传文件的参数
            if (requestMethod.equals("POST") && paramMap.get(key).toString().substring(0, 1).equals("@")) {
                continue;
            }

            if (result.length() == 0) {
                result.append('?');
            } else {
                result.append('&');
            }
            result.append(key.replace("_", ".")).append("=").append(paramMap.get(key).toString());
        }
        return result.toString();
    }

    //将签名原文字符串签名并编码
    private static String signAndEncode(String signPlainString, String secretKey)
            throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(CONTENT_CHARSET), mac.getAlgorithm());
        mac.init(secretKeySpec);
        byte[] hash = mac.doFinal(signPlainString.getBytes(CONTENT_CHARSET));
        return Base64.encode(hash);
    }

}


