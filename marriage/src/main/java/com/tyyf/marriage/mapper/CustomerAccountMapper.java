package com.tyyf.marriage.mapper;

import com.tyyf.marriage.entity.CustomerAccount;

public interface CustomerAccountMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(CustomerAccount record);

    int insertSelective(CustomerAccount record);

    CustomerAccount selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(CustomerAccount record);

    int updateByPrimaryKey(CustomerAccount record);
}