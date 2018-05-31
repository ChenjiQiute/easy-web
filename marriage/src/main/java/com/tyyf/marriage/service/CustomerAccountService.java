/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import org.springframework.validation.BindingResult;

import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.CustomerAccount;
import com.tyyf.marriage.vo.FindUserByIdVO;
import com.tyyf.marriage.vo.InsertUserVO;
import com.tyyf.marriage.vo.UpdateUserVO;

/**
 * @Description TODO
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月23日 下午4:42:53
 * @Email chenjiqiute@msfintech.com
 */
public interface CustomerAccountService {

	/**
	 * @Description 方法描述: 用户注册
	 * @return 返回值类型: int
	 * @author 作者: Chenji Qiute
	 * @date 时间: 2018年4月23日 下午4:48:26
	 */
	String insertUser(InsertUserVO vo, BindingResult br);

	/**
	 * @Description 方法描述: 获取用户列表(测试分页)
	 * @return 返回值类型: List<CustomerAccount>
	 * @author 作者: Chenji Qiute
	 * @date 时间: 2018年4月24日 下午4:17:40
	 */
	PageInfo<CustomerAccount> findUserByPage(int pageNum, int pageSize);

	/**
	 * @Description 方法描述: 修改用户信息
	 * @return 返回值类型: int
	 * @author 作者: Chenji Qiute
	 * @date 时间: 2018年4月25日 下午4:44:37
	 */
	int updateUserById(UpdateUserVO vo);

	/**
	 * @Description 方法描述: 根据用户id查询用户信息
	 * @return 返回值类型: CustomerAccount
	 * @author 作者: Chenji Qiute
	 * @date 时间: 2018年4月25日 下午4:58:23
	 */
	FindUserByIdVO selectByPrimaryKey(String id);

	/**
	 * @Description 方法描述: 根据id删除用户
	 * @return 返回值类型: int
	 * @author 作者: Chenji Qiute
	 * @date 时间: 2018年4月25日 下午5:20:52
	 */
	int deleteUserById(String uuid);

}
