package com.xnt.dhq.dao;


import com.xnt.dhq.model.RoleExample;
import com.xnt.dhq.model.RoleParam;

import java.util.List;

public interface RoleParamDao {
    /**
     * 获取前台展示角色数据
     */
    List<RoleParam> selectByRoleExample(RoleExample roleExample);
}
