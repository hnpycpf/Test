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
	 * cpf
	 * 
	 */
	@Autowired 
	private TestStandardMapper testStandardMapper;
	
	@Autowired
	private TestInfoMapper testInfoMapper;
	
	@Autowired
	private StandardInfoMapper standardInfoMapper;
	
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
	
	//wh
	@Override
	public Map<String, Object> getResult(String testId) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=testInfoMapper.getResult(testId);
		if(map.isEmpty()){
			resMap.put("errorMsg", "getResult 失败！");
			resMap.put("result", map);
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("result", map);
			resMap.put("success", "true");
		}
		return resMap;
	}
	
	@Override
	public Map<String, Object> getDetail(String testId) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=testInfoMapper.GeneralTestgetDetail(testId);
		if(map.isEmpty()){
			resMap.put("errorMsg", "getDetail 失败！");
			resMap.put("result", map);
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("result", map);
			resMap.put("success", "true");
		}
		return resMap;
	}

}
