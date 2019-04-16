package com.xnt.dhq.service;

import com.xnt.dhq.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台管理员Service
 * Created by Jialin on 2019/3/25.
 */
public interface DhqUserService {
    /**
     * 根据用户名获取后台管理员
     */
    DhqUser getUserByUsername(String username);

    /**
     * 注册功能
     */
    DhqUser register(DhqUserParam dhqUserParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 刷新token的功能
     * @param oldToken 旧的token
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     */
    DhqUser getItem(Long id);

    /**
     * 修改指定用户信息
     */
    int update(Long id, DhqUser user);

    /**
     * 删除指定用户
     */
    int delete(Long id);

    /**
     * 修改用户角色关系
     */
    @Transactional
    int updateRole(Long userId, List<Long> roleIds);

    /**
     * 获取用户角色
     */
    List<Role> getRoleList(Long adminId);

    /**
     * 获取用户角色权限
     */
    List<Permission> getRolePermissionList(Long adminId);

    /**
     * 根据用户名分页查询用户
     */
    List<DhqUserParam> list(String username, Integer pageNum, Integer pageSize);
}
