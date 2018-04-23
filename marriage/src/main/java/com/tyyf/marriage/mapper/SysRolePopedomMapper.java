package com.tyyf.marriage.mapper;

import com.tyyf.marriage.entity.SysRolePopedom;

public interface SysRolePopedomMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysRolePopedom record);

    int insertSelective(SysRolePopedom record);

    SysRolePopedom selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysRolePopedom record);

    int updateByPrimaryKey(SysRolePopedom record);
}