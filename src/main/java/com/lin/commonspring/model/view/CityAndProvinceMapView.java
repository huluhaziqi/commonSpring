package com.lin.commonspring.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CityAndProvinceMapView {

    @JsonProperty("cityMap")
    private Map<Integer, CityView> cityMap;

    @JsonProperty("provinceMap")
    private Map<Integer, ProvinceView> provinceMap;

    public CityAndProvinceMapView() {
    }

    public CityAndProvinceMapView(Map<Integer, CityView> cityMap, Map<Integer, ProvinceView> provinceMap) {
        this.cityMap = cityMap;
        this.provinceMap = provinceMap;
    }

    public Map<Integer, CityView> getCityMap() {
        return cityMap;
    }

    public void setCityMap(Map<Integer, CityView> cityMap) {
        this.cityMap = cityMap;
    }

    public Map<Integer, ProvinceView> getProvinceMap() {
        return provinceMap;
    }

    public void setProvinceMap(Map<Integer, ProvinceView> provinceMap) {
        this.provinceMap = provinceMap;
    }
}
