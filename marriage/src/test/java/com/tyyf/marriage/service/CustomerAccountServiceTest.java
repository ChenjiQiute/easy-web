/**
 *  天意缘分婚介服务有限公司
 */
package com.tyyf.marriage.service;

import java.util.Date;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.tyyf.marriage.application.MarriageApplication;
import com.tyyf.marriage.entity.CustomerAccount;
import com.tyyf.marriage.mapper.CustomerAccountMapper;
import com.tyyf.marriage.tools.MD5Util;

/**
 * @Description 
 * @author Chenji Qiute
 * @date 创建时间: 2018年4月23日 下午4:54:43  
 * @Email chenjiqiute@msfintech.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MarriageApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Transactional
public class CustomerAccountServiceTest {
	@Autowired
	CustomerAccountMapper customerAccountMapper;
	
	/** 
	* @Description 方法描述: 
	* @return  返回值类型:   void
	* @author 作者: Chenji Qiute 
	* @date 时间: 2018年4月23日 下午4:54:43  
	*/
	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Rollback(true)
	public void testInsert() {
		CustomerAccount entity = new CustomerAccount();
		entity.setUuid(UUID.randomUUID().toString());
		entity.setMobile("13697271198");
		entity.setEmail("coolclark@qq.com");
		String pwd = MD5Util.generate("123456");
		entity.setPassword(pwd);
		entity.setAccountType(0);
		entity.setDeleteType(0);
		entity.setCreateTime(new Date());
		assert(customerAccountMapper.insert(entity) == 1);
	}

}
