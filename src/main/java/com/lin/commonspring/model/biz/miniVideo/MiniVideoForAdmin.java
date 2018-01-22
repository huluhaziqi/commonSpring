package com.lin.commonspring.model.biz.miniVideo;

import com.lin.commonspring.model.biz.BuildingBrief;
import com.lin.commonspring.model.biz.account.User;
import com.lin.commonspring.model.entity.MiniVideoEntity;
import com.lin.commonspring.model.entity.MiniVideoRecordEntity;
import com.lin.commonspring.model.entity.VideoTagEntity;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.List;

public class MiniVideoForAdmin {

    //MiniVideoEntity
    private Long id;
    private Byte type;
    private Long liveroomId;
    private Long hostId;
    private Byte status;
    private String title;
    private String info;
    private String imgPath;
    private Integer cityId;
    private Date createTime;
    private Date updateTime;

    //extra
    private User host;
    private String imgUrl;
    private String cityStr;
    private MiniVideoRecordEntity record;
    private List<BuildingBrief> buildings;    //楼盘
    private List<VideoTagEntity> tagEntities;

    public MiniVideoForAdmin() {
    }

    public MiniVideoForAdmin(MiniVideoEntity entity) {
        if (entity != null) {
            BeanUtils.copyProperties(entity, this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Long getLiveroomId() {
        return liveroomId;
    }

    public void setLiveroomId(Long liveroomId) {
        this.liveroomId = liveroomId;
    }

    public Long getHostId() {
        return hostId;
    }

    public void setHostId(Long hostId) {
        this.hostId = hostId;
    }

    public User getHost() {
        return host;
    }

    public void setHost(User host) {
        this.host = host;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityStr() {
        return cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
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

    public List<BuildingBrief> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<BuildingBrief> buildings) {
        this.buildings = buildings;
    }

    public List<VideoTagEntity> getTagEntities() {
        return tagEntities;
    }

    public void setTagEntities(List<VideoTagEntity> tagEntities) {
        this.tagEntities = tagEntities;
    }

    public MiniVideoRecordEntity getRecord() {
        return record;
    }

    public void setRecord(MiniVideoRecordEntity record) {
        this.record = record;
    }
}
