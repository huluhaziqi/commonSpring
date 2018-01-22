package com.lin.commonspring.model.Response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QCloudVODVideoAddSimpleClipTaskResponse {
    private Integer code;

    private String message;

    private String vodTaskId;

    public Integer getCode() { return code; }

    public void setCode(Integer code) { this.code = code; }

    public String getMessage() { return message; }

    public void setMessage(String message) { this.message = message; }

    public String getVodTaskId() { return vodTaskId; }

    public void setVodTaskId(String vodTaskId) { this.vodTaskId = vodTaskId; }
}