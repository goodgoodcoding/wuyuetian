package com.xnt.dhq.service;

import com.xnt.dhq.dto.ShopDeviceParam;
import com.xnt.dhq.model.ShopDevice;
import com.xnt.dhq.model.ShopDeviceExample;

import java.util.List;

public interface ShopDeviceService {
    int create_shopDevice(ShopDeviceParam shopDeviceParam);

    int delete_shopDeviceByIDs(List<Integer> ids);

    int delete_shopDeviceByPK(Integer id);

    List<ShopDevice> searchByExamples();

    List<ShopDevice> searchByShopIdAndDeviceId(String shopName,String first,String second,String third);

    List<ShopDevice> showAllShopDevice(Integer pageNum,Integer pageSize);

    List<ShopDevice> searchByShopName(String shopName,Integer pageNum, Integer pageSize);

    int allocDeviceToShopByShopNameAndThreeType(String shopName,String first, String second,String third,String device, ShopDeviceParam shopDeviceParam);

    int updateByExampleSelective(ShopDevice shopDevice, ShopDeviceExample shopDeviceExample);

    //返回shop_device表，同时还返回shop_name和device_name
    List<ShopDeviceParam> showShopDeviceWithNames(Integer pageNum,Integer pageSize);

    //返回shop_device表，同时还返回shop_name和device_name
    List<ShopDeviceParam> searchByShopNameWithNames(String shopName,Integer pageNum, Integer pageSize);

    List<ShopDeviceParam> searchByShopIdAndDeviceIdWithNames(String shopName,String first,String second,String third);

    ShopDevice searchByID(Integer id);
}
