package com.lin.commonspring.model.entity;

import java.util.Date;

public class MiniVideoBuildingEntity {
    private Long id;

    private Long miniVideoId;

    private String buildingId;

    private Byte status;

    private Date updateTime;

    private Byte buildingType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMiniVideoId() {
        return miniVideoId;
    }

    public void setMiniVideoId(Long miniVideoId) {
        this.miniVideoId = miniVideoId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId == null ? null : buildingId.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(Byte buildingType) {
        this.buildingType = buildingType;
    }
}