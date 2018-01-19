package com.lin.commonspring.model.entity;

import java.util.Date;

public class MiniVideoCutRecordEntity {
    private Long id;

    private Long liveroomId;

    private Long miniVideoId;

    private String vodTaskId;

    private String originFileId;

    private String newFileId;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLiveroomId() {
        return liveroomId;
    }

    public void setLiveroomId(Long liveroomId) {
        this.liveroomId = liveroomId;
    }

    public Long getMiniVideoId() {
        return miniVideoId;
    }

    public void setMiniVideoId(Long miniVideoId) {
        this.miniVideoId = miniVideoId;
    }

    public String getVodTaskId() {
        return vodTaskId;
    }

    public void setVodTaskId(String vodTaskId) {
        this.vodTaskId = vodTaskId == null ? null : vodTaskId.trim();
    }

    public String getOriginFileId() {
        return originFileId;
    }

    public void setOriginFileId(String originFileId) {
        this.originFileId = originFileId == null ? null : originFileId.trim();
    }

    public String getNewFileId() {
        return newFileId;
    }

    public void setNewFileId(String newFileId) {
        this.newFileId = newFileId == null ? null : newFileId.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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