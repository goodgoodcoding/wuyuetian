package com.xnt.dhq.service.impl;

import com.xnt.dhq.mapper.UserRoleRelationMapper;
import com.xnt.dhq.model.UserRoleRelationExample;
import com.xnt.dhq.service.UserRoleRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 后台用户角色关系管理Service实现类
 * Created by Jialin on 2019/3/26.
 */
@Service
public class UserRoleRelationServiceImpl implements UserRoleRelationService {

    @Autowired
    private UserRoleRelationMapper userRoleRelationMapper;

    @Override
    public int delete(List<Long> ids) {
        UserRoleRelationExample example = new UserRoleRelationExample();
        example.createCriteria().andIdIn(ids);
        return userRoleRelationMapper.deleteByExample(example);
    }
}
