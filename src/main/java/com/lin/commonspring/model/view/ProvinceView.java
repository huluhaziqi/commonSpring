package com.lin.commonspring.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProvinceView {

    @JsonProperty("provinceName")
    private String provinceName;

    @JsonProperty("provinceId")
    private Integer provinceId;

    public ProvinceView() {
    }

    public ProvinceView(String provinceName, Integer provinceId) {
        this.provinceName = provinceName;
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
}

