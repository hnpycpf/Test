package org.edataserver.web;

import java.util.Map;

import org.edataserver.service.ModularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value={"/standard"})
public class ModularController {
	
	@Autowired
	private ModularService modularService;
	
	@RequestMapping(value={"/getAllStandards"},method = RequestMethod.GET) 
    @ResponseBody
    public Map<String,Object> getAllStandards (){
    	Map<String,Object> resMap=modularService.getAllStandards();
    	return resMap;
        }
}
