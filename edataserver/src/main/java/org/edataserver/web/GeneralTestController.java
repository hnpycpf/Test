package org.edataserver.web;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

@Controller
@RequestMapping(value={"/generalTest"})
@ResponseBody
public class GeneralTestController {
	
	@Autowired
	private GeneralTestSerivce generalTestSerivce;
	
	/**
	 * input
	 */
	@GetMapping(value={"/getAllStandards"}) 
    public JSONObject getAllStandards (){
    	JSONObject jb=new JSONObject();
		try {
			List<TestStandard> resMap=generalTestSerivce.getAllStandards();
			jb.put("reusltData", resMap);
			jb.put("success", true);
			jb.put("errorMsg", null);
		} catch (Exception e) {
			jb.put("success", false);
			jb.put("errorMsg",null);
			e.printStackTrace();
		}
    	return jb;
        }
	@PostMapping(value="/input")
	public JSONObject input(@RequestParam TestInfoVO testInfoVO) {
		JSONObject jb=new JSONObject();;
		try {
			generalTestSerivce.input(testInfoVO);
			jb.put("reusltData", jb);
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
	public JSONObject getTestList(@RequestParam String userId,
			@RequestParam Integer currentPage,
			@RequestParam Integer rows,
			@RequestParam String testType,
			@RequestParam Date startDate,
			@RequestParam Date endDate,
			@RequestParam String keyWord,
			@RequestParam String testMode
			) {
		List<Map<String,Object>> list=generalTestSerivce.getTestList(userId,currentPage,rows,testType,startDate,endDate,keyWord,testMode);
				return null;
		
	}
	
}
