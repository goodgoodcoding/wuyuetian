package com.xnt.dhq.service;

import java.util.List;

/**
 * 后台用户角色关系管理Service
 * Created by Jialin on 2019/3/26.
 */
public interface UserRoleRelationService {

    /**
     * 批量删除角色
     */
    int delete(List<Long> ids);
}
