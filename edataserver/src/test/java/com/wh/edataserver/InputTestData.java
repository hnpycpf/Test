package com.wh.edataserver;

import java.util.Date;

import org.edataserver.SpringbootApplication;
import org.edataserver.dao.TestStandardMapper;
import org.edataserver.dao.TypeMapper;
import org.edataserver.dao.UserMapper;
import org.edataserver.model.TestStandard;
import org.edataserver.model.Type;
import org.edataserver.model.User;
import org.edataserver.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
@WebAppConfiguration
public class InputTestData  {

	
	
	@Autowired
	TestStandardMapper testStandardMapper;
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	TypeMapper typeMapper;
	public void inputTestStandardData() {
		User user = new User();
		user.setName("张三");
		user.setUserName("11111");
		user.setUserPass("11111");
		user.setUserType("1");
		user.setCreatetime(new Date());
		user.setUpdatetime(new Date());
		userMapper.insertSelective(user);
		
		TestStandard standard = new TestStandard();
		standard.setCreatetime(new Date());
		standard.setUpdatetime(new Date());
		standard.setUserId(user.getUserId());
		standard.setProjectName("基于大数据的“智慧粮食”平台关键技术研究");
		standard.setStandardNumber("");
		/*standard.set*/
	}
	/*@Test
	public void inputType() {
		Type type=new Type();
		type.setTypeId(UUID.getUUID());
		type.setCreatetime(new Date());
		type.setTypeName("企业标准");
		type.setTypeCode("4");
		typeMapper.insert(type);
	}*/
	
	

}
