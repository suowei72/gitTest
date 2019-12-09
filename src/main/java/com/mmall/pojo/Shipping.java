package com.mmall.pojo;

import java.util.Date;

public class Shipping {
    private Integer id;

    private Integer userId;

    private String receiverName;

    private String recriverPhone;

    private String recriverMobile;

    private String recriverProvince;

    private String recriverCity;

    private String revriverDistrict;

    private String revriverAddress;

    private String revriverZip;

    private Date createTime;

    private Date updateTime;

    public Shipping(Integer id, Integer userId, String receiverName, String recriverPhone, String recriverMobile, String recriverProvince, String recriverCity, String revriverDistrict, String revriverAddress, String revriverZip, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.receiverName = receiverName;
        this.recriverPhone = recriverPhone;
        this.recriverMobile = recriverMobile;
        this.recriverProvince = recriverProvince;
        this.recriverCity = recriverCity;
        this.revriverDistrict = revriverDistrict;
        this.revriverAddress = revriverAddress;
        this.revriverZip = revriverZip;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Shipping() {
        super();
    }

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

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    public String getRecriverPhone() {
        return recriverPhone;
    }

    public void setRecriverPhone(String recriverPhone) {
        this.recriverPhone = recriverPhone == null ? null : recriverPhone.trim();
    }

    public String getRecriverMobile() {
        return recriverMobile;
    }

    public void setRecriverMobile(String recriverMobile) {
        this.recriverMobile = recriverMobile == null ? null : recriverMobile.trim();
    }

    public String getRecriverProvince() {
        return recriverProvince;
    }

    public void setRecriverProvince(String recriverProvince) {
        this.recriverProvince = recriverProvince == null ? null : recriverProvince.trim();
    }

    public String getRecriverCity() {
        return recriverCity;
    }

    public void setRecriverCity(String recriverCity) {
        this.recriverCity = recriverCity == null ? null : recriverCity.trim();
    }

    public String getRevriverDistrict() {
        return revriverDistrict;
    }

    public void setRevriverDistrict(String revriverDistrict) {
        this.revriverDistrict = revriverDistrict == null ? null : revriverDistrict.trim();
    }

    public String getRevriverAddress() {
        return revriverAddress;
    }

    public void setRevriverAddress(String revriverAddress) {
        this.revriverAddress = revriverAddress == null ? null : revriverAddress.trim();
    }

    public String getRevriverZip() {
        return revriverZip;
    }

    public void setRevriverZip(String revriverZip) {
        this.revriverZip = revriverZip == null ? null : revriverZip.trim();
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
}