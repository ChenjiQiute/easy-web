/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.OrderInformation;
import com.tyyf.marriage.mapper.OrderInformationMapper;
import com.tyyf.marriage.service.OrderInformationService;

/**
 * @Description
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月28日 下午3:24:01
 * @Email chenjiqiute@msfintech.com
 */
public class OrderInformationServiceImpl implements OrderInformationService {
	@Autowired
	OrderInformationMapper orderInformationMapper;

	@Override
	public int insertSelective(OrderInformation entity) {
		return orderInformationMapper.insertSelective(entity);
	}

	@Override
	public int deleteByPrimaryKey(String uuid) {
		OrderInformation entity = new OrderInformation();
		entity.setUuid(uuid);
		entity.setDeleteType(1);
		return orderInformationMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public OrderInformation selectByPrimaryKey(String uuid) {
		return orderInformationMapper.selectByPrimaryKey(uuid);
	}

	@Override
	public PageInfo<OrderInformation> findOrderByPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<OrderInformation> userList = orderInformationMapper.findOrderByPage();
		// 分页封装类
		PageInfo<OrderInformation> p = new PageInfo<OrderInformation>(userList);
		return p;
	}

	@Override
	public int updateByPrimaryKeySelective(OrderInformation entity) {
		return orderInformationMapper.updateByPrimaryKeySelective(entity);
	}
}
