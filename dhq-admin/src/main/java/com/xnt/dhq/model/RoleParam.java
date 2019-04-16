package com.xnt.dhq.model;

import java.util.List;

public class RoleParam extends Role {

    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
