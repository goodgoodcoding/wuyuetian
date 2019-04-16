package com.xnt.dhq.model;

import java.io.Serializable;

public class ShopInfo implements Serializable {
    private Integer shopId;

    private Integer managerId;

    private String shopName;

    private String shopType;

    private String shopDesc;

    private String shopLocationProvince;

    private String shopLocationCity;

    private String shopLocationDistrict;

    private String shopLocationDetail;

    private String shopPhone;

    private Integer shopSize;

    private Integer employeeNum;

    private static final long serialVersionUID = 1L;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public String getShopLocationProvince() {
        return shopLocationProvince;
    }

    public void setShopLocationProvince(String shopLocationProvince) {
        this.shopLocationProvince = shopLocationProvince;
    }

    public String getShopLocationCity() {
        return shopLocationCity;
    }

    public void setShopLocationCity(String shopLocationCity) {
        this.shopLocationCity = shopLocationCity;
    }

    public String getShopLocationDistrict() {
        return shopLocationDistrict;
    }

    public void setShopLocationDistrict(String shopLocationDistrict) {
        this.shopLocationDistrict = shopLocationDistrict;
    }

    public String getShopLocationDetail() {
        return shopLocationDetail;
    }

    public void setShopLocationDetail(String shopLocationDetail) {
        this.shopLocationDetail = shopLocationDetail;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public Integer getShopSize() {
        return shopSize;
    }

    public void setShopSize(Integer shopSize) {
        this.shopSize = shopSize;
    }

    public Integer getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Integer employeeNum) {
        this.employeeNum = employeeNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopId=").append(shopId);
        sb.append(", managerId=").append(managerId);
        sb.append(", shopName=").append(shopName);
        sb.append(", shopType=").append(shopType);
        sb.append(", shopDesc=").append(shopDesc);
        sb.append(", shopLocationProvince=").append(shopLocationProvince);
        sb.append(", shopLocationCity=").append(shopLocationCity);
        sb.append(", shopLocationDistrict=").append(shopLocationDistrict);
        sb.append(", shopLocationDetail=").append(shopLocationDetail);
        sb.append(", shopPhone=").append(shopPhone);
        sb.append(", shopSize=").append(shopSize);
        sb.append(", employeeNum=").append(employeeNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}