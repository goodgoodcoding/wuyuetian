package com.xnt.dhq.dao;

import com.xnt.dhq.model.Role;

import java.util.List;

public interface RoleDao {

    List<Role> selectRoleListByUserId(Long userId);
}
