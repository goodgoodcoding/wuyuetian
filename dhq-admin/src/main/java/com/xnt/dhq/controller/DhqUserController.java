package com.xnt.dhq.controller;

import com.xnt.dhq.model.*;
import com.xnt.dhq.service.DhqUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 后台用户管理
 * Created by Jialin on 2019/3/25.
 */
@Controller
@Api(tags = "DhqUserController", description = "后台用户管理")
@RequestMapping("/user")
public class DhqUserController {
    @Autowired
    private DhqUserService dhqUserService;
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @ApiOperation(value = "用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Object register(@RequestBody DhqUserParam dhqUserParam, BindingResult result) {
        DhqUser dhqUser = dhqUserService.register(dhqUserParam);
        if (dhqUser == null) {
            new CommonResult().failed();
        }
        return new CommonResult().success(dhqUser);
    }

    @ApiOperation(value = "用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Object login(@RequestBody DhqUserLoginParam dhqUserLoginParam, BindingResult result) {
        String token = dhqUserService.login(dhqUserLoginParam.getUsername(), dhqUserLoginParam.getPassword());
        if (token == null) {
            return new CommonResult().validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return new CommonResult().success(tokenMap);
    }

    @ApiOperation(value = "获取当前登录用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public Object getUserInfo(Principal principal) {
        String  username = principal.getName();
        DhqUser dhqUser = dhqUserService.getUserByUsername(username);
        Map<String, Object> data = new HashMap<>();
        data.put("username", dhqUser.getUsername());
        data.put("roles", new String[]{"role_2"});
        return new CommonResult().success(data);
    }

    @ApiOperation(value = "登出功能")
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    @ResponseBody
    public Object logout() {
        return new CommonResult().success(null);
    }

    @ApiOperation("获取指定用户信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Object getItem(@PathVariable Long id){
        DhqUser dhqUser = dhqUserService.getItem(id);
        return new CommonResult().success(dhqUser);
    }

    @ApiOperation("更新指定用户信息")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Long id,@RequestBody DhqUser dhqUser){
        int count = dhqUserService.update(id,dhqUser);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("删除指定用户信息")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@PathVariable Long id){
        int count = dhqUserService.delete(id);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("给用户分配角色")
    @RequestMapping(value = "/role/update",method = RequestMethod.POST)
    @ResponseBody
    public Object updateRole(@RequestParam("userId") Long userId,
                             @RequestParam("roleIds") List<Long> roleIds){
        int count = dhqUserService.updateRole(userId,roleIds);
        if(count>=0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("获取指定用户的角色")
    @RequestMapping(value = "/role/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public Object getRoleList(@PathVariable Long userId){
        List<Role> roleList = dhqUserService.getRoleList(userId);
        return new CommonResult().success(roleList);
    }

    @ApiOperation("获取用户所有角色权限")
    @RequestMapping(value = "/permission/{userId}",method = RequestMethod.GET)
    @ResponseBody
    public Object getPermissionList(@PathVariable Long userId){
        List<Permission> permissionList = dhqUserService.getRolePermissionList(userId);
        return new CommonResult().success(permissionList);
    }

    @ApiOperation("根据用户名分页查询所有用户")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(String username,@RequestParam(value="pageNum",defaultValue="1")Integer pageNum,@RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize) {
        List<DhqUserParam> dhqUserList = dhqUserService.list(username,pageNum,pageSize);
        return new CommonResult().pageSuccess(dhqUserList);
    }
}
