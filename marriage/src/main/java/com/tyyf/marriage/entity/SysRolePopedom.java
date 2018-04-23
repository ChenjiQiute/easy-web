package com.tyyf.marriage.entity;

public class SysRolePopedom {
    private String id;

    private String roleId;

    private String popedomId;

    private Integer popedom;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getPopedomId() {
        return popedomId;
    }

    public void setPopedomId(String popedomId) {
        this.popedomId = popedomId == null ? null : popedomId.trim();
    }

    public Integer getPopedom() {
        return popedom;
    }

    public void setPopedom(Integer popedom) {
        this.popedom = popedom;
    }
}