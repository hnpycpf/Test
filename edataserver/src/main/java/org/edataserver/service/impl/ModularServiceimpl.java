package org.edataserver.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.ModularDao;
import org.edataserver.service.ModularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ModularServiceimpl implements ModularService {
	@Autowired
	private ModularDao modularDao;
	
	@Override
	public Map<String, Object> getAllStandards() {
		//创建返回状态值
		Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=modularDao.getAllStandards();
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