package com.lin.commonspring.model.biz.account;

import java.util.Date;

public class SsoUserInfo {

    private String username;

    private String showname;

    private Integer type;

    private Date timestamp;

    public SsoUserInfo(String username, String showname, Integer type, Date timestamp) {
        this.username = username;
        this.showname = showname;
        this.type = type;
        this.timestamp = timestamp;
    }

    public SsoUserInfo() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getShowname() {
        return showname;
    }

    public void setShowname(String showname) {
        this.showname = showname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
