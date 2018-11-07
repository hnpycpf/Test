package org.edataserver.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.StandardInfoMapper;
import org.edataserver.dao.TestStandardMapper;
import org.edataserver.dao.TypeMapper;
import org.edataserver.model.TestStandard;
import org.edataserver.service.StandardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StandardServiceimpl implements StandardSerivce {
	@Autowired
	private StandardInfoMapper standardInfoMapper;
	
	@Autowired
	private TestStandardMapper testStandardMapper;
	
	@Autowired
	private TypeMapper typeMapper;
	
	@Override
	public Map<String, Object> getAllStandards() {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=standardInfoMapper.getAllStandards();
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

	@Override
	public Map<String, Object> input(TestStandard testStandard) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//加入创建时间
		Date date=new Date();
		testStandard.setCreatetime(date);
		//插入数据
		int i=testStandardMapper.input(testStandard);
		//添加返回信息
		resMap.put("errorMsg", "");
		resMap.put("result", i);
		resMap.put("success", "true");
		return resMap;
	}

	@Override
	public Map<String, Object> getStandardTypeList() {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=typeMapper.getStandardTypeList();
		if(map.isEmpty()){
			resMap.put("errorMsg", "getStandardTypeList 失败！");
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
