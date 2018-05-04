/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.SysUser;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月4日 下午2:33:03  
 * @Email chenjiqiute@msfintech.com
 */
public interface SysUserService {

	/** 
	* @Description 方法描述: 添加后台管理员用户 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午2:36:41  
	*/
	int insertUser(SysUser record);

	/** 
	* @Description 方法描述: 修改后台管理员用户
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午2:37:25  
	*/
	int updateUser(SysUser record);

	/** 
	* @Description 方法描述: 逻辑删除或冻结后台管理员账户
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午2:45:17  
	*/
	int deleteUser(String userId, Integer delType);

	/** 
	* @Description 方法描述: 管理员列表（分页） 
	* @return  返回值类型:   PageInfo<SysUser>
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午2:49:40  
	*/
	PageInfo<SysUser> findAdminByPage(int pageNum, int pageSize);

	/** 
	* @Description 方法描述: 根据id获取管理员信息 
	* @return  返回值类型:   SysUser
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月4日 下午2:51:08  
	*/
	SysUser selectByPrimaryKey(String userId);

}
