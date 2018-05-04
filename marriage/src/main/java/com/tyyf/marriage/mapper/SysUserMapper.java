package com.tyyf.marriage.mapper;

import java.util.List;

import com.tyyf.marriage.entity.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    List<SysUser> findAdminByPage();
}