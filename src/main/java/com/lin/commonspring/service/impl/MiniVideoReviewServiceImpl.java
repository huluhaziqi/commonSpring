package com.lin.commonspring.service.impl;

import com.lin.commonspring.dao.MiniVideoReviewDao;
import com.lin.commonspring.dao.MiniVideoReviewLogDao;
import com.lin.commonspring.enums.MiniVideoReviewStatusEnum;
import com.lin.commonspring.enums.MiniVideoStatusEnum;
import com.lin.commonspring.model.PagingInterface;
import com.lin.commonspring.model.biz.miniVideo.AdminMiniVideoReview;
import com.lin.commonspring.model.biz.miniVideo.MiniVideoForAdmin;
import com.lin.commonspring.model.entity.MiniVideoReviewEntity;
import com.lin.commonspring.model.entity.MiniVideoReviewLogEntity;
import com.lin.commonspring.service.MiniVideoReviewService;
import com.lin.commonspring.service.MiniVideoService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MiniVideoReviewServiceImpl implements MiniVideoReviewService {

    @Autowired
    private MiniVideoReviewDao miniVideoReviewDao;

    @Autowired
    private MiniVideoReviewLogDao miniVideoReviewLogDao;

    @Autowired
    private MiniVideoService miniVideoService;

    @Override
    public List<AdminMiniVideoReview> getReviewList(Byte status, String reviewerName, PagingInterface paging) {
        List<AdminMiniVideoReview> result = new ArrayList<>();
        List<MiniVideoReviewEntity> reviewEntities = miniVideoReviewDao.listForAdmin(status, reviewerName, paging.getOffset(),
                paging.getLimit());
        if(CollectionUtils.isEmpty(reviewEntities)) {
            return result;
        }
        List<Long> ids = reviewEntities.stream().map(MiniVideoReviewEntity::getMiniVideoId).collect(Collectors.toList());
        Map<Long, MiniVideoForAdmin> forAdminMap = miniVideoService.getMiniVideoForAdminMap(ids);
        reviewEntities.forEach( o -> {
            AdminMiniVideoReview review = new AdminMiniVideoReview();
            BeanUtils.copyProperties(o, review);
            if(forAdminMap.containsKey(o.getMiniVideoId())) {
                review.setVideo(forAdminMap.get(o.getMiniVideoId()));
            }
            result.add(review);
        });
        return result;
    }

    @Override
    public Integer countReview(Byte status, String reviewerName) {
        return miniVideoReviewDao.countForAdmin(status, reviewerName);
    }

    @Override
    public void reviewPass(Long miniVideoId, String reviewerName) {
        //审核
        MiniVideoReviewEntity entity = miniVideoReviewDao.selectByMiniVideoId(miniVideoId);
        if(entity == null || !entity.getStatus().equals(MiniVideoReviewStatusEnum.REVIEWING.getValue())) {
            return;
        }
        miniVideoReviewDao.updateReviewStatus(entity.getMiniVideoId(), MiniVideoReviewStatusEnum.PASS.getValue(),
                reviewerName, null, new Date());
        //日志
        insertReviewLog(miniVideoId, MiniVideoReviewStatusEnum.PASS.getValue(), reviewerName, null);
        //精选视频
        miniVideoService.updateReviewStatus(miniVideoId, MiniVideoStatusEnum.PASS.getValue());
    }

    @Override
    public void reviewDeny(Long miniVideoId, String reviewerName, String info) {
        //如果是审核驳回，修改审核任务状态
        MiniVideoReviewEntity entity = miniVideoReviewDao.selectByMiniVideoId(miniVideoId);
        if(entity != null && entity.getStatus().equals(MiniVideoReviewStatusEnum.REVIEWING.getValue())) {
            miniVideoReviewDao.updateReviewStatus(entity.getMiniVideoId(), MiniVideoReviewStatusEnum.DENY.getValue(),
                    reviewerName, info, new Date());
        }
        //日志
        insertReviewLog(miniVideoId, MiniVideoReviewStatusEnum.DENY.getValue(), reviewerName, info);
        //精选视频
        miniVideoService.updateReviewStatus(miniVideoId, MiniVideoStatusEnum.BANNED.getValue());
    }

    @Override
    public void addToReviewList(Long miniVideoId) {
        MiniVideoReviewEntity entity = new MiniVideoReviewEntity();
        entity.setMiniVideoId(miniVideoId);
        entity.setStatus(MiniVideoReviewStatusEnum.WAIT.getValue());
        entity.setCreateTime(new Date());
        miniVideoReviewDao.insert(entity);
    }

    @Override
    public void reviewBegin(Long miniVideoId, String reviewerName) {
        MiniVideoReviewEntity entity = miniVideoReviewDao.selectByMiniVideoId(miniVideoId);
        if(entity == null || !entity.getStatus().equals(MiniVideoReviewStatusEnum.WAIT.getValue())) {
            return;
        }
        miniVideoReviewDao.updateReviewStatus(entity.getMiniVideoId(), MiniVideoReviewStatusEnum.REVIEWING.getValue(),
                reviewerName, null, new Date());
        //日志
        insertReviewLog(miniVideoId, MiniVideoReviewStatusEnum.REVIEWING.getValue(), reviewerName, null);
    }

    @Override
    public void reviewGiveUp(Long miniVideoId, String reviewerName) {
        MiniVideoReviewEntity entity = miniVideoReviewDao.selectByMiniVideoId(miniVideoId);
        if(entity == null || !entity.getStatus().equals(MiniVideoReviewStatusEnum.REVIEWING.getValue())) {
            return;
        }
        miniVideoReviewDao.updateReviewStatus(entity.getMiniVideoId(), MiniVideoReviewStatusEnum.WAIT.getValue(),
                reviewerName, null, new Date());
        //日志
        insertReviewLog(miniVideoId, MiniVideoReviewStatusEnum.GIVEUPREVIEW.getValue(), reviewerName, null);
    }

    @Override
    public void insertReviewLog(Long miniVideoId, Byte status, String reviewerName, String info) {
        MiniVideoReviewLogEntity entity = new MiniVideoReviewLogEntity();
        entity.setMiniVideoId(miniVideoId);
        entity.setStatus(status);
        entity.setReviewerName(reviewerName);
        entity.setInfo(info);
        entity.setCreateTime(new Date());
        miniVideoReviewLogDao.insert(entity);
    }

    @Override
    public List<MiniVideoReviewLogEntity> getReviewLogList(Byte status, Date startTime, Date endTime, String reviewerName,
                                                           PagingInterface pagingInterface) {
        return miniVideoReviewLogDao.listForAdmin(status, startTime, endTime, reviewerName, pagingInterface.getOffset(),
                pagingInterface.getLimit());
    }

    @Override
    public Integer countReviewLog(Byte status, Date startTime, Date endTime, String reviewerName) {
       return miniVideoReviewLogDao.countForAdmin(status, startTime, endTime, reviewerName);
    }
}
