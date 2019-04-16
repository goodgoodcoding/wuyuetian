package com.xnt.dhq.service.impl;

import com.xnt.dhq.mapper.PermissionMapper;
import com.xnt.dhq.model.Permission;
import com.xnt.dhq.model.PermissionExample;
import com.xnt.dhq.model.PermissionNode;
import com.xnt.dhq.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台权限管理Service实现类
 * Created by Jialin on 2019/3/26.
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public int create(Permission permission) {
        return permissionMapper.insert(permission);
    }

    @Override
    public int update(Long id, Permission permission) {
        permission.setId(id);
        return permissionMapper.updateByPrimaryKey(permission);
    }

    @Override
    public int delete(List<Long> ids) {
        PermissionExample example = new PermissionExample();
        example.createCriteria().andIdIn(ids);
        return permissionMapper.deleteByExample(example);
    }

    @Override
    public List<PermissionNode> treeList() {
        return null;
    }

    @Override
    public List<Permission> list() {
        return permissionMapper.selectByExample(new PermissionExample());
    }
}
