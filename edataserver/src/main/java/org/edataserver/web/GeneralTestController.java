package org.edataserver.web;

import java.util.List;
import java.util.Map;

import org.edataserver.model.StandardInfo;
import org.edataserver.model.TestStandard;
import org.edataserver.service.GeneralTestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping(value={"/generalTest"})
public class GeneralTestController {
	
	@Autowired
	private GeneralTestSerivce generalTestSerivce;
	/**
	 * input
	 */
	@GetMapping(value={"/getAllStandards"}) 
    @ResponseBody
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
	
	
}
