package com.xnt.dhq.controller;


import com.xnt.dhq.dto.CommonResult;
import com.xnt.dhq.dto.ShopDeviceParam;
import com.xnt.dhq.model.ShopDevice;
import com.xnt.dhq.model.ShopDeviceExample;
import com.xnt.dhq.service.DeviceService;
import com.xnt.dhq.service.DeviceTypeService;
import com.xnt.dhq.service.ShopDeviceService;
import com.xnt.dhq.service.ShopInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "ShopDeviceController", description = "门店设备管理")
@RequestMapping("/shopDevice")
public class ShopDeviceController {
    @Resource
    ShopDeviceService shopDeviceService;
    @Resource
    DeviceTypeService deviceTypeService;
    @Resource
    ShopInfoService shopInfoService;
    @Resource
    DeviceService deviceService;

    @ApiOperation("增加门店设备")
    @RequestMapping(value = "/allot",method = RequestMethod.POST)
    @ResponseBody
    public Object create_shopDevice(@RequestBody ShopDeviceParam shopDeviceParam){
        int count = shopDeviceService.create_shopDevice(shopDeviceParam);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation("批量删除门店设备")
    @RequestMapping(value = "/deleteByExamples",method = RequestMethod.GET)
    @ResponseBody
    public Object delete_shopDevice(@RequestBody List<Integer> ids){
        int count = shopDeviceService.delete_shopDeviceByIDs(ids);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation("按ID删除门店设备")
    @RequestMapping(value = "/deleteByPrimarykey",method = RequestMethod.GET)
    @ResponseBody
    public Object delete_shopDeviceByID(@RequestBody Integer id){
        int count = shopDeviceService.delete_shopDeviceByPK(id);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

//    @ApiOperation("由三级类别查typeID")
//    @RequestMapping(value = "/getIDSByThreeCategory",method = RequestMethod.POST)
//    @ResponseBody
//    public void getID(String first, String second, String third){
//        System.out.println(deviceTypeService.getIDSByThreeCategory
//                (first,second,third));
//    }
//    @ApiOperation("由shopName查ShopID")
//    @RequestMapping(value = "/getShopIDByShopName",method = RequestMethod.POST)
//    @ResponseBody
//    public void getID(String shop_name){
//        System.out.println(shopInfoService.getShopIDByShopName(shop_name));
//    }
//
//    @ApiOperation("由device_type_id查deviceID")
//    @RequestMapping(value = "/getDeviceIDByDevice_type_id",method = RequestMethod.POST)
//    @ResponseBody
//    public void getID(Integer device_type_id){
//        System.out.println(deviceService.SearchDeviceIDByDeviceTypeID(device_type_id));
//    }

    @ApiOperation("展示所有门店设备增加门店名称和设备名称")
    @RequestMapping(value = "/showAllShopDeviceADDShopNameAndDeviceName",method = RequestMethod.GET)
    @ResponseBody
    public Object showAllShopDeviceWithNames(@RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                    @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<ShopDeviceParam> shopDeviceParams = shopDeviceService.showShopDeviceWithNames(pageSize, pageNum);
        if(shopDeviceParams.size()>0 || shopDeviceParams.size()==0){
            return new CommonResult().pageSuccess(shopDeviceParams);
        }else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation("输入shopName展示shopDevice,增加了增加门店名称和设备名称")
    @RequestMapping(value = "/showShopDeviceByShopNameADDShopNameAndDeviceName",method = RequestMethod.GET)
    @ResponseBody
    public Object showShopDeviceByShopNameWithNames(String shopName,
                                           @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<ShopDeviceParam> shopDeviceParams =  shopDeviceService.searchByShopNameWithNames(shopName, pageSize, pageNum);
        if(shopDeviceParams.size()>0 || shopDeviceParams.size()==0){
            return new CommonResult().pageSuccess(shopDeviceParams);
        }else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation("输入shopName,三级类别展示shopDevice,增加了增加门店名称和设备名称")
    @RequestMapping(value = "/getShopDeviceByCategoryAndShopNameWithNames",method = RequestMethod.GET)
    @ResponseBody
    public Object showShopDeviceByShopNameWithNames(String shopName, String firstCategory, String secondCategory, String thirdCategory){
        List<ShopDeviceParam> shopDeviceParams =  shopDeviceService.searchByShopIdAndDeviceIdWithNames(shopName, firstCategory, secondCategory, thirdCategory);
        if(shopDeviceParams.size()>0 || shopDeviceParams.size()==0){
            return new CommonResult().pageSuccess(shopDeviceParams);
        }else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation("通过shopName,三级类别为门店分配设备")
    @RequestMapping(value = "/allocDeviceByShopNameAndThreeCategory",method = RequestMethod.POST)
    @ResponseBody
    public Object allocDeviceByShopNameAndThreeCategory(String shopName,String firstCategory, String secondCategory, String thirdCategory,String deviceName,
                                                     @RequestBody ShopDeviceParam shopDeviceParam){
        int count =  shopDeviceService.allocDeviceToShopByShopNameAndThreeType(shopName, firstCategory, secondCategory, thirdCategory,deviceName,shopDeviceParam);
        if (count > 0){
            return new CommonResult().success(count);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation("根据ID查找门店设备")
    @RequestMapping(value = "/searchShopByID",method = RequestMethod.GET)
    @ResponseBody
    public Object searchShopByID(Integer id){
        ShopDevice shopDevices = shopDeviceService.searchByID(id);
        if (shopDevices != null){
            return new CommonResult().success(shopDevices);
        }
        else return new CommonResult().failed();
    }
}
