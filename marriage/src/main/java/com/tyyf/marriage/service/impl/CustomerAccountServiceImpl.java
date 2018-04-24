/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.tyyf.marriage.entity.CustomerAccount;
import com.tyyf.marriage.mapper.CustomerAccountMapper;
import com.tyyf.marriage.service.CustomerAccountService;

/**
 * @Description 会员相关账户操作
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月23日 下午4:43:37
 * @Email chenjiqiute@msfintech.com
 */
@Service
@Transactional
public class CustomerAccountServiceImpl implements CustomerAccountService {
	@Autowired
	CustomerAccountMapper customerAccountMapper;

	@Override
	public int insertUser(CustomerAccount record) {
		record.setUuid(UUID.randomUUID().toString());
		return customerAccountMapper.insert(record);
	}
	
	@Override
	public List<CustomerAccount> getUserList(int pageNum, int pageSize){
		//使用分页插件,核心代码就这一行
        PageHelper.startPage(pageNum, pageSize);
		return customerAccountMapper.getUserList();
	}

}
