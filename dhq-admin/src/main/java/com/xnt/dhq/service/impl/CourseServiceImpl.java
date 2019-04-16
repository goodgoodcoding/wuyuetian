package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dao.CourseDao;
import com.xnt.dhq.mapper.CourseMapper;
import com.xnt.dhq.model.*;
import com.xnt.dhq.service.CourseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private CourseDao courseDao;

    @Override
    public int create(CourseParam courseParam) {
        Course course = courseParam;
        if(courseMapper.insert(course) > 0){
            return 1;
        }
        return 0;
    }

    @Override
    public int delete(int id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteCourses(List<Integer> ids) {
        CourseExample courseExample = new CourseExample();
        courseExample.createCriteria().andIdIn(ids);
        return courseMapper.deleteByExample(courseExample);
    }

    @Override
    public int updateCourse(int id, CourseParam courseParam) {
        Course course = new Course();
        BeanUtils.copyProperties(courseParam,course);
        course.setId(id);
        return courseMapper.updateByPrimaryKeySelective(course);
    }

    @Override
    public List<CourseQueryParam> selectCourse(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return courseDao.selectCourse();
    }

    @Override
    public CourseQueryParam getById(int id) {
        CourseQueryParam courseQueryParam = courseDao.selectCourseById(id);
        if (courseQueryParam!= null){
            return courseQueryParam;
        }
        return null;
    }

    @Override
    public List<CourseQueryParam> listCourseBySort(String firstType, String secondType, String thirdType, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return courseDao.selectCourseByType(firstType,secondType,thirdType);
    }

    @Override
    public List<FirstCourseType> getFirstCourseType() {
        return courseDao.selectFirstCourseType();
    }

    @Override
    public List<SecondCourseType> getSecondCourseType() {
        return courseDao.selectSecondCourseType();
    }

    @Override
    public List<ThirdCourseType> getThirdCourseType() {
        return courseDao.selectThirdCourseType();
    }

    @Override
    public int selectCountByTypeId(int typeId) {
        return courseDao.countByCourseTypeId(typeId);
    }

    @Override
    public int selectCountByTypeIds(List<Integer> ids) {
        return courseDao.countByCourseTypeIds(ids);
    }
}
