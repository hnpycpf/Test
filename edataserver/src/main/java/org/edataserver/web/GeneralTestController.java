package org.edataserver.web;

import java.util.List;
import java.util.Map;

import org.edataserver.service.GeneralTestSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value={"/generalTest"})
public class GeneralTestController {
	
	@Autowired
	private GeneralTestSerivce generalTestSerivce;
	/**
	 * input
	 */
	@RequestMapping(value={"/getAllStandards"},method = RequestMethod.GET) 
    @ResponseBody
    public Map<String,Object> input (String testMode,String testName,String testType,String testSkill,String testContent,List<String> standard){
    	Map<String,Object> resMap=generalTestSerivce.input(testMode,testName,testType,testSkill,testContent,standard);
    	return resMap;
        }
	
}
