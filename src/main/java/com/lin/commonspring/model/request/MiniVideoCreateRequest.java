package com.lin.commonspring.model.request;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class MiniVideoCreateRequest  {

    @NotNull(message = "直播间id不能为空")
    private Long liveroomId;

    @NotNull(message = "标题不能为空")
    @Size(min = 4, max = 40, message = "标题长度应在4-40字之内")
    private String title;

    @NotNull(message = "城市不能为空")
    private Integer cityId;

    @NotNull(message = "startTimeOffset不能为空")
    private Integer startTimeOffset;

    @NotNull(message = "endTimeOffset不能为空")
    private Integer endTimeOffset;

    @NotEmpty(message = "标签不能为空")
    private List<Integer> tagIds;

    private List<String> buildingIds;

    private Integer buildingType;

    public Long getLiveroomId() {
        return liveroomId;
    }

    public void setLiveroomId(Long liveroomId) {
        this.liveroomId = liveroomId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<Integer> tagIds) {
        this.tagIds = tagIds;
    }

    public List<String> getBuildingIds() {
        return buildingIds;
    }

    public void setBuildingIds(List<String> buildingIds) {
        this.buildingIds = buildingIds;
    }

    public Integer getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(Integer buildingType) {
        this.buildingType = buildingType;
    }

    public Integer getStartTimeOffset() {
        return startTimeOffset;
    }

    public void setStartTimeOffset(Integer startTimeOffset) {
        this.startTimeOffset = startTimeOffset;
    }

    public Integer getEndTimeOffset() {
        return endTimeOffset;
    }

    public void setEndTimeOffset(Integer endTimeOffset) {
        this.endTimeOffset = endTimeOffset;
    }
}
