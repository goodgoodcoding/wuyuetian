package com.xnt.dhq.controller;

import com.xnt.dhq.model.CommonResult;
import com.xnt.dhq.model.Permission;
import com.xnt.dhq.model.Role;
import com.xnt.dhq.model.RoleParam;
import com.xnt.dhq.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户角色管理
 * Created by Jialin on 2019/3/25.
 */
@Controller
@Api(tags = "RoleController", description = "后台用户角色管理")
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ApiOperation("添加角色")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestBody Role role) {
        int count = roleService.create(role);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改角色")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Long id, @RequestBody Role role) {
        int count = roleService.update(id,role);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量删除角色")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam("ids") List<Long> ids) {
        int count = roleService.delete(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("获取所有角色")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public Object list(String roleName,@RequestParam(value="pageNum",defaultValue="1")Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize){
        List<RoleParam> roleParamList = roleService.list(roleName,pageNum,pageSize);
        return new CommonResult().pageSuccess(roleParamList);
    }

    @ApiOperation("获取相应角色权限")
    @RequestMapping(value = "/permission/{roleId}", method = RequestMethod.GET)
    @ResponseBody
    public Object getPermissionList(@PathVariable Long roleId) {
        List<Permission> permissionList =roleService.getPermissionList(roleId);
        return new CommonResult().success(permissionList);
    }

    @ApiOperation("修改角色权限")
    @RequestMapping(value = "/permission/update", method = RequestMethod.POST)
    @ResponseBody
    public Object updatePermission(@RequestParam Long roleId,
                                   @RequestParam("permissionIds") List<Long> permissionIds) {
        int count = roleService.updatePermission(roleId,permissionIds);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }
}
