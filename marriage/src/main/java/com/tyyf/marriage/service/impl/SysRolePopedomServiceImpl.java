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
import com.tyyf.marriage.entity.SysRolePopedom;
import com.tyyf.marriage.mapper.SysRolePopedomMapper;
import com.tyyf.marriage.service.SysRolePopedomService;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月7日 上午11:29:40  
 * @Email chenjiqiute@msfintech.com
 */
@Service
@Transactional
public class SysRolePopedomServiceImpl implements SysRolePopedomService{
	@Autowired
	SysRolePopedomMapper sysRolePopedomMapper;
	
	@Override
	public int insert(SysRolePopedom record) {
		return sysRolePopedomMapper.insert(record);
	}
	
	@Override
	public int deleteByPrimaryKey(String id) {
		return sysRolePopedomMapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public PageInfo<SysRolePopedom> findRolePopedomByPage(int pageNum,int pageSize,SysRolePopedom record){
		PageHelper.startPage(pageNum, pageSize);
		List<SysRolePopedom> popedomList = sysRolePopedomMapper.findRolePopedomByPage(record);
		PageInfo<SysRolePopedom> p = new PageInfo<SysRolePopedom>(popedomList);
		return p;
	}
	
	@Override
	public int updateByPrimaryKeySelective(SysRolePopedom record) {
		return sysRolePopedomMapper.updateByPrimaryKeySelective(record);
	}
}
