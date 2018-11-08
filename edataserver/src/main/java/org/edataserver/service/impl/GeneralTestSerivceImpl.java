package org.edataserver.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.StandardInfoMapper;
import org.edataserver.dao.TestInfoMapper;
import org.edataserver.dao.TestStandardMapper;
import org.edataserver.entity.TestInfoVO;
import org.edataserver.model.StandardInfo;
import org.edataserver.model.TestStandard;
import org.edataserver.service.GeneralTestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
@Service
public class GeneralTestSerivceImpl implements GeneralTestSerivce {
	/**
	 * input
	 */
	@Autowired 
	private TestStandardMapper testStandardMapper;
	
	@Autowired
	private TestInfoMapper testInfoMapper;
	
	@Autowired
	private StandardInfoMapper standardInfoMapper;
	@Override
	public List<TestStandard> getAllStandards() {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<TestStandard> map=testStandardMapper.getAllStandards();
		
		return map;
	}
	@Override
	public void input(TestInfoVO testStandardVO) {
		
		testInfoMapper.input(testStandardVO);
		
		standardInfoMapper.input(testStandardVO);
	}
	@Override
	public List<Map<String, Object>> getTestList(String userId, Integer currentPage, Integer rows, String testType,
			Date startDate, Date endDate, String keyWord, String testMode) {
		
		List<Map<String, Object>> list=testStandardMapper.getTestList(userId,testType,startDate,endDate,keyWord,testMode);
		return list;
	}

}
