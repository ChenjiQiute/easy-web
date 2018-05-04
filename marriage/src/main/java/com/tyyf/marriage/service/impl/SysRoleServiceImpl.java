/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tyyf.marriage.entity.SysRole;
import com.tyyf.marriage.mapper.SysRoleMapper;
import com.tyyf.marriage.service.SysRoleService;

/**
 * @Description
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月4日 下午3:01:41
 * @Email chenjiqiute@msfintech.com
 */
@Service
@Transactional
public class SysRoleServiceImpl implements SysRoleService {
	@Autowired
	SysRoleMapper sysRoleMapper;

	@Override
	public int insert(SysRole record) {
		return sysRoleMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(String roleId) {
		return sysRoleMapper.deleteByPrimaryKey(roleId);
	}

	@Override
	public PageInfo<SysRole> findRoleByPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<SysRole> adminList = sysRoleMapper.findAdminByPage();
		PageInfo<SysRole> p = new PageInfo<SysRole>(adminList);
		return p;
	}
	
	@Override
	public int updateByPrimaryKeySelective(SysRole record) {
		return sysRoleMapper.updateByPrimaryKeySelective(record);
	}
}
