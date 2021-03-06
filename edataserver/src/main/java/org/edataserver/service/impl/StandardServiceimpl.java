package org.edataserver.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.StandardInfoMapper;
import org.edataserver.dao.TestStandardMapper;
import org.edataserver.dao.TypeMapper;
import org.edataserver.entity.GetStandardList;
import org.edataserver.model.TestStandard;
import org.edataserver.service.StandardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
		List<Map<String,Object>> map=testStandardMapper.getAllStandards();
		if(map.isEmpty()){
			resMap.put("errorMsg", "getAllStandards 失败！");
			resMap.put("resultData", map);
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("resultData", map);
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
		if(i==0){
			resMap.put("errorMsg", "getStandardTypeList 失败！");
			resMap.put("resultData", "");
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("resultData", "");
			resMap.put("success", "true");
		}
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
			resMap.put("resultData", map);
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("resultData", map);
			resMap.put("success", "true");
		}
		return resMap;		
	}

	@Override
	public Map<String, Object> getStandardList(GetStandardList getStandardList) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		//判断分页信息
		if(getStandardList.getCurrentPage()==null||getStandardList.getRows()==null){
			resMap.put("errorMsg", "分页信息不能为空！");
			resMap.put("resultData", "");
			resMap.put("success", "false");
			return resMap;
		}
		else{
			PageHelper.startPage(getStandardList.getCurrentPage(), getStandardList.getRows());
			List<Map<String,Object>> map=testStandardMapper.getStandardList(getStandardList);
			PageInfo info = new PageInfo(map);
			Map<String,Object> resMapList=new HashMap<String, Object>();
			long total = info.getTotal();
			resMapList.put("total", total);
			resMapList.put("list", map);
			if(map.isEmpty()){
				resMap.put("errorMsg", "getStandardList 失败 或无匹配数据！");
				resMap.put("resultData", resMapList);
				resMap.put("success", "false");
			}
			else{
				resMap.put("errorMsg", "");
				resMap.put("resultData", resMapList);
				resMap.put("success", "true");
			}
			return resMap;		
		}
	}
	//20181108-wh
	@Override
	public Map<String, Object> getStandardById(String standardId) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=testStandardMapper.getStandardById(standardId);
		if(map.isEmpty()){
			resMap.put("errorMsg", "getStandardById 失败！");
			resMap.put("resultData", map);
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("resultData", map);
			resMap.put("success", "true");
		}
		return resMap;		
	}

	@Override
	public Map<String, Object> update(TestStandard testStandard) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		int i=testStandardMapper.updateByPrimaryKeySelective(testStandard);
		if(i==0){
			resMap.put("errorMsg", "update 失败！");
			resMap.put("resultData", "");
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("resultData", "");
			resMap.put("success", "true");
		}
		return resMap;
	}

	@Override
	public Map<String, Object> delete(String standardId) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		int i=testStandardMapper.deleteByPrimaryKey(standardId);
		if(i==0){
			resMap.put("errorMsg", "update 失败！");
			resMap.put("resultData", "");
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("resultData", "");
			resMap.put("success", "true");
		}
		return resMap;
	}



}
