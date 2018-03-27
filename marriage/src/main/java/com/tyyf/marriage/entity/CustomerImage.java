package com.tyyf.marriage.entity;

import java.util.Date;

public class CustomerImage {
    private String uuidCustomer;

    private String imageUrl;

    private Integer showSwitch;

    private String createPersion;

    private Date createTime;

    private String deleteType;

    public String getUuidCustomer() {
        return uuidCustomer;
    }

    public void setUuidCustomer(String uuidCustomer) {
        this.uuidCustomer = uuidCustomer == null ? null : uuidCustomer.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Integer getShowSwitch() {
        return showSwitch;
    }

    public void setShowSwitch(Integer showSwitch) {
        this.showSwitch = showSwitch;
    }

    public String getCreatePersion() {
        return createPersion;
    }

    public void setCreatePersion(String createPersion) {
        this.createPersion = createPersion == null ? null : createPersion.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDeleteType() {
        return deleteType;
    }

    public void setDeleteType(String deleteType) {
        this.deleteType = deleteType == null ? null : deleteType.trim();
    }
}