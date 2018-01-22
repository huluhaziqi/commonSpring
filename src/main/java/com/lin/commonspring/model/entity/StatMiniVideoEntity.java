package com.lin.commonspring.model.entity;

public class StatMiniVideoEntity {
    private Long miniVideoId;

    private Long totalVv;

    private Long appVv;

    private Long wapVv;

    private Long pcVv;

    private Long robotVv;

    private Long likeCount;


    public StatMiniVideoEntity() {
    }

    public StatMiniVideoEntity(long miniVideoId, boolean isInit) {
        this.miniVideoId = miniVideoId;
        if (isInit) {
            this.totalVv = 0L;
            this.appVv = 0L;
            this.wapVv = 0L;
            this.pcVv = 0L;
            this.robotVv = 0L;
            this.likeCount = 0L;
        }

    }

    public Long getMiniVideoId() {
        return miniVideoId;
    }

    public void setMiniVideoId(Long miniVideoId) {
        this.miniVideoId = miniVideoId;
    }

    public Long getTotalVv() {
        return totalVv;
    }

    public void setTotalVv(Long totalVv) {
        this.totalVv = totalVv;
    }

    public Long getAppVv() {
        return appVv;
    }

    public void setAppVv(Long appVv) {
        this.appVv = appVv;
    }

    public Long getWapVv() {
        return wapVv;
    }

    public void setWapVv(Long wapVv) {
        this.wapVv = wapVv;
    }

    public Long getPcVv() {
        return pcVv;
    }

    public void setPcVv(Long pcVv) {
        this.pcVv = pcVv;
    }

    public Long getRobotVv() {
        return robotVv;
    }

    public void setRobotVv(Long robotVv) {
        this.robotVv = robotVv;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }
}