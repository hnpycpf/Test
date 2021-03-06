package org.edataserver.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.StandardInfoMapper;
import org.edataserver.dao.TestInfoMapper;
import org.edataserver.entity.GetList;
import org.edataserver.model.TestInfoVO;
import org.edataserver.service.SpecialtyTestSerivce;
import org.edataserver.service.StandardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class SpecialtyTestServiceimpl implements SpecialtyTestSerivce {
	@Autowired
	private TestInfoMapper testInfoMapper;
	
	@Override
	public Map<String, Object> getList(GetList getList) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		//判断分页信息
		if(getList.getCurrentPage()==null||getList.getRows()==null){
			resMap.put("errorMsg", "分页信息不能为空！");
			resMap.put("resultData", "");
			resMap.put("success", "false");
			return resMap;
		}
		else{
			PageHelper.startPage(getList.getCurrentPage(), getList.getRows());
			List<Map<String,Object>> map=testInfoMapper.getList(getList);
			PageInfo info = new PageInfo(map);
			HashMap<String, Object> resMapList = new HashMap<String,Object>();
			long total = info.getTotal();
			resMapList.put("list", map);
			resMapList.put("total",total);
			if(map.isEmpty()){
				resMap.put("errorMsg", "getList 失败！");
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
	@Override
	public Map<String, Object> getDetail(String testId) {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		TestInfoVO map=testInfoMapper.getDetail(testId);	
		if(map==null){
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

}
