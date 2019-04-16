package com.xnt.dhq.component;

import com.xnt.dhq.model.DhqUser;
import com.xnt.dhq.model.DhqUserPermission;
import com.xnt.dhq.model.Permission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 * Created by macro on 2018/4/26.
 */
public class AdminUserDetails implements UserDetails {
    private DhqUser dhqAdmin;
    private List<Permission> permissionList;
    public AdminUserDetails(DhqUser dhqAdmin, List<Permission> permissionList) {
        this.dhqAdmin = dhqAdmin;
        this.permissionList = permissionList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的权限
        return permissionList.stream()
                .filter(permission -> permission.getDescription()!=null)
                .map(permission ->new SimpleGrantedAuthority(permission.getDescription()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return dhqAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return dhqAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return dhqAdmin.getStatus().equals(1);
    }
}