package com.xnt.dhq.controller;

import com.xnt.dhq.model.CommonResult;
import com.xnt.dhq.model.CourseType;
import com.xnt.dhq.model.CourseTypeParam;
import com.xnt.dhq.service.CourseService;
import com.xnt.dhq.service.CourseTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "CourseTypeController", description = "课程类型管理")
@Controller
@RequestMapping("/courseType")
public class CourseTypeController {
    @Resource
    private CourseTypeService courseTypeService;
    @Autowired
    private CourseService courseService;

    @ApiOperation("添加课程类型")
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody CourseTypeParam courseTypeParam, BindingResult bindingResult) {
        int number = courseTypeService.create(courseTypeParam);
        if (number > 0) {
            return new CommonResult().success(number);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "删除课程类型")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam(value = "id",required = true) int id) {
        int countType = courseService.selectCountByTypeId(id);
        if (countType > 0) {
            return new CommonResult().failed();
        } else {
            int count = courseTypeService.delete(id);
            if (count > 0) {
                return new CommonResult().success(count);
            } else {
                return new CommonResult().failed();
            }

        }
    }

    @ApiOperation(value = "更新课程类型")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") int id,
                         @Validated @RequestBody CourseTypeParam courseTypeParam,
                         BindingResult result) {
        CommonResult commonResult;
        int count = courseTypeService.updateCourseType(id, courseTypeParam);
        if (count == 1) {
            commonResult = new CommonResult().success(count);
        } else {
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }

    @ApiOperation(value = "分页获取全部课程类型列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Object getList(CourseType courseType, @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        return new CommonResult().pageSuccess(courseTypeService.listAllCourseType(pageNum,pageSize));
    }

    @ApiOperation(value = "批量删除课程类型")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBatch(@RequestParam(value = "ids",required = true) List<Integer> ids) {
        int countTypes = courseService.selectCountByTypeIds(ids);
        if (countTypes > 0) {
            return new CommonResult().failed();
        } else {
            int count = courseTypeService.deleteCourseTypes(ids);
            if (count > 0) {
                return new CommonResult().success(count);
            } else {
                return new CommonResult().failed();
            }
        }
    }
    @ApiOperation("根据课程类型ID获取设备类型")
    @RequestMapping(path = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Object get(int id){
        CourseType result = courseTypeService.getById(id);
        if(result!=null) {
            return new CommonResult().success(result);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation(value = "按课程类别分页模糊获取课程列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object getList(String firstType,String secondType,String thirdType,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return new CommonResult().pageSuccess(courseTypeService.listCourseCategoryByType(firstType,secondType,thirdType,pageNum,pageSize));
    }
}
