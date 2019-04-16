package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dto.ShopDeviceParam;
import com.xnt.dhq.mapper.DhqDeviceMapper;
import com.xnt.dhq.mapper.DhqDeviceTypeMapper;
import com.xnt.dhq.mapper.ShopDeviceMapper;
import com.xnt.dhq.mapper.ShopInfoMapper;
import com.xnt.dhq.model.ShopDevice;
import com.xnt.dhq.model.ShopDeviceExample;
import com.xnt.dhq.service.ShopDeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShopDeviceServiceImpl implements ShopDeviceService {
    @Resource
    ShopInfoMapper shopInfoMapper;

    @Resource
    DhqDeviceTypeMapper dhqDeviceTypeMapper;

    @Resource
    DhqDeviceMapper dhqDeviceMapper;

    @Resource
    ShopDeviceMapper shopDeviceMapper;

    @Resource
    ShopDeviceParam shopDeviceParam;

    @Override
    public int create_shopDevice(ShopDeviceParam shopDeviceParam) {
        int column = shopDeviceMapper.insert(shopDeviceParam);
        return column;
    }

    @Override
    public int delete_shopDeviceByIDs(List<Integer> ids) {
        ShopDeviceExample shopDeviceExample= new ShopDeviceExample();
        shopDeviceExample.createCriteria().andShopDeviceIdIn(ids);
        return shopDeviceMapper.deleteByExample(shopDeviceExample);
    }

    @Override
    public int delete_shopDeviceByPK(Integer id) {
        int count = shopDeviceMapper.deleteByPrimaryKey(id);
        return count;
    }

    @Override
    public List<ShopDevice> searchByExamples() {
        return null;
    }

    @Override
    public List<ShopDevice> searchByShopIdAndDeviceId(String shopName,String first,String second,String third) {
        int shopId = shopInfoMapper.SearchShopIDByShopName(shopName);
        int deviceTypeId = dhqDeviceTypeMapper.searchTypeIDByThreeCategory(first,second,third);
        List<Integer> deviceIdList = dhqDeviceMapper.SearchDeviceIDByDeviceTypeID(deviceTypeId);
        List<ShopDevice> shopDeviceList = shopDeviceMapper.SearchByShopID(shopId);
        for (int i = 0; i < shopDeviceList.size(); i++){
            if (!deviceIdList.contains(shopDeviceList.get(i).getDeviceId())){
                shopDeviceList.remove(i);
                i--;
            }
        }
        return shopDeviceList;
    }

    @Override
    public List<ShopDevice> showAllShopDevice(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return shopDeviceMapper.selectAllShopDevice();
    }

    @Override
    public List<ShopDevice> searchByShopName(String shopName,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        int shopId = shopInfoMapper.SearchShopIDByShopName(shopName);
        return shopDeviceMapper.SearchByShopID(shopId);
    }

    @Override
    public int allocDeviceToShopByShopNameAndThreeType(String shopName, String first,
                                                       String second, String third,String deviceName,
                                                       ShopDeviceParam shopDeviceParam){
        int shopID = shopInfoMapper.SearchShopIDByShopName(shopName);
        int deviceTypeID = dhqDeviceTypeMapper.searchTypeIDByThreeCategory(first, second, third);
//        List<Integer> deviceID = dhqDeviceMapper.SearchDeviceIDByDeviceTypeID(deviceTypeID);
        int deviceID = dhqDeviceMapper.SearchDeviceIDByDeviceTypeIDAndName(deviceTypeID,deviceName);
        shopDeviceParam.setShopId(shopID);
        int count = 0;
        shopDeviceParam.setDeviceId(deviceID);
        count = shopDeviceMapper.insert(shopDeviceParam);
        return count;
    }

    @Override
    public int updateByExampleSelective(ShopDevice shopDevice, ShopDeviceExample shopDeviceExample) {
        int count = shopDeviceMapper.updateByExampleSelective(shopDevice,shopDeviceExample);
        return count;
    }

    @Override
    public List<ShopDeviceParam> showShopDeviceWithNames(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<ShopDevice> shopDevices = shopDeviceMapper.selectAllShopDevice();
        List<ShopDeviceParam> shopDevicesParams =new ArrayList<ShopDeviceParam>(shopDevices.size());
        for (int i = 0;i<shopDevices.size();i++) {
            shopDevicesParams.add(i,shopDeviceParam.add(shopDevices.get(i)));
            int shop_id = shopDevices.get(i).getShopId();
            int device_id = shopDevices.get(i).getDeviceId();
            String shopName = shopInfoMapper.getShopNameByShopID(shop_id);
            String shopDeviceName =dhqDeviceMapper.getDeviceNameByDeviceID(device_id);
            shopDevicesParams.get(i).setShopName(shopName);
            shopDevicesParams.get(i).setShopDeviceName(shopDeviceName);
        }
        return shopDevicesParams;
    }

    @Override
    public List<ShopDeviceParam> searchByShopNameWithNames(String shopName, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        int shopID = shopInfoMapper.SearchShopIDByShopName(shopName);
        List<ShopDevice> shopDevices = shopDeviceMapper.SearchByShopID(shopID);
        List<ShopDeviceParam> shopDevicesParams =new ArrayList<ShopDeviceParam>(shopDevices.size());
        for (int i = 0;i<shopDevices.size();i++){
            shopDevicesParams.add(i,shopDeviceParam.add(shopDevices.get(i)));
            int device_id = shopDevices.get(i).getDeviceId();
            String shopDeviceName =dhqDeviceMapper.getDeviceNameByDeviceID(device_id);
            shopDevicesParams.get(i).setShopName(shopName);
            shopDevicesParams.get(i).setShopDeviceName(shopDeviceName);
        }
        return shopDevicesParams;
    }

    @Override
    public List<ShopDeviceParam> searchByShopIdAndDeviceIdWithNames(String shopName, String first, String second, String third) {
        List<ShopDevice> shopDevices = this.searchByShopIdAndDeviceId(shopName, first, second, third);
        List<ShopDeviceParam> shopDevicesParams =new ArrayList<ShopDeviceParam>(shopDevices.size());
        for (int i = 0;i<shopDevices.size();i++){
            shopDevicesParams.add(i,shopDeviceParam.add(shopDevices.get(i)));
            int device_id = shopDevices.get(i).getDeviceId();
            String shopDeviceName =dhqDeviceMapper.getDeviceNameByDeviceID(device_id);
            shopDevicesParams.get(i).setShopName(shopName);
            shopDevicesParams.get(i).setShopDeviceName(shopDeviceName);
        }
        return shopDevicesParams;
    }

    @Override
    public ShopDevice searchByID(Integer id) {
        ShopDevice shopDevice = shopDeviceMapper.selectByPrimaryKey(id);
//        List<ShopDevice> shopDeviceList = new ArrayList<>();
//        shopDeviceList.add(shopDevice);
        return shopDevice;
    }
}
