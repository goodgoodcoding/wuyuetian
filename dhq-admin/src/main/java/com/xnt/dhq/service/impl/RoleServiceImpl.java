package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dao.RoleDao;
import com.xnt.dhq.dao.RoleParamDao;
import com.xnt.dhq.dao.RolePermissionRelationDao;
import com.xnt.dhq.mapper.RoleMapper;
import com.xnt.dhq.mapper.RolePermissionRelationMapper;
import com.xnt.dhq.model.*;
import com.xnt.dhq.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 后台角色管理Service实现类
 * Created by Jialin on 2019/3/25.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleParamDao roleParamDao;

    @Autowired
    private RolePermissionRelationDao rolePermissionRelationDao;

    @Autowired
    private RolePermissionRelationMapper rolePermissionRelationMapper;

    @Override
    public int create(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int update(Long id, Role role) {
        role.setId(id);
        return roleMapper.updateByPrimaryKey(role);
    }

    @Override
    public int delete(List<Long> ids) {
        RoleExample example = new RoleExample();
        example.createCriteria().andIdIn(ids);
        return roleMapper.deleteByExample(example);
    }

    @Override
    public List<RoleParam> list(String roleName,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        RoleExample roleExample = new RoleExample();
        roleExample.setOrderByClause("id desc");
        RoleExample.Criteria criteria = roleExample.createCriteria();
        if (!StringUtils.isEmpty(roleName)) {
            criteria.andNameLike("%" + roleName + "%");
        }
        return  roleParamDao.selectByRoleExample(new RoleExample());
    }

    @Override
    public List<Permission> getPermissionList(Long roleId) {
        return rolePermissionRelationDao.selectPermissionListByRoleId(roleId);
    }

    @Override
    public int updatePermission(Long roleId, List<Long> permissionIds) {
        //先删除原有关系
        RolePermissionRelationExample example=new RolePermissionRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        rolePermissionRelationMapper.deleteByExample(example);
        //批量插入新关系
        List<RolePermissionRelation> relationList = new ArrayList<>();
        for (Long permissionId : permissionIds) {
            RolePermissionRelation relation = new RolePermissionRelation();
            relation.setRoleId(roleId);
            relation.setPermissionId(permissionId);
            relationList.add(relation);
        }
        return rolePermissionRelationDao.insertList(relationList);
    }
}
