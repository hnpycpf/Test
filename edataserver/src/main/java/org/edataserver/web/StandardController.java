package org.edataserver.web;

import java.util.Map;

import org.edataserver.model.TestStandard;
import org.edataserver.service.StandardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping(value={"/standard"})
public class StandardController {
	
	@Autowired
	private StandardSerivce standardService;
	
	@GetMapping(value={"/getAllStandards"}) 
    @ResponseBody
    public Map<String,Object> getAllStandards (){
    	Map<String,Object> resMap=standardService.getAllStandards();
    	return resMap;
        }
	
	@GetMapping(value={"/input"}) 
    @ResponseBody
    public Map<String,Object> input (TestStandard testStandard){
    	Map<String,Object> resMap=standardService.input(testStandard);
    	return resMap;
        }
	
	@GetMapping(value={"/getStandardTypeList"}) 
    @ResponseBody
    public Map<String,Object> getStandardTypeList (){
    	Map<String,Object> resMap=standardService.getStandardTypeList();
    	return resMap;
        }
}
