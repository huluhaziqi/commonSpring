package com.lin.commonspring.model.entity;

import java.util.Date;

public class PlaybackConcatEntity {
    private Long liveroomId;

    private String fileId;

    private String url;

    private String originUrl;

    private String mp410Url;

    private String mp420Url;

    private String mp430Url;

    private String mp440Url;

    private String hls10Url;

    private String hls20Url;

    private String hls30Url;

    private String hls40Url;

    private String flv10046Url;

    private String flv10047Url;

    private String flv10048Url;

    private String flv10049Url;

    private Integer duration;

    private Date createTime;

    private Date updateTime;

    public Long getLiveroomId() {
        return liveroomId;
    }

    public void setLiveroomId(Long liveroomId) {
        this.liveroomId = liveroomId;
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

    public String getHls10Url() {
        return hls10Url;
    }

    public void setHls10Url(String hls10Url) {
        this.hls10Url = hls10Url == null ? null : hls10Url.trim();
    }

    public String getHls20Url() {
        return hls20Url;
    }

    public void setHls20Url(String hls20Url) {
        this.hls20Url = hls20Url == null ? null : hls20Url.trim();
    }

    public String getHls30Url() {
        return hls30Url;
    }

    public void setHls30Url(String hls30Url) {
        this.hls30Url = hls30Url == null ? null : hls30Url.trim();
    }

    public String getHls40Url() {
        return hls40Url;
    }

    public void setHls40Url(String hls40Url) {
        this.hls40Url = hls40Url == null ? null : hls40Url.trim();
    }

    public String getFlv10046Url() {
        return flv10046Url;
    }

    public void setFlv10046Url(String flv10046Url) {
        this.flv10046Url = flv10046Url == null ? null : flv10046Url.trim();
    }

    public String getFlv10047Url() {
        return flv10047Url;
    }

    public void setFlv10047Url(String flv10047Url) {
        this.flv10047Url = flv10047Url == null ? null : flv10047Url.trim();
    }

    public String getFlv10048Url() {
        return flv10048Url;
    }

    public void setFlv10048Url(String flv10048Url) {
        this.flv10048Url = flv10048Url == null ? null : flv10048Url.trim();
    }

    public String getFlv10049Url() {
        return flv10049Url;
    }

    public void setFlv10049Url(String flv10049Url) {
        this.flv10049Url = flv10049Url == null ? null : flv10049Url.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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
}