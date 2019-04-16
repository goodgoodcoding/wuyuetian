package com.xnt.dhq.dao;

import com.xnt.dhq.model.DeviceQueryParam;
import com.xnt.dhq.model.FirstCategoryParam;
import com.xnt.dhq.model.SecondCategoryParam;
import com.xnt.dhq.model.ThirdCategoryParam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by afu on 2019-03-19.
 */
@Repository
public interface DeviceDao {
    List<DeviceQueryParam> selectDevice();
    DeviceQueryParam selectDeviceById(int id);
    List<DeviceQueryParam> selectDeviceByType2(@Param("keyword1") String keyword1, @Param("keyword2") String keyword2, @Param("keyword3") String keyword3);
    int countByDeviceTypeId(@Param("typeId")int typeId);
    List<FirstCategoryParam> selectFisrtCategory();
    List<SecondCategoryParam> selectSecondCategory();
    List<ThirdCategoryParam> selectThirdCategory();

}