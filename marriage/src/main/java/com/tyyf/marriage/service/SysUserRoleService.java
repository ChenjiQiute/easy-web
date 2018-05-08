/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import java.util.List;

import com.tyyf.marriage.entity.SysUserRole;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月7日 下午5:35:27  
 * @Email chenjiqiute@msfintech.com
 */
public interface SysUserRoleService {

	/** 
	* @Description 方法描述: 添加用户角色关系
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 下午5:39:24  
	*/
	int insert(SysUserRole record);

	/** 
	* @Description 方法描述: 物理删除 用户角色关系
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 下午5:40:18  
	*/
	int deleteByPrimaryKey(String id);

	/** 
	* @Description 方法描述: 根据管理员id查找管理员权限
	* @return  返回值类型:   List<SysUserRole>
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 下午5:53:03  
	*/
	List<SysUserRole> findAllByUserId(String id);

	/** 
	* @Description 方法描述: 修改用户权限
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月8日 上午9:51:06  
	*/
	int updateByPrimaryKeySelective(SysUserRole record);

}
