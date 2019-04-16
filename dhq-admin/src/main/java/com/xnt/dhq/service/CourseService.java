package com.xnt.dhq.service;

import com.xnt.dhq.model.*;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CourseService {
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(CourseParam courseParam);

    int delete(int id);

    int deleteCourses(List<Integer> ids);

    int updateCourse(int id, CourseParam courseParam);

    List<CourseQueryParam> selectCourse(int pageNum, int pageSize);

    CourseQueryParam getById(int id);

    List<CourseQueryParam> listCourseBySort(String firstType,String secondType,String thirdType,int pageNum,int pageSize);

    List<FirstCourseType>  getFirstCourseType();

    List<SecondCourseType> getSecondCourseType();

    List<ThirdCourseType>  getThirdCourseType();

    int selectCountByTypeId(int typeId);

    int selectCountByTypeIds(List<Integer> ids);
}
