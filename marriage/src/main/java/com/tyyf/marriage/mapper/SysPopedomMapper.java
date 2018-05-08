package com.tyyf.marriage.mapper;

import java.util.List;

import com.tyyf.marriage.entity.SysPopedom;

public interface SysPopedomMapper {
    int deleteByPrimaryKey(String popedomId);

    int insert(SysPopedom record);

    int insertSelective(SysPopedom record);

    SysPopedom selectByPrimaryKey(String popedomId);

    int updateByPrimaryKeySelective(SysPopedom record);

    int updateByPrimaryKey(SysPopedom record);
    
    List<SysPopedom> findPopedomByPage();
}