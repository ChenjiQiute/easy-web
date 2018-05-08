/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.SysPopedom;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月7日 上午10:30:15  
 * @Email chenjiqiute@msfintech.com
 */
public interface SysPopedomService {

	/** 
	* @Description 方法描述: 添加权限 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 上午10:35:15  
	*/
	int insert(SysPopedom record);

	/** 
	* @Description 方法描述: 删除权限 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 上午10:36:07  
	*/
	int deleteByPrimaryKey(String popedomId);

	/** 
	* @Description 方法描述: 分页查询 
	* @return  返回值类型:   PageInfo<SysPopedom>
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 上午11:13:29  
	*/
	PageInfo<SysPopedom> findPopedomByPage(int pageNum, int pageSize);

	/** 
	* @Description 方法描述: 修改权限 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 上午11:20:54  
	*/
	int update(SysPopedom record);

}
