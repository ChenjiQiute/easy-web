package com.tyyf.marriage.mapper;

import com.tyyf.marriage.entity.CustomerImage;

public interface CustomerImageMapper {
    int deleteByPrimaryKey(String uuidCustomer);

    int insert(CustomerImage record);

    int insertSelective(CustomerImage record);

    CustomerImage selectByPrimaryKey(String uuidCustomer);

    int updateByPrimaryKeySelective(CustomerImage record);

    int updateByPrimaryKey(CustomerImage record);
}