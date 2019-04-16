package com.xnt.dhq.service.impl;

import com.github.pagehelper.PageHelper;
import com.xnt.dhq.dao.DhqUserParamDao;
import com.xnt.dhq.dao.UserRoleRelationDao;
import com.xnt.dhq.mapper.DhqUserMapper;
import com.xnt.dhq.model.DhqUser;
import com.xnt.dhq.mapper.UserRoleRelationMapper;
import com.xnt.dhq.model.*;
import com.xnt.dhq.model.Permission;
import com.xnt.dhq.service.DhqUserService;
import com.xnt.dhq.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * DhqUserService实现类
 * Created by Jialin on 2019/3/25.
 */
@Service
public class DhqUserServiceImpl implements DhqUserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DhqUserServiceImpl.class);

    @Autowired
    private DhqUserMapper dhqUserMapper;
    @Autowired
    private DhqUserParamDao dhqUserParamDao;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private UserRoleRelationDao userRoleRelationDao;
    @Autowired
    private UserRoleRelationMapper userRoleRelationMapper;

    @Override
    public DhqUser getUserByUsername(String username) {
        DhqUserExample example = new DhqUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<DhqUser> userList = dhqUserMapper.selectByExample(example);
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        }
        return null;
    }

    @Override
    public DhqUser register(DhqUserParam dhqUserParam) {
        DhqUser dhqUser = new DhqUser();
        BeanUtils.copyProperties(dhqUserParam, dhqUser);
        //dhqUser.setCreateTime(new Date());
        //dhqUser.setStatus(1);
        //查询是否有相同用户名的用户
        DhqUserExample example = new DhqUserExample();
        example.createCriteria().andUsernameEqualTo(dhqUser.getUsername());
        List<DhqUser> dhqUserList = dhqUserMapper.selectByExample(example);
        if (dhqUserList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String md5Password = passwordEncoder.encode(dhqUser.getPassword());
        dhqUser.setPassword(md5Password);
        dhqUserMapper.insert(dhqUser);
        return dhqUser;
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        //校验密码用加密方式校验密码不能明文存储
        try{
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            if (!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("用户名或密码不正确");
            }
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            token = jwtTokenUtil.generateToken(userDetails);
        }catch (AuthenticationException e){
            LOGGER.warn("username:{},登录异常:{}",username,e.getMessage());
        }
        return token;
    }

    @Override
    public String refreshToken(String oldToken) {
        return null;
    }

    @Override
    public DhqUser getItem(Long id) {
        return dhqUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, DhqUser user) {
        user.setId(id);
        return dhqUserMapper.updateByPrimaryKey(user);
    }

    @Override
    public int delete(Long id) {
        return dhqUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateRole(Long userId, List<Long> roleIds) {
        int count = roleIds == null ? 0 : roleIds.size();
        //先删除原来的关系
        UserRoleRelationExample userRoleRelationExample = new UserRoleRelationExample();
        userRoleRelationExample.createCriteria().andUserIdEqualTo(userId);
        userRoleRelationMapper.deleteByExample(userRoleRelationExample);
        //建立新关系
        if (!CollectionUtils.isEmpty(roleIds)) {
            List<UserRoleRelation> list = new ArrayList<>();
            for (Long roleId : roleIds) {
                UserRoleRelation roleRelation = new UserRoleRelation();
                roleRelation.setUserId(userId);
                roleRelation.setRoleId(roleId);
                list.add(roleRelation);
            }
            userRoleRelationDao.insertList(list);
        }
        return count;
    }

    @Override
    public List<Role> getRoleList(Long userId) {
        return userRoleRelationDao.getRoleList(userId);
    }

    @Override
    public List<Permission> getRolePermissionList(Long userId) {
        return userRoleRelationDao.getRolePermissionList(userId);
    }

    @Override
    public List<DhqUserParam> list(String username, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        DhqUserExample dhqUserExample = new DhqUserExample();
        dhqUserExample.setOrderByClause("id desc");
        DhqUserExample.Criteria criteria = dhqUserExample.createCriteria();
        if (!StringUtils.isEmpty(username)) {
            criteria.andUsernameLike("%" + username + "%");
        }

        return dhqUserParamDao.selectByExample(dhqUserExample);
    }
}
