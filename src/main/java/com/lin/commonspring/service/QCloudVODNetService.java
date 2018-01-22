package com.lin.commonspring.service;


import com.lin.commonspring.model.Response.QCloudVODVideoAddSimpleClipTaskResponse;

public interface QCloudVODNetService {
    QCloudVODVideoAddSimpleClipTaskResponse addVideoSimpleClipTask(String fileId, String fileName, Integer startTimeOffset, Integer endTimeOffset);

    QCloudVODVideoAddSimpleClipTaskResponse addVideoSimpleClipTaskByLiveroomId(long liveroomId, String fileId,Integer startTimeOffset, Integer endTimeOffset);

}
