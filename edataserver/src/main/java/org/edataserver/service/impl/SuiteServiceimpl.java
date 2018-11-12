package org.edataserver.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.SuiteMapper;
import org.edataserver.entity.GetSuitList;
import org.edataserver.entity.SuitStandard;
import org.edataserver.model.Suite;
import org.edataserver.service.SuiteSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class SuiteServiceimpl implements SuiteSerivce {
	@Autowired
	private SuiteMapper suiteMapper;

	@Override
	public Map<String, Object> input(Suite suite) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//添加创建时间
		Date date=new Date();
		suite.setCreatetime(date);
		//输入标准 取出id
		suiteMapper.input(suite);
		List<String> list=suite.getSuitStandard();
		if(list==null||list.size()==0){
			resMap.put("errorMsg", "SuitStandard为空");
			resMap.put("resultData", "");
			resMap.put("success", "false");
			return resMap;
		}
		//遍历入库standard_id
		for(String sid : list) {
			  //System.out.println(sid);
			  SuitStandard suitStandard=new SuitStandard();
			  suitStandard.setSuite_id(suite.getSuitId());
			  //System.out.println();
			  suitStandard.setStandard_id(sid);
			  suitStandard.setCreatetime(date);
			  suiteMapper.iputSuitStandard(suitStandard);
			}
		//返回状态值
			resMap.put("errorMsg", "");
			resMap.put("resultData", "");
			resMap.put("success", "true");

		return resMap;
	}

	@Override
	public Map<String, Object> getDetail(String sutiId) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=suiteMapper.getDetail(sutiId);
		if(map.isEmpty()){
			resMap.put("errorMsg", "getDetail 失败！");
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
	public Map<String, Object> update(Suite suite) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		int i=suiteMapper.updateByPrimaryKeySelective(suite);
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
	public Map<String, Object> getSuitById(String sutiId) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=suiteMapper.getSuitById(sutiId);
		if(map.isEmpty()){
			resMap.put("errorMsg", "getDetail 失败！");
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
	public Map<String, Object> delete(String suitId) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		int i=suiteMapper.deleteByPrimaryKey(suitId);
		if(i==0){
			resMap.put("errorMsg", "delete 失败！");
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
	public Map<String, Object> getSuitList(GetSuitList getSuitList) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		PageHelper.startPage(getSuitList.getCurrentPage(), getSuitList.getRows());
		List<Map<String,Object>> map=suiteMapper.getSuitList(getSuitList);
		PageInfo info = new PageInfo(map);
		long total = info.getTotal();
		HashMap<String, Object> resMapList = new HashMap<String,Object>();
		resMapList.put("total", total);
		resMapList.put("list",map);
		if(map.isEmpty()){
			resMap.put("errorMsg", "getDetail 失败！");
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
