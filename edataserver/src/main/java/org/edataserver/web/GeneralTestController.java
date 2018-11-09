package org.edataserver.web;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.edataserver.entity.GetList;
import org.edataserver.entity.TestInfoVO;
import org.edataserver.model.StandardInfo;
import org.edataserver.model.TestStandard;
import org.edataserver.service.GeneralTestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value={"/generalTest"})
@ResponseBody
public class GeneralTestController {
	
	@Autowired
	private GeneralTestSerivce generalTestSerivce;
	//cpf
	@PostMapping(value="/input")
	public JSONObject input(TestInfoVO testInfoVO) {
		JSONObject jb=new JSONObject();;
		try {
			generalTestSerivce.input(testInfoVO);
			jb.put("success", true);
			jb.put("errorMsg", null);
		} catch (Exception e) {
			jb.put("success", false);
			jb.put("errorMsg", null);
			e.printStackTrace();
		}
		return jb;
		
	}
	@GetMapping(value="/getTestList")
	public JSONObject getTestList(@RequestParam(required=false) String userId,
			@RequestParam(required=false,defaultValue="1")Integer currentPage,
			@RequestParam(required=false,defaultValue="10")Integer rows,
			@RequestParam(required=false)String testType,
			@RequestParam(required=false)Date startDate,
			@RequestParam(required=false)Date endDate,
			@RequestParam(required=false)String keyWord,
			@RequestParam(required=false)String testMode
			) {
		JSONObject jb=new JSONObject();
		try {
			JSONObject jbTwo=new JSONObject();
			PageHelper.startPage(currentPage, rows);
			List<Map<String,Object>> list=generalTestSerivce.getTestList(userId,currentPage,rows,testType,startDate,endDate,keyWord,testMode);
			PageInfo info = new PageInfo(list);
			long total = info.getTotal();
			jbTwo.put("total", total);
			jbTwo.put("list", list);
			jb.put("success", true);
			jb.put("errorMsg", null);
			jb.put("resultData", jbTwo);
		} catch (Exception e) {
			jb.put("success", false);
			jb.put("errorMsg", null);
			e.printStackTrace();
		}
		return jb;
		
	}
	//wh
	@GetMapping(value={"/getResult"}) 
    @ResponseBody
    public Map<String,Object> getResult (String testId){
    	Map<String,Object> resMap=generalTestSerivce.getResult(testId);
    	return resMap;
    }
	@GetMapping(value={"/getDetail"}) 
    @ResponseBody
    public Map<String,Object> getDetail (String testId){
    	Map<String,Object> resMap=generalTestSerivce.getDetail(testId);
    	return resMap;
    }
}
