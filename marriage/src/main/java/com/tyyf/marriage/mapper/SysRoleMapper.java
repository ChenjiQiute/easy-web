package com.tyyf.marriage.mapper;

import java.util.List;

import com.tyyf.marriage.entity.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(String roleId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    List<SysRole> findAdminByPage();
}