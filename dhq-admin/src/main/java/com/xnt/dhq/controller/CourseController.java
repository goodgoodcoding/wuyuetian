package com.xnt.dhq.controller;

import com.xnt.dhq.model.*;
import com.xnt.dhq.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "CourseController", description = "课程管理")
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @ApiOperation("添加课程")
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody CourseParam courseParam, BindingResult bindingResult){
        int number = courseService.create(courseParam);
        if (number > 0){
            return new CommonResult().success(number);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "删除课程")
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@RequestParam(value = "id",required = true) int id) {
        int count = courseService.delete(id);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "批量删除课程")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBatch(@RequestParam(value = "ids",required = true) List<Integer> ids) {
        int count = courseService.deleteCourses(ids);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "更新课程")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") int id,
                         @Validated @RequestBody CourseParam courseParam,
                         BindingResult result) {
        CommonResult commonResult;
        int count = courseService.updateCourse(id,courseParam);
        if (count == 1) {
            commonResult = new CommonResult().success(count);
        } else {
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }

    @ApiOperation("分页获取所有课程")
    @RequestMapping(path = "/getAll",method = RequestMethod.GET)
    @ResponseBody
    public Object getAll(@RequestParam(value="pageNum",defaultValue="1")Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize){
        return new CommonResult().pageSuccess(courseService.selectCourse(pageNum,pageSize));
    }

    @ApiOperation("根据ID获取课程信息")
    @RequestMapping(path = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Object get(int id){
        CourseQueryParam result = courseService.getById(id);
        if(result!=null) {
            return new CommonResult().success(result);
        }
        else return new CommonResult().failed();
    }

//    @ApiOperation(value = "按课程类别分页查询课程信息")
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    @ResponseBody
//    public Object getListBySort(@RequestParam(value="firstType") String firstType,@RequestParam(value="secondType") String secondType,@RequestParam(value="thirdType") String thirdType,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
//                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
//        return new CommonResult().pageSuccess(courseService.listCourseBySort(firstType,secondType,thirdType,pageNum,pageSize));
//
//    }

    @ApiOperation(value = "按课程类别分页查询课程信息")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object getListBySort(String firstType,String secondType,String thirdType,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return new CommonResult().pageSuccess(courseService.listCourseBySort(firstType,secondType,thirdType,pageNum,pageSize));

    }

    @ApiOperation("获取一级课程类别")
    @RequestMapping(path = "/getFirstType",method = RequestMethod.GET)
    @ResponseBody
    public Object getFirstType( ){
        List<FirstCourseType> firstCourseTypeList=courseService.getFirstCourseType();
        if (firstCourseTypeList!=null){
            return new CommonResult().success(firstCourseTypeList);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation("获取二级课程类别")
    @RequestMapping(path = "/getSecondType",method = RequestMethod.GET)
    @ResponseBody
    public Object getSecondType( ){
        List<SecondCourseType> secondCourseTypeList=courseService.getSecondCourseType();
        if (secondCourseTypeList!=null){
            return new CommonResult().success(secondCourseTypeList);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation("获取三级课程类别")
    @RequestMapping(path = "/getThirdType",method = RequestMethod.GET)
    @ResponseBody
    public Object getThirdCategory( ){
        List<ThirdCourseType> thirdCourseTypeList=courseService.getThirdCourseType();
        if (thirdCourseTypeList!=null){
            return new CommonResult().success(thirdCourseTypeList);
        }
        else return new CommonResult().failed();
    }
}
