package com.xnt.dhq.controller;

import com.xnt.dhq.model.*;
import com.xnt.dhq.service.DeviceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by qingliu on 2019-03-19.
 * @apiNote  the is the api of device manage,include the
 * add/delete/find/edit operation.
 */

@Api(tags = "DeviceController", description = "设备管理")
@Controller
@RequestMapping("/device")
public class DeviceController {
    @Autowired
    private DeviceService deviceService;
    //hello

    @ApiOperation("添加设备")
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Object add(@RequestBody DeviceParam deviceParam, BindingResult bindingResult){
        int number = deviceService.create(deviceParam);
        if (number > 0){
            return new CommonResult().success(number);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("根据ID获取设备信息")
    @RequestMapping(path = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Object get(Integer id){
        if (id==null)  return new CommonResult().failed();
        else {
            DeviceQueryParam result = deviceService.getById(id);
            if (result != null) {
                return new CommonResult().success(result);
            } else return new CommonResult().failed();
        }
    }


    @ApiOperation("分页获取所有设备")
    @RequestMapping(path = "/getAll",method = RequestMethod.GET)
    @ResponseBody
    public Object getAll(@RequestParam(value="pageNum",defaultValue="1")Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize){
        return new CommonResult().pageSuccess(deviceService.selectDevice(pageNum,pageSize));
    }

    @ApiOperation(value = "删除设备")
    @GetMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam("id") int id) {
        System.out.println(id);
        int count = deviceService.delete(id);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation(value = "更新设备")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") int id,
                         @Validated @RequestBody DeviceParam deviceParam,
                         BindingResult result) {
        CommonResult commonResult;
        int count = deviceService.updateDevice(id, deviceParam);
        if (count == 1) {
            commonResult = new CommonResult().success(count);
        } else {
            commonResult = new CommonResult().failed();
        }
        return commonResult;
    }

    @ApiOperation(value = "按类别分页查询设备列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object getListBySort(String keyword1,String keyword2,String keyword3,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        System.out.println(keyword1);
        return new CommonResult().pageSuccess(deviceService.listDeviceBySort(keyword1,keyword2,keyword3,pageNum,pageSize));

    }

    @ApiOperation("获取一级类别")
    @RequestMapping(path = "/getFirstCategory",method = RequestMethod.GET)
    @ResponseBody
    public Object getFirstCategory( ){
        List<FirstCategoryParam> firstCategoryParamList=deviceService.getFirstType();
        if (firstCategoryParamList!=null){
            return new CommonResult().success(firstCategoryParamList);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation("获取二级类别")
    @RequestMapping(path = "/getSecondCategory",method = RequestMethod.GET)
    @ResponseBody
    public Object getSecondCategory( ){
        List<SecondCategoryParam> secondCategoryParamList=deviceService.getSecondType();
        if (secondCategoryParamList!=null){
            return new CommonResult().success(secondCategoryParamList);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation("获取三级类别")
    @RequestMapping(path="/getThirdCategory",method = RequestMethod.GET)
    @ResponseBody
    public Object getThirdCategory(){
        List<ThirdCategoryParam> thirdCategoryParamList=deviceService.getThirdType();
        if (thirdCategoryParamList!=null){
            return new CommonResult().success(thirdCategoryParamList);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation(value = "批量删除设备")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBatch(@RequestParam("ids") List<Integer> ids) {
        int count = deviceService.deleteDevices(ids);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }
}