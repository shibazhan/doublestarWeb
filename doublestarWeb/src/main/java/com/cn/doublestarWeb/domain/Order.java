package com.cn.doublestarWeb.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer id;

    private Date date;

    private Integer status;

    private String customerPhone;

    private String customerNickname;

    private Integer customerId;

    private String customerPosition;

    private BigDecimal customerLongitude;

    private BigDecimal customerLatitude;

    private Integer adminId;

    private String adminUsername;

    private String adminPhone;

    private String adminDescribe;

    private Integer rescueCarId;

    private String rescueCarNumber;

    private String tirenumber;

    private String rescueDescribe;

    private String dealDescribe;

    private String returnRecord;

    private String cancelRecord;

    private Integer rating;

    private String ratingInfo;

    private String note;

    private Integer returnStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerNickname() {
        return customerNickname;
    }

    public void setCustomerNickname(String customerNickname) {
        this.customerNickname = customerNickname == null ? null : customerNickname.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerPosition() {
        return customerPosition;
    }

    public void setCustomerPosition(String customerPosition) {
        this.customerPosition = customerPosition == null ? null : customerPosition.trim();
    }

    public BigDecimal getCustomerLongitude() {
        return customerLongitude;
    }

    public void setCustomerLongitude(BigDecimal customerLongitude) {
        this.customerLongitude = customerLongitude;
    }

    public BigDecimal getCustomerLatitude() {
        return customerLatitude;
    }

    public void setCustomerLatitude(BigDecimal customerLatitude) {
        this.customerLatitude = customerLatitude;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername == null ? null : adminUsername.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminDescribe() {
        return adminDescribe;
    }

    public void setAdminDescribe(String adminDescribe) {
        this.adminDescribe = adminDescribe == null ? null : adminDescribe.trim();
    }

    public Integer getRescueCarId() {
        return rescueCarId;
    }

    public void setRescueCarId(Integer rescueCarId) {
        this.rescueCarId = rescueCarId;
    }

    public String getRescueCarNumber() {
        return rescueCarNumber;
    }

    public void setRescueCarNumber(String rescueCarNumber) {
        this.rescueCarNumber = rescueCarNumber == null ? null : rescueCarNumber.trim();
    }

    public String getTirenumber() {
        return tirenumber;
    }

    public void setTirenumber(String tirenumber) {
        this.tirenumber = tirenumber == null ? null : tirenumber.trim();
    }

    public String getRescueDescribe() {
        return rescueDescribe;
    }

    public void setRescueDescribe(String rescueDescribe) {
        this.rescueDescribe = rescueDescribe == null ? null : rescueDescribe.trim();
    }

    public String getDealDescribe() {
        return dealDescribe;
    }

    public void setDealDescribe(String dealDescribe) {
        this.dealDescribe = dealDescribe == null ? null : dealDescribe.trim();
    }

    public String getReturnRecord() {
        return returnRecord;
    }

    public void setReturnRecord(String returnRecord) {
        this.returnRecord = returnRecord == null ? null : returnRecord.trim();
    }

    public String getCancelRecord() {
        return cancelRecord;
    }

    public void setCancelRecord(String cancelRecord) {
        this.cancelRecord = cancelRecord == null ? null : cancelRecord.trim();
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getRatingInfo() {
        return ratingInfo;
    }

    public void setRatingInfo(String ratingInfo) {
        this.ratingInfo = ratingInfo == null ? null : ratingInfo.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Integer returnStatus) {
        this.returnStatus = returnStatus;
    }
}