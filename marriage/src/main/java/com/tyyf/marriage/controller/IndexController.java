/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description 页面浏览操作
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月14日 上午11:06:27  
 * @Email chenjiqiute@msfintech.com
 */
@Controller
public class IndexController {

	/**
	 * 
	* @Description 方法描述: 获取首页信息 
	* @return  返回值类型:   String
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月14日 上午11:15:19
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
}
