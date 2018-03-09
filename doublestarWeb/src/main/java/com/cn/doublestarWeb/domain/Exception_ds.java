package com.cn.doublestarWeb.domain;

import java.util.Date;

public class Exception_ds {
    private Integer id;

    private Integer userId;

    private String tireInfo;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTireInfo() {
        return tireInfo;
    }

    public void setTireInfo(String tireInfo) {
        this.tireInfo = tireInfo == null ? null : tireInfo.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}