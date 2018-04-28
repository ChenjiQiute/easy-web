/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tyyf.marriage.entity.AccountInfoDetail;
import com.tyyf.marriage.mapper.AccountInfoDetailMapper;
import com.tyyf.marriage.service.AccountInfoDetailService;
import com.tyyf.marriage.vo.AccountInfoVO;

/**
 * @Description
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月26日 上午11:08:41
 * @Email chenjiqiute@msfintech.com
 */
@Service
@Transactional
public class AccountInfoDetailServiceImpl implements AccountInfoDetailService {
	@Autowired
	AccountInfoDetailMapper accountInfoDetailMapper;

	@Override
	public int insertUserDetail() {
		AccountInfoDetail entity = new AccountInfoDetail();

		return accountInfoDetailMapper.insert(entity);
	}

	@Override
	public AccountInfoVO selectByPrimaryKey(String uuidCustomer) {
		AccountInfoDetail entity = new AccountInfoDetail();
		entity = accountInfoDetailMapper.selectByPrimaryKey(uuidCustomer);
		AccountInfoVO vo = new AccountInfoVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}

	@Override
	public int updateByPrimaryKeySelective(AccountInfoVO vo) {
		AccountInfoDetail entity = new AccountInfoDetail();
		BeanUtils.copyProperties(vo, entity);
		return accountInfoDetailMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public int deleteById(String uuidCustomer) {
		AccountInfoDetail entity = new AccountInfoDetail();
		entity.setUuidCustomer(uuidCustomer);
		return accountInfoDetailMapper.updateByPrimaryKeySelective(entity);
	}
}
