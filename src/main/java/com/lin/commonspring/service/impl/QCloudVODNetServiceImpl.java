package com.lin.commonspring.service.impl;


import com.lin.commonspring.model.Response.QCloudVODVideoAddSimpleClipTaskResponse;
import com.lin.commonspring.service.QCloudVODClient;
import com.lin.commonspring.service.QCloudVODNetService;
import com.lin.commonspring.util.QCloudVODSignUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

@Service
public class QCloudVODNetServiceImpl implements QCloudVODNetService {


    @Autowired
    private QCloudVODClient qCloudVODClient;

    @Value("${qcloudlvb.secretId}")
    private String secretId;

    @Value("${qcloudlvb.secretKey}")
    private String secretKey;

    @Autowired
    private Environment environment;

    @Override
    public QCloudVODVideoAddSimpleClipTaskResponse addVideoSimpleClipTask(String fileId, String fileName, Integer startTimeOffset, Integer endTimeOffset) {
        TreeMap<String, Object> paramMap = new TreeMap<>();
        long time = getCurrentTimestamp();
        long random = getRandom();
        paramMap.put("Action", "ClipVideo");
        paramMap.put("Nonce", random);
        paramMap.put("Region", "bj");
        paramMap.put("SecretId", secretId);
        paramMap.put("Timestamp", time);
        paramMap.put("fileId", fileId);
        paramMap.put("newFileName", fileName);
        paramMap.put("startTimeOffset", startTimeOffset);
        paramMap.put("endTimeOffset", endTimeOffset);
        String sign = generateSign(paramMap, "GET", "vod.api.qcloud.com", secretKey);
        return qCloudVODClient.addVideoSimpleClipTask(time, random, secretId, sign, fileId, fileName, startTimeOffset, endTimeOffset);
    }

    @Override
    public QCloudVODVideoAddSimpleClipTaskResponse addVideoSimpleClipTaskByLiveroomId(long liveroomId, String fileId,
                                                                                      Integer startTimeOffset, Integer endTimeOffset) {
        //拼接fileName
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = formatter.format(new Date());
        String fileName = getVideoClipFileName(liveroomId, date);
        return addVideoSimpleClipTask(fileId, fileName, startTimeOffset, endTimeOffset);
    }

    private String getVideoClipFileName(long liveroomId, String date) {
        return "cut_" +
                environment.getActiveProfiles()[0] +
                "_" +
                liveroomId +
                "_" +
                date;
    }

    private long getCurrentTimestamp() {
        return System.currentTimeMillis() / 1000;
    }

    private long getRandom() {
        return (long) (Math.random() * 1_000_000);
    }

    private String generateSign(TreeMap<String, Object> paramMap, String requestMethod, String requestHost,
                                String secretKey) {
        return QCloudVODSignUtils.generateVODSign(paramMap, requestMethod, requestHost, secretKey);
    }

}
