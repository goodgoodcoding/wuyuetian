package com.xnt.dhq.dao;

import org.springframework.stereotype.Repository;


import com.xnt.dhq.model.Permission;
import com.xnt.dhq.model.RolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台角色与权限管理自定义Dao
 * Created by Jialin on 2019/3/26.
 */

@Repository
public interface RolePermissionRelationDao {

    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list") List<RolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<Permission> selectPermissionListByRoleId(Long roleId);
}
