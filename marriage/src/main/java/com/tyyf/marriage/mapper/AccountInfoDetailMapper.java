package com.tyyf.marriage.mapper;

import com.tyyf.marriage.entity.AccountInfoDetail;

public interface AccountInfoDetailMapper {
    int deleteByPrimaryKey(String uuidCustomer);

    int insert(AccountInfoDetail record);

    int insertSelective(AccountInfoDetail record);

    AccountInfoDetail selectByPrimaryKey(String uuidCustomer);

    int updateByPrimaryKeySelective(AccountInfoDetail record);

    int updateByPrimaryKey(AccountInfoDetail record);
}