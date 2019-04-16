package com.xnt.dhq.service;

import com.xnt.dhq.model.Permission;
import com.xnt.dhq.model.PermissionNode;

import java.util.List;

/**
 * 后台权限管理Service
 * Created by Jialin on 2019/3/26.
 */
public interface PermissionService {

    /**
     * 添加权限
     */
    int create(Permission permission);

    /**
     * 修改权限
     */
    int update(Long id,Permission permission);

    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);

    /**
     * 以层级结构返回所有权限
     */
    List<PermissionNode> treeList();

    /**
     * 获取所有权限
     */
    List<Permission> list();
}
