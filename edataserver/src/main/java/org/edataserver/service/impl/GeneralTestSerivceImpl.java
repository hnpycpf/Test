package org.edataserver.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.GeneralTestDao;
import org.edataserver.service.GeneralTestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class GeneralTestSerivceImpl implements GeneralTestSerivce {
	/**
	 * input
	 */
	@Autowired 
	private GeneralTestDao generalTestDao;
	@Override
	public Map<String, Object> input(String testMode,String testName,String testType,String testSkill,String testContent,List<String> standard) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=generalTestDao.input(testMode,testName,testType,testSkill,testContent);
		
		
		if(map.isEmpty()){
			resMap.put("errorMsg", "getAllStandards 失败！");
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
