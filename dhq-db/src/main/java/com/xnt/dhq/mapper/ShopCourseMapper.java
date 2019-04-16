package com.xnt.dhq.mapper;

import com.xnt.dhq.model.ShopCourse;
import com.xnt.dhq.model.ShopCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCourseMapper {
    int countByExample(ShopCourseExample example);

    int deleteByExample(ShopCourseExample example);

    int deleteByPrimaryKey(@Param("shopId") Integer shopId, @Param("courseId") Integer courseId);

    int insert(ShopCourse record);

    int insertSelective(ShopCourse record);

    List<ShopCourse> selectByExample(ShopCourseExample example);

    ShopCourse selectByPrimaryKey(@Param("shopId") Integer shopId, @Param("courseId") Integer courseId);

    int updateByExampleSelective(@Param("record") ShopCourse record, @Param("example") ShopCourseExample example);

    int updateByExample(@Param("record") ShopCourse record, @Param("example") ShopCourseExample example);

    int updateByPrimaryKeySelective(ShopCourse record);

    int updateByPrimaryKey(ShopCourse record);
}