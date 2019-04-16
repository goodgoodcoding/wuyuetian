package com.xnt.dhq.controller;

import com.xnt.dhq.model.CommonResult;
import com.xnt.dhq.model.ShopCourse;
import com.xnt.dhq.service.ShopCourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(tags = "ShopCourseController", description = "门店课程管理")
@Controller
@RequestMapping("/shopCourse")
public class ShopCourseController {
    @Autowired
    private ShopCourseService shopCourseService;

    @ApiOperation("添加门店课程")
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody ShopCourse shopCourse, BindingResult bindingResult) {
        int number = shopCourseService.create(shopCourse);
        if (number > 0) {
            return new CommonResult().success(number);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "更新门店课程")
    @RequestMapping(value = "/update/{shopId},{courseId}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("shopId") int shopId,@PathVariable("courseId") int courseId,
                         @Validated @RequestBody ShopCourse shopCourse,
                         BindingResult result) {
        CommonResult commonResult;
        int count = shopCourseService.updateShopCourse(shopId,courseId,shopCourse);
        if (count == 1) {
            commonResult = new CommonResult().success(count);
        } else {
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }

}
