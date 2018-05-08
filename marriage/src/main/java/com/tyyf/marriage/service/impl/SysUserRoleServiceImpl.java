/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tyyf.marriage.entity.SysUserRole;
import com.tyyf.marriage.mapper.SysUserRoleMapper;
import com.tyyf.marriage.service.SysUserRoleService;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月7日 下午5:36:09  
 * @Email chenjiqiute@msfintech.com
 */
@Service
@Transactional
public class SysUserRoleServiceImpl implements SysUserRoleService {
	@Autowired
	SysUserRoleMapper sysUserRoleMapper;
	
	@Override
	public int insert(SysUserRole record) {
		return sysUserRoleMapper.insert(record);
	}
	
	@Override
	public int deleteByPrimaryKey(String id) {
		return sysUserRoleMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public List<SysUserRole> findAllByUserId(String id){
		return sysUserRoleMapper.findAllByUserId(id);
	}
	
	@Override
	public int updateByPrimaryKeySelective(SysUserRole record) {
		return sysUserRoleMapper.updateByPrimaryKeySelective(record);
	}
}
