package org.edataserver.web;

import java.util.Map;

import org.edataserver.service.StandardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value={"/standard"})
public class SpecialtyTestController {
	
	@Autowired
	private StandardSerivce modularService;
	
	/*@GetMapping(value={"/getAllStandards"}) 
    @ResponseBody
    public Map<String,Object> getAllStandards (){
    	Map<String,Object> resMap=modularService.getAllStandards();
    	return resMap;
        }*/
}
