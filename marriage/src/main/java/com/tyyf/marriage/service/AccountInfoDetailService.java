/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import com.tyyf.marriage.vo.AccountInfoVO;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月26日 上午11:08:12  
 * @Email chenjiqiute@msfintech.com
 */
public interface AccountInfoDetailService {

	/** 
	* @Description 方法描述: 添加用户详情 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月26日 上午11:11:19  
	*/
	int insertUserDetail();

	/** 
	* @Description 方法描述: 根据id获取用户详情
	* @return  返回值类型:   AccountInfoVO
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月26日 下午2:17:26  
	*/
	AccountInfoVO selectByPrimaryKey(String uuidCustomer);

	/** 
	* @Description 方法描述: 修改用户详情信息
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月28日 上午11:11:54  
	*/
	int updateByPrimaryKeySelective(AccountInfoVO vo);

	/** 
	* @Description 方法描述: TODO 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月28日 上午11:21:06  
	*/
	int deleteById(String uuidCustomer);

}
