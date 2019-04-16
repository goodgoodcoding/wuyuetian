package com.xnt.dhq.mapper;

import com.xnt.dhq.model.CourseType;
import com.xnt.dhq.model.CourseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseTypeMapper {
    int countByExample(CourseTypeExample example);

    int deleteByExample(CourseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CourseType record);

    int insertSelective(CourseType record);

    List<CourseType> selectByExample(CourseTypeExample example);

    CourseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByExample(@Param("record") CourseType record, @Param("example") CourseTypeExample example);

    int updateByPrimaryKeySelective(CourseType record);

    int updateByPrimaryKey(CourseType record);
}