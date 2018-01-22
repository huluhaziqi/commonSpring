package com.lin.commonspring.model.biz;


public class BuildingBrief {
    private long pid;
    private String projName;
    private String projDesc;
    private String projPhotoUrl;

    private Boolean isConcern;
    private String webPageUrl;

    private String showPriceDesc;   //价格说明
    private String priceDesc;   //价格描述
    private String projAddress;     //地址
    private String districtName;    //区域


    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public String getProjDesc() {
        return projDesc;
    }

    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }

    public String getProjPhotoUrl() {
        return projPhotoUrl;
    }

    public void setProjPhotoUrl(String projPhotoUrl) {
        this.projPhotoUrl = projPhotoUrl;
    }

    public Boolean getIsConcern() {
        return isConcern;
    }

    public void setIsConcern(Boolean isConcern) {
        this.isConcern = isConcern;
    }

    public String getWebPageUrl() {
        return webPageUrl;
    }

    public void setWebPageUrl(String webPageUrl) {
        this.webPageUrl = webPageUrl;
    }

    public String getShowPriceDesc() {
        return showPriceDesc;
    }

    public void setShowPriceDesc(String showPriceDesc) {
        this.showPriceDesc = showPriceDesc;
    }

    public String getPriceDesc() {
        return priceDesc;
    }

    public void setPriceDesc(String priceDesc) {
        this.priceDesc = priceDesc;
    }

    public String getProjAddress() {
        return projAddress;
    }

    public void setProjAddress(String projAddress) {
        this.projAddress = projAddress;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Boolean getConcern() {
        return isConcern;
    }

    public void setConcern(Boolean concern) {
        isConcern = concern;
    }

}
