package com.xnt.dhq.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Component
public class ShopDevice implements Serializable {
    private Integer shopDeviceId;

    private Integer shopId;

    private Integer deviceId;

    private String shopDeviceStatus;

    private Integer chargeidOfShopDevice;

    private String shopDeviceRemark;

    private Integer serialNumber;

    private static final long serialVersionUID = 1L;

    public Integer getShopDeviceId() {
        return shopDeviceId;
    }

    public void setShopDeviceId(Integer shopDeviceId) {
        this.shopDeviceId = shopDeviceId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getShopDeviceStatus() {
        return shopDeviceStatus;
    }

    public void setShopDeviceStatus(String shopDeviceStatus) {
        this.shopDeviceStatus = shopDeviceStatus;
    }

    public Integer getChargeidOfShopDevice() {
        return chargeidOfShopDevice;
    }

    public void setChargeidOfShopDevice(Integer chargeidOfShopDevice) {
        this.chargeidOfShopDevice = chargeidOfShopDevice;
    }

    public String getShopDeviceRemark() {
        return shopDeviceRemark;
    }

    public void setShopDeviceRemark(String shopDeviceRemark) {
        this.shopDeviceRemark = shopDeviceRemark;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", shopDeviceId=").append(shopDeviceId);
        sb.append(", shopId=").append(shopId);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", shopDeviceStatus=").append(shopDeviceStatus);
        sb.append(", chargeidOfShopDevice=").append(chargeidOfShopDevice);
        sb.append(", shopDeviceRemark=").append(shopDeviceRemark);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


}