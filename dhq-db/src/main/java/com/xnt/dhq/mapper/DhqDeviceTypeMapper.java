package com.xnt.dhq.mapper;

import com.xnt.dhq.model.DhqDeviceType;
import com.xnt.dhq.model.DhqDeviceTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DhqDeviceTypeMapper {
    int countByExample(DhqDeviceTypeExample example);

    int deleteByExample(DhqDeviceTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DhqDeviceType record);

    int insertSelective(DhqDeviceType record);

    List<DhqDeviceType> selectByExample(DhqDeviceTypeExample example);

    DhqDeviceType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DhqDeviceType record, @Param("example") DhqDeviceTypeExample example);

    int updateByExample(@Param("record") DhqDeviceType record, @Param("example") DhqDeviceTypeExample example);

    int updateByPrimaryKeySelective(DhqDeviceType record);

    int updateByPrimaryKey(DhqDeviceType record);

//    @Select("select * from dhq_device_type")
    Integer searchTypeIDByThreeCategory(@Param("first") String first,@Param("second") String second,@Param("third") String third);
}