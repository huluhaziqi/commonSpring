package com.lin.commonspring.model.entity;

import java.util.Date;

public class MiniVideoRecordEntity {
    private Long miniVideoId;

    private String fileId;

    private String url;

    private String originUrl;

    private String mp410Url;

    private String mp420Url;

    private String mp430Url;

    private String mp440Url;

    private Date createTime;

    private Date updateTime;

    private Long duration;

    public Long getMiniVideoId() {
        return miniVideoId;
    }

    public void setMiniVideoId(Long miniVideoId) {
        this.miniVideoId = miniVideoId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getOriginUrl() {
        return originUrl;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl == null ? null : originUrl.trim();
    }

    public String getMp410Url() {
        return mp410Url;
    }

    public void setMp410Url(String mp410Url) {
        this.mp410Url = mp410Url == null ? null : mp410Url.trim();
    }

    public String getMp420Url() {
        return mp420Url;
    }

    public void setMp420Url(String mp420Url) {
        this.mp420Url = mp420Url == null ? null : mp420Url.trim();
    }

    public String getMp430Url() {
        return mp430Url;
    }

    public void setMp430Url(String mp430Url) {
        this.mp430Url = mp430Url == null ? null : mp430Url.trim();
    }

    public String getMp440Url() {
        return mp440Url;
    }

    public void setMp440Url(String mp440Url) {
        this.mp440Url = mp440Url == null ? null : mp440Url.trim();
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

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}