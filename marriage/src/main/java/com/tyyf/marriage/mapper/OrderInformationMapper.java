package com.tyyf.marriage.mapper;

import java.util.List;

import com.tyyf.marriage.entity.OrderInformation;

public interface OrderInformationMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(OrderInformation record);

    int insertSelective(OrderInformation record);

    OrderInformation selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(OrderInformation record);

    int updateByPrimaryKey(OrderInformation record);
    
    List<OrderInformation> findOrderByPage();
}