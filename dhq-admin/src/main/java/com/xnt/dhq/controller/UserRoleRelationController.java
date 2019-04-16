package com.xnt.dhq.controller;

import com.xnt.dhq.model.CommonResult;
import com.xnt.dhq.service.UserRoleRelationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 后台用户角色关系管理
 * Created by Jialin on 2019/3/26.
 */
@Controller
@Api(tags = "UserRoleRelationController", description = "后台用户角色关系管理")
@RequestMapping("/user-role-relation")
public class UserRoleRelationController {

    @Autowired
    private UserRoleRelationService userRoleRelationService;

    @ApiOperation("批量删除用户角色关系")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam("ids") List<Long> ids) {
        int count = userRoleRelationService.delete(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

}
