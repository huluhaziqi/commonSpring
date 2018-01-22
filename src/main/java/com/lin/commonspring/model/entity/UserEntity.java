package com.lin.commonspring.model.entity;

import java.util.Date;

public class UserEntity {
    private Long id;

    private Byte status;

    private String name;

    private String title;

    private String job;

    private String contactMobile;

    private String contactWechat;

    private Byte showContactMobile;

    private Byte showContactWechat;

    private Long passedHostApplicationId;

    private Long pendingHostApplicationId;

    private Long totalAudienceCount;

    private Long totalLiveroomCount;

    private Long totalLikeCount;

    private Long totalBuildingCount;

    private Long totalActivitySubscribeCount;

    private Long totalLiveDuration;

    private Date applicationUpdateTime;

    private Integer provinceId;

    private Integer cityId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    public String getContactWechat() {
        return contactWechat;
    }

    public void setContactWechat(String contactWechat) {
        this.contactWechat = contactWechat == null ? null : contactWechat.trim();
    }

    public Byte getShowContactMobile() {
        return showContactMobile;
    }

    public void setShowContactMobile(Byte showContactMobile) {
        this.showContactMobile = showContactMobile;
    }

    public Byte getShowContactWechat() {
        return showContactWechat;
    }

    public void setShowContactWechat(Byte showContactWechat) {
        this.showContactWechat = showContactWechat;
    }

    public Long getPassedHostApplicationId() {
        return passedHostApplicationId;
    }

    public void setPassedHostApplicationId(Long passedHostApplicationId) {
        this.passedHostApplicationId = passedHostApplicationId;
    }

    public Long getPendingHostApplicationId() {
        return pendingHostApplicationId;
    }

    public void setPendingHostApplicationId(Long pendingHostApplicationId) {
        this.pendingHostApplicationId = pendingHostApplicationId;
    }

    public Long getTotalAudienceCount() {
        return totalAudienceCount;
    }

    public void setTotalAudienceCount(Long totalAudienceCount) {
        this.totalAudienceCount = totalAudienceCount;
    }

    public Long getTotalLiveroomCount() {
        return totalLiveroomCount;
    }

    public void setTotalLiveroomCount(Long totalLiveroomCount) {
        this.totalLiveroomCount = totalLiveroomCount;
    }

    public Long getTotalLikeCount() {
        return totalLikeCount;
    }

    public void setTotalLikeCount(Long totalLikeCount) {
        this.totalLikeCount = totalLikeCount;
    }

    public Long getTotalBuildingCount() {
        return totalBuildingCount;
    }

    public void setTotalBuildingCount(Long totalBuildingCount) {
        this.totalBuildingCount = totalBuildingCount;
    }

    public Long getTotalActivitySubscribeCount() {
        return totalActivitySubscribeCount;
    }

    public void setTotalActivitySubscribeCount(Long totalActivitySubscribeCount) {
        this.totalActivitySubscribeCount = totalActivitySubscribeCount;
    }

    public Long getTotalLiveDuration() {
        return totalLiveDuration;
    }

    public void setTotalLiveDuration(Long totalLiveDuration) {
        this.totalLiveDuration = totalLiveDuration;
    }

    public Date getApplicationUpdateTime() {
        return applicationUpdateTime;
    }

    public void setApplicationUpdateTime(Date applicationUpdateTime) {
        this.applicationUpdateTime = applicationUpdateTime;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}