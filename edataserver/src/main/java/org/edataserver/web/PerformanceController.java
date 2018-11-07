package org.edataserver.web;

import java.util.Map;

import org.edataserver.entity.Performance;
import org.edataserver.service.PerformanceSerivce;
import org.edataserver.service.StandardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value={"/performance"})
public class PerformanceController {
	
	@Autowired
	private PerformanceSerivce performanceSerivce;
	
	//@RequestMapping(value={"/getTestTotal"},method = RequestMethod.GET) 
	@GetMapping(value={"/getTestTotal"})
    @ResponseBody
    public Map<String,Object> getTestTotal (Performance performance){
    	Map<String,Object> resMap=performanceSerivce.getTestTotal(performance);
    	return resMap;
        }
	
	//@RequestMapping(value={"/getRank"},method = RequestMethod.GET) 
	@GetMapping(value={"/getRank"})
    @ResponseBody
    public Map<String,Object> getRank (Performance performance){
    	Map<String,Object> resMap=performanceSerivce.getRank(performance);
    	return resMap;
        }
}
