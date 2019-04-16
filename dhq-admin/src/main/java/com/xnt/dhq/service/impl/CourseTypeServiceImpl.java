package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.mapper.CourseTypeMapper;
import com.xnt.dhq.model.CourseType;
import com.xnt.dhq.model.CourseTypeExample;
import com.xnt.dhq.model.CourseTypeParam;
import com.xnt.dhq.service.CourseTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CourseTypeServiceImpl implements CourseTypeService {
    @Autowired
    private CourseTypeMapper courseTypeMapper;

    @Override
    public int create(CourseTypeParam courseTypeParam) {
        CourseType courseType=courseTypeParam;
        if(courseTypeMapper.insert(courseType) > 0){
            return 1;
        }
        return 0;
    }

    @Override
    public int delete(int id) {
        return courseTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCourseType(int id, CourseTypeParam courseTypeParam) {
        CourseType courseType = new CourseType();
        BeanUtils.copyProperties(courseTypeParam,courseType);
        courseType.setId(id);
        return courseTypeMapper.updateByPrimaryKeySelective(courseType);
    }

    @Override
    public List<CourseType> listAllCourseType(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageSize,pageNum);
        return courseTypeMapper.selectByExample(new CourseTypeExample());
    }

    @Override
    public int deleteCourseTypes(List<Integer> ids) {
        CourseTypeExample courseTypeExample=new CourseTypeExample();
        courseTypeExample.createCriteria().andIdIn(ids);
        return courseTypeMapper.deleteByExample(courseTypeExample);
    }

    @Override
    public CourseType getById(int id) {
        return courseTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CourseType> listCourseCategoryByType(String firstType, String secondType, String thirdType, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        CourseTypeExample courseTypeExample = new CourseTypeExample();
        courseTypeExample.setOrderByClause("id desc");
        CourseTypeExample.Criteria criteria = courseTypeExample.createCriteria();
        if (!StringUtils.isEmpty(firstType)) {
            criteria.andFirstTypeLike("%" + firstType + "%");
        }
        if (!StringUtils.isEmpty(secondType)) {
            criteria.andSecondTypeLike("%" + secondType + "%");
        }
        if (!StringUtils.isEmpty(thirdType)) {
            criteria.andThirdTypeLike("%" + thirdType + "%");
        }
        return courseTypeMapper.selectByExample(courseTypeExample);
    }


}
