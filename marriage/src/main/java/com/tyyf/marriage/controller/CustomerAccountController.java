/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tyyf.marriage.entity.CustomerAccount;
import com.tyyf.marriage.service.CustomerAccountService;
import com.tyyf.marriage.vo.UserListVO;

import io.swagger.annotations.ApiOperation;

/**
 * @Description
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月24日 下午5:11:11
 * @Email chenjiqiute@msfintech.com
 */
@RestController
public class CustomerAccountController {
	@Autowired
	CustomerAccountService customerAccountService;

	@RequestMapping(value = "queryUserList", method = RequestMethod.POST)
    @ApiOperation(value = "获取用户列表")
	public List<CustomerAccount> queryUserList(UserListVO vo) {
		return customerAccountService.getUserList(vo.getPageNum(), vo.getPageSize());
	}
}
