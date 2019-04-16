package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dao.DeviceDao;
import com.xnt.dhq.mapper.DeviceMapper;
import com.xnt.dhq.mapper.DhqDeviceMapper;
import com.xnt.dhq.model.*;
import com.xnt.dhq.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qingliu on 2019-03-20.
 *
 */

@Service
public class DeviceServiceImpl implements DeviceService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeviceServiceImpl.class);


    @Resource
    DhqDeviceMapper dhqDeviceMapper;

    @Resource
    DeviceDao deviceDao;

    @Override
    public int create(DeviceParam deviceParam) {
        DhqDevice dhqDevice = deviceParam;
        if(dhqDeviceMapper.insert(dhqDevice) > 0){
            return 1;
        }
        return 0;
    }

    @Override
    public List<Device> getList(String keywords) {

        return null;
    }

    @Override
    public DeviceQueryParam getById(int id) {
        DeviceQueryParam deviceQueryParam = deviceDao.selectDeviceById(id);
        if (deviceQueryParam!= null){
            return deviceQueryParam;
        }
        return null;
    }

    @Override
    public List<DeviceQueryParam> selectDevice(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return deviceDao.selectDevice();
    }

    @Override
    public int delete(int id) {
        return dhqDeviceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateDevice (int id, DeviceParam deviceParam) {
        DhqDevice dhqDevice = new DhqDevice();
        BeanUtils.copyProperties(deviceParam, dhqDevice);
        dhqDevice.setId(id);
        return dhqDeviceMapper.updateByPrimaryKeySelective(dhqDevice);
    }

    @Override
    public List<DeviceQueryParam> listDeviceBySort(String keyword1,String keyword2,String keyword3,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        System.out.println(keyword1);
        return deviceDao.selectDeviceByType2(keyword1,keyword2,keyword3);
    }

    @Override
    public int selectCountByTypeId(int typeId) {
        System.out.println(deviceDao.countByDeviceTypeId(typeId));
        return deviceDao.countByDeviceTypeId(typeId);
    }

    @Override
    public List<FirstCategoryParam> getFirstType() {
        return deviceDao.selectFisrtCategory();
    }

    @Override
    public List<SecondCategoryParam> getSecondType() {
        return deviceDao.selectSecondCategory();
    }

    @Override
    public List<ThirdCategoryParam> getThirdType() {
        return deviceDao.selectThirdCategory();
    }

    @Override
    public int deleteDevices(List<Integer> ids) {
        DhqDeviceExample dhqDeviceExample = new DhqDeviceExample();
        dhqDeviceExample.createCriteria().andIdIn(ids);
        return dhqDeviceMapper.deleteByExample(dhqDeviceExample);
    }


    @Override
    public int SearchDeviceIDByDeviceTypeIDAndName(Integer type_id, String device_name) {
        int deviceID = dhqDeviceMapper.SearchDeviceIDByDeviceTypeIDAndName(type_id, device_name);
        return deviceID;
    }

    @Override
    public List<Integer> SearchDeviceIDByDeviceTypeID(Integer type_id) {
        List<Integer> deviceIds = dhqDeviceMapper.SearchDeviceIDByDeviceTypeID(type_id);
        return deviceIds;
    }

}
