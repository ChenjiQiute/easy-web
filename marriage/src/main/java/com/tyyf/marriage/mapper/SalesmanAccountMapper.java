package com.tyyf.marriage.mapper;

import com.tyyf.marriage.entity.SalesmanAccount;

public interface SalesmanAccountMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(SalesmanAccount record);

    int insertSelective(SalesmanAccount record);

    SalesmanAccount selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(SalesmanAccount record);

    int updateByPrimaryKey(SalesmanAccount record);
}