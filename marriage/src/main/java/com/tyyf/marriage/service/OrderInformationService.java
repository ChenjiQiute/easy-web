/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.OrderInformation;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月28日 下午3:23:10  
 * @Email chenjiqiute@msfintech.com
 */
public interface OrderInformationService {

	/** 
	* @Description 方法描述: 添加新订单
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月28日 下午3:27:05  
	*/
	int insertSelective(OrderInformation entity);

	/** 
	* @Description 方法描述: 逻辑删除订单
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月28日 下午3:36:44  
	*/
	int deleteByPrimaryKey(String uuid);

	/** 
	* @Description 方法描述: 查询单条订单详情 
	* @return  返回值类型:   OrderInformation
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月28日 下午3:38:19  
	*/
	OrderInformation selectByPrimaryKey(String uuid);

	/** 
	* @Description 方法描述: 分页查询订单列表 
	* @return  返回值类型:   PageInfo<OrderInformation>
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月28日 下午3:44:27  
	*/
	PageInfo<OrderInformation> findOrderByPage(int pageNum, int pageSize);

	/** 
	* @Description 方法描述: 根据主键修改订单详情
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月28日 下午3:47:31  
	*/
	int updateByPrimaryKeySelective(OrderInformation entity);

}
