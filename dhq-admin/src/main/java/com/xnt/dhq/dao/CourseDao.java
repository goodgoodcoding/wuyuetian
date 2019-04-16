package com.xnt.dhq.dao;

import com.xnt.dhq.model.CourseQueryParam;
import com.xnt.dhq.model.FirstCourseType;
import com.xnt.dhq.model.SecondCourseType;
import com.xnt.dhq.model.ThirdCourseType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseDao {
    List<CourseQueryParam> selectCourse();
    CourseQueryParam selectCourseById(int id);
    List<CourseQueryParam> selectCourseByType(@Param("firstType") String firstType, @Param("secondType") String secondType, @Param("thirdType") String thirdType);
    List<FirstCourseType> selectFirstCourseType();
    List<SecondCourseType> selectSecondCourseType();
    List<ThirdCourseType> selectThirdCourseType();
    int countByCourseTypeId(int typeId);
    int countByCourseTypeIds(@Param("ids") List<Integer> ids);
    //List<CourseQueryParam> selectCourseByType(String firstType, String secondType,String thirdType);
}
