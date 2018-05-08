/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.SysRolePopedom;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月7日 上午11:29:25  
 * @Email chenjiqiute@msfintech.com
 */
public interface SysRolePopedomService {

	/** 
	* @Description 方法描述: 添加角色权限对应关系 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 上午11:32:48  
	*/
	int insert(SysRolePopedom record);

	/** 
	* @Description 方法描述: 根据id删除
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 下午2:12:52  
	*/
	int deleteByPrimaryKey(String id);

	/** 
	* @Description 方法描述: 查询角色权限分页列表  
	* @return  返回值类型:   PageInfo<SysRolePopedom>
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 下午3:00:52  
	*/
	PageInfo<SysRolePopedom> findRolePopedomByPage(int pageNum, int pageSize, SysRolePopedom record);

	/** 
	* @Description 方法描述: 根据id修改角色权限对应数据 
	* @return  返回值类型:   int
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年5月7日 下午4:37:46  
	*/
	int updateByPrimaryKeySelective(SysRolePopedom record);

}
