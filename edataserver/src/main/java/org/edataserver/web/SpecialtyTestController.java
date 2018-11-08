package org.edataserver.web;

import java.util.Map;

import org.edataserver.entity.GetList;
import org.edataserver.service.SpecialtyTestSerivce;
import org.edataserver.service.StandardSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value={"/specialtyTest"})
public class SpecialtyTestController {
	
	@Autowired
	private SpecialtyTestSerivce specialtyTestSerivce;
	
	@GetMapping(value={"/getList"}) 
    @ResponseBody
    public Map<String,Object> getList (GetList getList){
    	Map<String,Object> resMap=specialtyTestSerivce.getList(getList);
    	return resMap;
    }
	@GetMapping(value={"/getDetail"}) 
    @ResponseBody
    public Map<String,Object> getDetail (String testId){
    	Map<String,Object> resMap=specialtyTestSerivce.getDetail(testId);
    	return resMap;
    }
}
