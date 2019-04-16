package com.xnt.dhq.service;

import com.xnt.dhq.model.*;
import com.xnt.dhq.model.Device;
import com.xnt.dhq.model.DeviceQueryParam;
//import io.swagger.models.auth.In;
import com.xnt.dhq.model.*;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by qingliu on 2019-03-19.
 * @apiNote this is the device manage service
 */

public interface DeviceService {

    /*插入设备*/
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(DeviceParam deviceParam);

    List<Device> getList(String keywords);

    DeviceQueryParam getById(int id);

    List<DeviceQueryParam> selectDevice(int pageNum,int pageSize);

    int delete(int id);

    int updateDevice(int id, DeviceParam deviceParam);

    List<DeviceQueryParam> listDeviceBySort(String keyword1,String keyword2,String keyword3,int pageNum,int pageSize);

    int selectCountByTypeId(int typeId);

    List<FirstCategoryParam> getFirstType();

    List<SecondCategoryParam> getSecondType();

    List<ThirdCategoryParam> getThirdType();

    int deleteDevices(List<Integer> ids);


    List<Integer> SearchDeviceIDByDeviceTypeID(Integer type_id);

    int SearchDeviceIDByDeviceTypeIDAndName(Integer type_id,String device_name);
}
