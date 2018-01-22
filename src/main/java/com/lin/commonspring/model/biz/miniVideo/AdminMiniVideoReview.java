package com.lin.commonspring.model.biz.miniVideo;

import java.util.Date;

public class AdminMiniVideoReview {

    private Long miniVideoId;
    private Byte status;
    private String reviewerName;
    private String info;
    private Date createTime;
    private Date updateTime;

    private MiniVideoForAdmin video;


    public Long getMiniVideoId() {
        return miniVideoId;
    }

    public void setMiniVideoId(Long miniVideoId) {
        this.miniVideoId = miniVideoId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public MiniVideoForAdmin getVideo() {
        return video;
    }

    public void setVideo(MiniVideoForAdmin video) {
        this.video = video;
    }
}

