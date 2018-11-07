package org.edataserver.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.edataserver.dao.PerformanceDao;
import org.edataserver.entity.Performance;
import org.edataserver.service.PerformanceSerivce;

import org.edataserver.dao.StandardInfoMapper;

import org.edataserver.service.StandardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PerformanceServiceimpl implements PerformanceSerivce {
	@Autowired
	private PerformanceDao performanceDao;
	@Override
	public Map<String, Object> getTestTotal(Performance performance) {
		//创建返回状态值

		Map<String,Object> resMap=new HashMap<String, Object>();
		//判断季度是否有值
		String quarter=performance.getQuarter();
		if(quarter.length()!=0){
			if(quarter.equals("1")){
				String startDate=performance.getYear()+"-1";
				String endDate=performance.getYear()+"-3";
				performance.setStartDate(startDate);
				performance.setEndDate(endDate);
			}else
			if(quarter.equals("2")){
				String startDate=performance.getYear()+"-4";
				String endDate=performance.getYear()+"-6";
				performance.setStartDate(startDate);
				performance.setEndDate(endDate);
			}else
			if(quarter.equals("3")){
				String startDate=performance.getYear()+"-7";
				String endDate=performance.getYear()+"-9";
				performance.setStartDate(startDate);
				performance.setEndDate(endDate);
			}else
			if(quarter.equals("4")){
				String startDate=performance.getYear()+"-10";
				String endDate=performance.getYear()+"-12";
				performance.setStartDate(startDate);
				performance.setEndDate(endDate);
			}
		}
		//入库
		
		List<Map<String,Object>> map=performanceDao.getTestTotal(performance);
		/*Map<String,Object> resMap=new HashMap<String, Object>();
		//查询
		List<Map<String,Object>> map=standardInfoMapper.getAllStandards();
		if(map.isEmpty()){
			resMap.put("errorMsg", "getTestTotal 失败！");
			resMap.put("result", map);
			resMap.put("success", "false");
		}
		else{
			resMap.put("errorMsg", "");
			resMap.put("result", map);
			resMap.put("success", "true");
		}*/
		
		return null;
	}

}
