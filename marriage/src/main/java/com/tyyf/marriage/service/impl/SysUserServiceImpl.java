/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.SysUser;
import com.tyyf.marriage.mapper.SysUserMapper;
import com.tyyf.marriage.service.SysUserService;

/**
 * @Description
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月4日 下午2:33:33
 * @Email chenjiqiute@msfintech.com
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	SysUserMapper sysUserMapper;

	@Override
	public int insertUser(SysUser record) {
		record.setUserId(UUID.randomUUID().toString());
		return sysUserMapper.insert(record);
	}

	@Override
	public int updateUser(SysUser record) {
		return sysUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteUser(String userId, Integer delType) {
		SysUser record = new SysUser();
		record.setUserId(userId);
		record.setDeleteType(delType);
		return sysUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public PageInfo<SysUser> findAdminByPage(int pageNum, int pageSize) {
		// 使用分页插件,核心代码就这一行
		PageHelper.startPage(pageNum, pageSize);
		List<SysUser> adminList = sysUserMapper.findAdminByPage();
		// 分页封装类
		PageInfo<SysUser> p = new PageInfo<SysUser>(adminList);
		return p;
	}
	
	@Override
	public SysUser selectByPrimaryKey(String userId) {
		return sysUserMapper.selectByPrimaryKey(userId);
	}
}
