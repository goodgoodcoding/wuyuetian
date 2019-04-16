package com.xnt.dhq.service;

import com.xnt.dhq.model.Permission;
import com.xnt.dhq.model.Role;
import com.xnt.dhq.model.RoleParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 后台角色管理Service
 * Created by Jialin on 2019/3/25.
 */
public interface RoleService {

    /**
     * 添加角色
     */
    int create(Role role);

    /**
     * 修改角色信息
     */
    int update(Long id, Role role);

    /**
     * 批量删除角色
     */
    int delete(List<Long> ids);

    /**
     * 获取角色列表
     */
    List<RoleParam> list(String roleName,Integer pageNum, Integer pageSize);

    /**
     * 获取指定角色权限
     */
    List<Permission> getPermissionList(Long roleId);

    /**
     * 修改指定角色的权限
     */
    @Transactional
    int updatePermission(Long roleId, List<Long> permissionIds);

}
