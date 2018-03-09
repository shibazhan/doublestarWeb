package com.cn.doublestarWeb.domain;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String nickname;

    private Boolean isdelete;

    private String carLicense;

    private String position;

    private String photo;

    private Integer cancelNumber;

    private Integer tireNumber;

    private Integer thresholdLow;

    private Integer thresholdUp;

    private Integer temperatureLow;

    private Integer temperatureHigh;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Boolean getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }

    public String getCarLicense() {
        return carLicense;
    }

    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense == null ? null : carLicense.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getCancelNumber() {
        return cancelNumber;
    }

    public void setCancelNumber(Integer cancelNumber) {
        this.cancelNumber = cancelNumber;
    }

    public Integer getTireNumber() {
        return tireNumber;
    }

    public void setTireNumber(Integer tireNumber) {
        this.tireNumber = tireNumber;
    }

    public Integer getThresholdLow() {
        return thresholdLow;
    }

    public void setThresholdLow(Integer thresholdLow) {
        this.thresholdLow = thresholdLow;
    }

    public Integer getThresholdUp() {
        return thresholdUp;
    }

    public void setThresholdUp(Integer thresholdUp) {
        this.thresholdUp = thresholdUp;
    }

    public Integer getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(Integer temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public Integer getTemperatureHigh() {
        return temperatureHigh;
    }

    public void setTemperatureHigh(Integer temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }
}