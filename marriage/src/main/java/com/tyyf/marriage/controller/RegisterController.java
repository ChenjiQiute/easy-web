/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tyyf.marriage.service.CustomerAccountService;
import com.tyyf.marriage.vo.InsertUserVO;

/**
 * @Description
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月14日 下午4:51:20
 * @Email chenjiqiute@msfintech.com
 */
@Controller
public class RegisterController {

	@Autowired
	CustomerAccountService customerAccountService;

	/**
	 * 
	 * @Description 方法描述: 用户注册
	 * @return 返回值类型: int
	 * @author 作者: Chenji Qiute
	 * @date 时间: 2018年5月14日 下午5:28:06
	 */
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public int register(InsertUserVO vo) {
		return customerAccountService.insertUser(vo);
	}
}
