package com.xnt.dhq.controller;


import com.xnt.dhq.dto.CommonResult;
import com.xnt.dhq.dto.ScaleParam;
import com.xnt.dhq.model.Scale;
import com.xnt.dhq.service.ScaleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags ="ScaleManagement",description = "评测量表管理")
@RequestMapping("/scaleManagement")
public class ScaleController {
    @Resource
    private ScaleService scaleService;
    @ApiOperation("增加量表")
    @RequestMapping(value = "/createscale",method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestBody ScaleParam scaleParam){
        int count=scaleService.createScale(scaleParam);
        if(count>0){
            return new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }
    @ApiOperation("分页获取全部量表信息")
    @RequestMapping(value = "/listallscale",method = RequestMethod.GET)
    @ResponseBody
    public Object ListAllScale(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                               @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize){
        List<Scale> scaleList=scaleService.listAllscale(pageNum,pageSize);
        if(scaleList.size()>0){
            return new CommonResult().pageSuccess(scaleList);
        }else {
            return new CommonResult().failed();
        }
    }

    @ApiOperation("更新量表信息")
    @RequestMapping(value = "/updatescale",method = RequestMethod.POST)
    @ResponseBody
    public Object updatescale(@RequestBody ScaleParam scaleParam, BindingResult bindingResult){
        int count=scaleService.updatescale(scaleParam);
        if(count>0){
            return  new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("删除量表信息")
    @RequestMapping(value = "/deletescale/{id}",method = RequestMethod.POST)
    @ResponseBody
    public Object deletescale(int scaleid){
        int count=scaleService.deletescale(scaleid);
        if(count>0){
            return  new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

    @ApiOperation("批量删除量表信息")
    @RequestMapping(value = "/deletescale",method = RequestMethod.POST)
    @ResponseBody
    public Object deletescale(@RequestParam("scaleids") List<Integer> scaleids){
        int count=scaleService.deletescale(scaleids);
        if(count>0){
            return  new CommonResult().success(count);
        }else{
            return new CommonResult().failed();
        }
    }

}
