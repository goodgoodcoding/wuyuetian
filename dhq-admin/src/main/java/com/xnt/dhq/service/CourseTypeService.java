package com.xnt.dhq.service;

import com.xnt.dhq.model.CourseType;
import com.xnt.dhq.model.CourseTypeParam;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface CourseTypeService {
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(CourseTypeParam courseTypeParam);

    int delete(int id);

    int updateCourseType(int id, CourseTypeParam courseTypeParam);

    List<CourseType> listAllCourseType(Integer pageSize, Integer pageNum);

    int deleteCourseTypes(List<Integer> ids);

    CourseType getById(int id);

    List<CourseType> listCourseCategoryByType(String firstType,String secondType,String thirdType,int pageNum, int pageSize);
}
