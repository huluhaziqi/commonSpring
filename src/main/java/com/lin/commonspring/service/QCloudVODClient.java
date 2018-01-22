package com.lin.commonspring.service;


import com.lin.commonspring.model.Response.QCloudVODVideoAddSimpleClipTaskResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface QCloudVODClient {

    @GET("/v2/index.php?Action=ClipVideo&Region=bj")
    QCloudVODVideoAddSimpleClipTaskResponse addVideoSimpleClipTask(@Query("Timestamp") long time, @Query("Nonce") long random,
                                                                   @Query("SecretId") String secretId, @Query("Signature") String sign,
                                                                   @Query("fileId") String srcFileId, @Query("newFileName") String newFileName,
                                                                   @Query("startTimeOffset") Integer startTimeOffset, @Query("endTimeOffset") Integer endTimeOffset);

}
