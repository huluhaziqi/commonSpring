package com.lin.commonspring.service;


import com.lin.commonspring.model.PagingInterface;
import com.lin.commonspring.model.biz.miniVideo.AdminMiniVideoReview;
import com.lin.commonspring.model.entity.MiniVideoReviewLogEntity;

import java.util.Date;
import java.util.List;

public interface MiniVideoReviewService {

    /**审核列表*/
    List<AdminMiniVideoReview> getReviewList(Byte status, String reviewerName, PagingInterface paging);

    Integer countReview(Byte status, String reviewerName);

    /**审核队列中通过，只有审核人员才能通过审核*/
    void reviewPass(Long miniVideoId, String reviewerName);

    /**审核队列中驳回，精选视频列表中驳回*/
    void reviewDeny(Long miniVideoId, String reviewerName, String info);

    void addToReviewList(Long miniVideoId);

    void reviewBegin(Long miniVideoId, String reviewerName);

    void reviewGiveUp(Long miniVideoId, String reviewerName);

    void insertReviewLog(Long miniVideoId, Byte status, String reviewerName, String info);

    List<MiniVideoReviewLogEntity> getReviewLogList(Byte status, Date startDate, Date endDate, String reviewerName,
                                                    PagingInterface pagingInterface);

    Integer countReviewLog(Byte status, Date startDate, Date endDate, String reviewerName);
}
