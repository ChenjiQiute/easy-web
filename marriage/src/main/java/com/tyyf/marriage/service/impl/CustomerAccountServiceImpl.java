/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.AccountInfoDetail;
import com.tyyf.marriage.entity.CustomerAccount;
import com.tyyf.marriage.mapper.AccountInfoDetailMapper;
import com.tyyf.marriage.mapper.CustomerAccountMapper;
import com.tyyf.marriage.service.CustomerAccountService;
import com.tyyf.marriage.tools.MD5Util;
import com.tyyf.marriage.vo.FindUserByIdVO;
import com.tyyf.marriage.vo.InsertUserVO;
import com.tyyf.marriage.vo.UpdateUserVO;
import com.tyyf.marriage.vo.UserVO;
import com.tyyf.marriage.vo.LoginVO;

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
	@Autowired
	AccountInfoDetailMapper accountInfoDetailMapper;

	@Override
	public String insertUser(InsertUserVO vo, BindingResult br) {
		if (br.hasErrors()) {
			return br.getFieldError().getDefaultMessage();
		}
		if (customerAccountMapper.checkMobileExist(vo.getMobile()) == 0) {
			CustomerAccount entity = new CustomerAccount();
			BeanUtils.copyProperties(vo, entity);
			entity.setUuid(UUID.randomUUID().toString());
			entity.setPassword(MD5Util.generate(vo.getPassword()));
			entity.setAccountType(0);
			entity.setDeleteType(0);
			entity.setCreateTime(new Date());
			int i = customerAccountMapper.insert(entity);
			if (i == 1) {
				return "注册成功!";
			} else {
				return "注册失败!";
			}
		}
		return "手机号已被注册!";
	}

	@Override
	public UserVO login(LoginVO vo, BindingResult br) {
		UserVO userVO = new UserVO();
		if (br.hasErrors()) {
			userVO.setError(br.getFieldError().getDefaultMessage());
			return userVO;
		}
		CustomerAccount record = new CustomerAccount();
		record.setMobile(vo.getMobile());
		CustomerAccount user = customerAccountMapper.selectByMobile(record);
		if (user == null) {
			userVO.setError("帐户名或密码错误！");
			return userVO;
		}
		if (MD5Util.verify(vo.getPassword(), user.getPassword())) {
			AccountInfoDetail accountInfo = accountInfoDetailMapper.selectByPrimaryKey(user.getUuid());
			userVO.setMobile(user.getMobile());
			if (accountInfo != null && accountInfo.getNickName() != null)
				userVO.getNickName();
			return userVO;
		}
		userVO.setError("帐户名或密码错误！");
		return userVO;
	}

	@Override
	public PageInfo<CustomerAccount> findUserByPage(int pageNum, int pageSize) {
		// 使用分页插件,核心代码就这一行
		PageHelper.startPage(pageNum, pageSize);
		List<CustomerAccount> userList = customerAccountMapper.findUserByPage();
		// 分页封装类
		PageInfo<CustomerAccount> p = new PageInfo<CustomerAccount>(userList);
		return p;
	}

	@Override
	public int updateUserById(UpdateUserVO vo) {
		CustomerAccount entity = new CustomerAccount();
		BeanUtils.copyProperties(vo, entity);
		if (vo.getPassword() != null) {
			entity.setPassword(MD5Util.generate(vo.getPassword()));
		}
		return customerAccountMapper.updateByPrimaryKeySelective(entity);
	}

	@Override
	public FindUserByIdVO selectByPrimaryKey(String id) {
		CustomerAccount entity = customerAccountMapper.selectByPrimaryKey(id);
		FindUserByIdVO vo = new FindUserByIdVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}

	@Override
	public int deleteUserById(String uuid) {
		UpdateUserVO vo = new UpdateUserVO();
		vo.setUuid(uuid);
		vo.setDeleteType(1);
		CustomerAccount entity = new CustomerAccount();
		BeanUtils.copyProperties(vo, entity);
		return customerAccountMapper.updateByPrimaryKeySelective(entity);
	}

}
