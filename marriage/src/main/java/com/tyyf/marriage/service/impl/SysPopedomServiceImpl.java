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
import com.tyyf.marriage.entity.SysPopedom;
import com.tyyf.marriage.mapper.SysPopedomMapper;
import com.tyyf.marriage.service.SysPopedomService;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年5月7日 上午10:31:30  
 * @Email chenjiqiute@msfintech.com
 */
@Service
@Transactional
public class SysPopedomServiceImpl implements SysPopedomService {

	@Autowired
	SysPopedomMapper sysPopedomMapper;
	
	@Override
	public int insert(SysPopedom record) {
		return sysPopedomMapper.insert(record);
	}
	
	@Override
	public int deleteByPrimaryKey(String popedomId) {
		return sysPopedomMapper.deleteByPrimaryKey(popedomId);
	}
	
	@Override
	public PageInfo<SysPopedom> findPopedomByPage(int pageNum, int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<SysPopedom> popedomList = sysPopedomMapper.findPopedomByPage();
		// 分页封装类
		PageInfo<SysPopedom> p = new PageInfo<SysPopedom>(popedomList);
		return p;
	}
	
	@Override
	public int update(SysPopedom record) {
		return sysPopedomMapper.updateByPrimaryKeySelective(record);
	}
}
