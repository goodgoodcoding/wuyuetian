package com.xnt.dhq.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by Jialin on 2019/3/26.
 */
public class PermissionNode extends Permission{
    @Getter
    @Setter
    private List<PermissionNode> children;
}
