package org.edataserver.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.StandardInfoMapper;
import org.edataserver.dao.TestInfoMapper;
import org.edataserver.dao.TestStandardMapper;
import org.edataserver.model.StandardInfo;
import org.edataserver.model.TestStandard;
import org.edataserver.service.GeneralTestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GeneralTestSerivceImpl implements GeneralTestSerivce {
	/**
	 * input
	 */
	@Autowired 
	private TestStandardMapper testStandardMapper;
	@Override
	public List<TestStandard> getAllStandards() {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<TestStandard> map=testStandardMapper.getAllStandards();
		
		return map;
	}

}
