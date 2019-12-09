package com.mmall.pojo;

import java.util.Date;

public class PayInfo {
    private Integer id;

    private Integer userId;

    private Long orderNo;

    private Integer payPlatform;

    private String platfromNumber;

    private String platfromStatus;

    private Date creatTime;

    private Date updateTime;

    public PayInfo(Integer id, Integer userId, Long orderNo, Integer payPlatform, String platfromNumber, String platfromStatus, Date creatTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.orderNo = orderNo;
        this.payPlatform = payPlatform;
        this.platfromNumber = platfromNumber;
        this.platfromStatus = platfromStatus;
        this.creatTime = creatTime;
        this.updateTime = updateTime;
    }

    public PayInfo() {
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

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPayPlatform() {
        return payPlatform;
    }

    public void setPayPlatform(Integer payPlatform) {
        this.payPlatform = payPlatform;
    }

    public String getPlatfromNumber() {
        return platfromNumber;
    }

    public void setPlatfromNumber(String platfromNumber) {
        this.platfromNumber = platfromNumber == null ? null : platfromNumber.trim();
    }

    public String getPlatfromStatus() {
        return platfromStatus;
    }

    public void setPlatfromStatus(String platfromStatus) {
        this.platfromStatus = platfromStatus == null ? null : platfromStatus.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}