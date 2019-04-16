package com.xnt.dhq.controller;

import com.xnt.dhq.model.CommonResult;
import com.xnt.dhq.model.ContentType;
import com.xnt.dhq.service.ContentTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台内容类型管理
 * Created by Jialin on 2019/4/3.
 */
@Api(tags = "ContentTypeController", description = "内容类型管理")
@Controller
@RequestMapping("/contenType")
public class ContentTypeController {

    @Autowired
    private ContentTypeService contentTypeService;

    @ApiOperation(value = "添加内容类别")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestBody ContentType contentType) {
        int count = contentTypeService.create(contentType);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改内容类别")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Long id, @RequestBody ContentType contentType) {
        int count = contentTypeService.update(id,contentType);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("根据id批量删除内容类别")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam("ids") List<Long> ids) {
        int count = contentTypeService.delete(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation(value = "按类型分页获取内容类型列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object getList(String firstCategoryName, String  secondCategoryName, String thirdCategoryName,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        return new CommonResult().pageSuccess(contentTypeService.listContentType(firstCategoryName,secondCategoryName,thirdCategoryName,pageNum,pageSize));
    }


}
