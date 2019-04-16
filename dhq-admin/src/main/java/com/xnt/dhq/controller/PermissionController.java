package com.xnt.dhq.controller;

import com.xnt.dhq.model.CommonResult;
import com.xnt.dhq.model.Permission;
import com.xnt.dhq.model.PermissionNode;
import com.xnt.dhq.service.PermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户权限管理
 * Created by Jialin on 2019/3/26.
 */
@Controller
@Api(tags = "PermissionController", description = "后台用户权限管理")
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;
    @ApiOperation("添加权限")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestBody Permission permission) {
        int count = permissionService.create(permission);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改权限")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Long id, @RequestBody Permission permission) {
        int count = permissionService.update(id,permission);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("根据id批量删除权限")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam("ids") List<Long> ids) {
        int count = permissionService.delete(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

   /* @ApiOperation("以层级结构返回所有权限")
    @RequestMapping(value = "/treeList", method = RequestMethod.GET)
    @ResponseBody
    public Object treeList() {
        List<PermissionNode> permissionNodeList = permissionService.treeList();
        return new CommonResult().success(permissionNodeList);
    }*/

    @ApiOperation("获取所有权限列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list() {
        List<Permission> permissionList = permissionService.list();
        return new CommonResult().success(permissionList);
    }
}
