package com.xnt.dhq.dao;

import com.xnt.dhq.model.Permission;
import com.xnt.dhq.model.Role;
import com.xnt.dhq.model.UserRoleRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * Created by Jialin on 2019/3/25.
 */

@Repository
public interface UserRoleRelationDao {

    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UserRoleRelation> userRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<Role> getRoleList(@Param("userId") Long userId);


    /**
     * 获取用户所有角色权限
     */
    List<Permission> getRolePermissionList(@Param("userId") Long userId);
}
