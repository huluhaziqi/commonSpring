package com.lin.commonspring.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CityView {

    @JsonProperty("cityId")
    private Integer cityId;

    @JsonProperty("cityName")
    private String cityName;

    @JsonProperty("cityPrefix")
    private String cityPrefix;

    @JsonProperty("citySuffix")
    private String citySuffix;

    public CityView() {
    }

    public CityView(Integer cityId, String cityName, String cityPrefix, String citySuffix) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.cityPrefix = cityPrefix;
        this.citySuffix = citySuffix;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityPrefix() {
        return cityPrefix;
    }

    public void setCityPrefix(String cityPrefix) {
        this.cityPrefix = cityPrefix;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCitySuffix() {
        return citySuffix;
    }

    public void setCitySuffix(String citySuffix) {
        this.citySuffix = citySuffix;
    }
}

