/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.CustomerAccount;
import com.tyyf.marriage.service.CustomerAccountService;
import com.tyyf.marriage.vo.FindUserByIdVO;
import com.tyyf.marriage.vo.InsertUserVO;
import com.tyyf.marriage.vo.LoginVO;
import com.tyyf.marriage.vo.UpdateUserVO;
import com.tyyf.marriage.vo.UserVO;

import io.swagger.annotations.ApiOperation;

/**
 * @Description
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月24日 下午5:11:11
 * @Email chenjiqiute@msfintech.com
 */
@RestController
@RequestMapping(value = "/user")
public class CustomerAccountController {
	@Autowired
	CustomerAccountService customerAccountService;

	@RequestMapping(value = "findUserByPage", method = RequestMethod.POST)
	@ApiOperation(value = "获取用户列表")
	public PageInfo<CustomerAccount> findUserByPage(@RequestParam int pageNum, @RequestParam int pageSize) {
		return customerAccountService.findUserByPage(pageNum, pageSize);
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	@ApiOperation(value = "用户登录")
	public UserVO login(@Validated LoginVO vo, BindingResult br) {
		return customerAccountService.login(vo, br);
	}
	
	@RequestMapping(value = "insertUser", method = RequestMethod.POST)
	@ApiOperation(value = "添加用户")
	public String insertUser(@Validated InsertUserVO vo, BindingResult br) {
		return customerAccountService.insertUser(vo,br);
	}
	
	@RequestMapping(value = "updateUser", method = RequestMethod.POST)
	@ApiOperation(value = "修改用户")
	public int updateUser(UpdateUserVO vo) {
		return customerAccountService.updateUserById(vo);
	}
	
	@RequestMapping(value = "findUserById", method = RequestMethod.POST)
	@ApiOperation(value = "根据id查找用户")
	public FindUserByIdVO findUserById(String uuid) {
		return customerAccountService.selectByPrimaryKey(uuid);
	}
	
	@RequestMapping(value = "deleteUserById", method = RequestMethod.POST)
	@ApiOperation(value = "删除用户")
	public int deleteUser(String uuid) {
		return customerAccountService.deleteUserById(uuid);
	}
}
