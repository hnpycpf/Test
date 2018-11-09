package org.edataserver.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.SuiteMapper;
import org.edataserver.entity.SuitStandard;
import org.edataserver.model.Suite;
import org.edataserver.service.SuiteSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
			resMap.put("result", "");
			resMap.put("success", "false");
			return resMap;
		}
		//遍历入库standard_id
		for(String sid : list) {
			  System.out.println(sid);
			  SuitStandard suitStandard=new SuitStandard();
			  suitStandard.setSuite_id(suite.getId());
			  System.out.println();
			  suitStandard.setStandard_id(sid);
			  suitStandard.setCreatetime(date);
			  suiteMapper.iputSuitStandard(suitStandard);
			}
		//返回状态值
			resMap.put("errorMsg", "");
			resMap.put("result", "");
			resMap.put("success", "true");

		return resMap;
	}

}
