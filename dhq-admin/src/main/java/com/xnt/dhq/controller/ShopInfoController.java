package com.xnt.dhq.controller;

import com.xnt.dhq.dto.CommonResult;
import com.xnt.dhq.dto.ShopInfoParam;
import com.xnt.dhq.model.ShopInfo;
import com.xnt.dhq.service.ShopInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "StoreInfoController", description = "门店基本信息管理")
@RequestMapping("/shopInfo")
public class ShopInfoController {
    @Resource
    private ShopInfoService shopInfoService;
    @ApiOperation("创建门店")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestBody ShopInfoParam shopInfoParam){
        int count = shopInfoService.create(shopInfoParam);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }

    }

    @ApiOperation("删除门店")
    @RequestMapping(value = "/deleteByID", method = RequestMethod.POST)
    @ResponseBody
    public Object deleteByID(@RequestBody Integer shopID){
        int count = shopInfoService.deleteByID(shopID);
        if (count > 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }
    @ApiOperation("批量删除门店")
    @RequestMapping(value = "/deleteByExamples", method = RequestMethod.GET)
    @ResponseBody
    public Object deleteByExamples(@RequestBody List<Integer> ids){
        int count = shopInfoService.deleteByExamples(ids);
        if (count > 0 || count==0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation("多条件查询")
    @RequestMapping(value = "/searchByMultiCondition",method = RequestMethod.GET)
    @ResponseBody
    public Object searchByMultiCondition(String shopName, String province, String city, String district,
                                         @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                         @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<ShopInfo> shopInfos = shopInfoService.list(shopName,province,city,district,pageSize,pageNum);
        if (shopInfos.size()>0 || shopInfos.size()==0){
            return new CommonResult().pageSuccess(shopInfos);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation("展示所有门店")
    @RequestMapping(value = "/showAllShop",method = RequestMethod.GET)
    @ResponseBody
    public Object searchAllShop(@RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                                @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        List<ShopInfo> shopInfos = shopInfoService.selectAll(pageSize, pageNum);
        if (shopInfos.size()>0 || shopInfos.size()==0){
            return new CommonResult().pageSuccess(shopInfos);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation("根据ID查找门店")
    @RequestMapping(value = "/searchShopByID",method = RequestMethod.GET)
    @ResponseBody
    public Object searchShopByID(Integer id){
        ShopInfo shopInfos = shopInfoService.selectByID(id);
        if(shopInfos != null){
            return new CommonResult().success(shopInfos);
        }
        else return new CommonResult().failed();
    }

    @ApiOperation("更新门店")
    @RequestMapping(value = "/update{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") int id, @RequestBody ShopInfoParam shopInfoParam){
        int count = shopInfoService.update(id,shopInfoParam);
        if (count > 0 || count == 0) {
            return new CommonResult().success(count);
        } else {
            return new CommonResult().failed();
        }
    }
}
