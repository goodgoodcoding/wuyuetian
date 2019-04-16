package com.xnt.dhq.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by afu on 2019-03-25.
 */
@Data
public class DhqUserPermission {
    //父级权限 ID
    private Long id;
    //权限名称
    private String name;
    //权限值
    private String value;
    //权限类型--> 0.目录,1.菜单 2.按钮（删除等操作直接操作的按钮权限）
    private Integer type;
    //访问的 URL 路径用来做权限控制
    private String url;
    //创建时间
    private Date createTime;
    //排序
    private Integer sort;
}
