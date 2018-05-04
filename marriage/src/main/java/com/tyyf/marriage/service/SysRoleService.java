/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.SysRole;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月4日 下午3:00:49  
 * @Email chenjiqiute@msfintech.com
 */
public interface SysRoleService {

	/** 
	* @Description 方法描述: 添加角色
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午3:03:33  
	*/
	int insert(SysRole record);

	/** 
	* @Description 方法描述: 删除用户 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午3:04:22  
	*/
	int deleteByPrimaryKey(String roleId);

	/** 
	* @Description 方法描述: 分页显示角色列表 
	* @return  返回值类型:   PageInfo<SysRole>
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午3:08:02  
	*/
	PageInfo<SysRole> findRoleByPage(int pageNum, int pageSize);

	/** 
	* @Description 方法描述: 根据id修改角色
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午4:22:56  
	*/
	int updateByPrimaryKeySelective(SysRole record);

}
