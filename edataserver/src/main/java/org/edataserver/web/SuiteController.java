package org.edataserver.web;

import java.util.Map;

import org.edataserver.model.Suite;
import org.edataserver.service.SuiteSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value={"/suite"})
public class SuiteController {
	
	@Autowired
	private SuiteSerivce suiteSerivce;
	
	@GetMapping(value={"/input"}) 
    @ResponseBody
    public Map<String,Object> input (Suite suite){
    	Map<String,Object> resMap=suiteSerivce.input(suite);
    	return resMap;
    }
}
