package com.xnt.dhq.dto;

import com.xnt.dhq.model.ShopDevice;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ShopDeviceParam extends ShopDevice {
    String shopDeviceName;
    String shopName;

    public ShopDeviceParam add(ShopDevice shopDevice){
        this.setDeviceId(shopDevice.getDeviceId());
        this.setShopId(shopDevice.getShopId());
        this.setChargeidOfShopDevice(shopDevice.getChargeidOfShopDevice());
        this.setSerialNumber(shopDevice.getSerialNumber());
        this.setShopDeviceRemark(shopDevice.getShopDeviceRemark());
        this.setShopDeviceStatus(shopDevice.getShopDeviceStatus());
        this.setShopDeviceId(shopDevice.getShopDeviceId());
        return this;
    }
    public String getShopDeviceName() {
        return shopDeviceName;
    }

    public void setShopDeviceName(String shopDeviceName) {
        this.shopDeviceName = shopDeviceName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
