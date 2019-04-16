package com.xnt.dhq.mapper;

import com.xnt.dhq.model.Scale;
import com.xnt.dhq.model.ScaleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScaleMapper {
    int countByExample(ScaleExample example);

    int deleteByExample(ScaleExample example);

    int deleteByPrimaryKey(Integer scaleId);

    int insert(Scale record);

    int insertSelective(Scale record);

    List<Scale> selectByExampleWithBLOBs(ScaleExample example);

    List<Scale> selectByExample(ScaleExample example);

    Scale selectByPrimaryKey(Integer scaleId);

    int updateByExampleSelective(@Param("record") Scale record, @Param("example") ScaleExample example);

    int updateByExampleWithBLOBs(@Param("record") Scale record, @Param("example") ScaleExample example);

    int updateByExample(@Param("record") Scale record, @Param("example") ScaleExample example);

    int updateByPrimaryKeySelective(Scale record);

    int updateByPrimaryKeyWithBLOBs(Scale record);

    int updateByPrimaryKey(Scale record);
}