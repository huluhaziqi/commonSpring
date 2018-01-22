package com.lin.commonspring.service;


import com.lin.commonspring.model.PagingInterface;
import com.lin.commonspring.model.biz.miniVideo.MiniVideoForAdmin;
import com.lin.commonspring.model.entity.MiniVideoCutRecordEntity;
import com.lin.commonspring.model.entity.MiniVideoEntity;
import com.lin.commonspring.model.entity.VideoTagEntity;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface MiniVideoService {

    Long createMiniVideo(MiniVideoEntity miniVideoEntity, long uid, List<Integer> tagIdList,
                         List<String> buildingIdList, int buildingType, String vodTaskId);

    void createMiniVideoCutRecord(Long liveroomId, String fileId, String vodTaskId);

    List<VideoTagEntity> getAllTags();

    List<MiniVideoCutRecordEntity> getUnHandledEntity(long miniVideoId);

    MiniVideoEntity getEntityById(Long miniVideoId);

    void updateReviewStatus(Long miniVideoId, Byte status);


    Map<Long, MiniVideoForAdmin> getMiniVideoForAdminMap(List<Long> ids);

    List<MiniVideoForAdmin> listMiniVideoForAdmin(Long id, Byte status, List<Integer> cityIdList, Long hostId,
                                                  String title, Integer tagId, Date startTime, Date endTime,
                                                  PagingInterface pagingInterface);

    int countMiniVideoForAdmin(Long id, Byte status, List<Integer> cityIdList, Long hostId,
                               String title, Integer tagId, Date startTime, Date endTime);
}
