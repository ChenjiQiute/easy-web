/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import java.util.List;

import com.tyyf.marriage.entity.CustomerAccount;

/**
 * @Description TODO
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月23日 下午4:42:53  
 * @Email chenjiqiute@msfintech.com
 */
public interface CustomerAccountService {

	/** 
	* @Description 方法描述: 用户注册
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月23日 下午4:48:26  
	*/
	int insertUser(CustomerAccount record);

	/** 
	* @Description 方法描述: 获取用户列表(测试分页)
	* @return  返回值类型:   List<CustomerAccount>
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月24日 下午4:17:40  
	*/
	List<CustomerAccount> getUserList(int pageNum, int pageSize);

}
