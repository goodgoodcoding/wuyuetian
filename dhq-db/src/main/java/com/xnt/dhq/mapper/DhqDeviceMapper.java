package com.xnt.dhq.mapper;

import com.xnt.dhq.model.DhqDevice;
import com.xnt.dhq.model.DhqDeviceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface DhqDeviceMapper {
    int countByExample(DhqDeviceExample example);

    int deleteByExample(DhqDeviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DhqDevice record);

    int insertSelective(DhqDevice record);

    List<DhqDevice> selectByExample(DhqDeviceExample example);

    DhqDevice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DhqDevice record, @Param("example") DhqDeviceExample example);

    int updateByExample(@Param("record") DhqDevice record, @Param("example") DhqDeviceExample example);

    int updateByPrimaryKeySelective(DhqDevice record);

    int updateByPrimaryKey(DhqDevice record);

    List<Integer> SearchDeviceIDByDeviceTypeID(@Param("device_type_id") Integer device_type_id);

    int SearchDeviceIDByDeviceTypeIDAndName(@Param("device_type_id") Integer device_type_id,@Param("device_name") String device_name);

    String getDeviceNameByDeviceID(@Param("device_id") Integer device_id);
}