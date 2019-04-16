package com.xnt.dhq.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

/**
 * 用户前台展示参数
 * Created by Jialin on 2019/4/11.
 */
public class DhqUserParam extends DhqUser{

    private  List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
