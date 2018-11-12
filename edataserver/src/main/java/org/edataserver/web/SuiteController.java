package org.edataserver.web;

import java.util.Map;

import org.edataserver.entity.GetSuitList;
import org.edataserver.model.Suite;
import org.edataserver.service.SuiteSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value={"/suite"})
public class SuiteController {
	
	@Autowired
	private SuiteSerivce suiteSerivce;
	
	@PostMapping(value={"/input"}) 
    @ResponseBody
    public Map<String,Object> input (Suite suite){
    	Map<String,Object> resMap=suiteSerivce.input(suite);
    	return resMap;
    }
	@GetMapping(value={"/getSuitList"}) 
    @ResponseBody
    public Map<String,Object> getSuitList (GetSuitList getSuitList ){
    	Map<String,Object> resMap=suiteSerivce.getSuitList(getSuitList);
    	return resMap;
    }
	@GetMapping(value={"/getDetail"}) 
    @ResponseBody
    public Map<String,Object> getDetail (String sutiId){
    	Map<String,Object> resMap=suiteSerivce.getDetail(sutiId);
    	return resMap;
    }
	@GetMapping(value={"/getSuitById"}) 
    @ResponseBody
    public Map<String,Object> getSuitById (String sutiId){
    	Map<String,Object> resMap=suiteSerivce.getSuitById(sutiId);
    	return resMap;
    }
    @PutMapping(value={"/update"}) 
    @ResponseBody
    public Map<String,Object> update (Suite suite){
    	Map<String,Object> resMap=suiteSerivce.update(suite);
    	return resMap;
    }
    @DeleteMapping(value={"/delete"}) 
    @ResponseBody
    public Map<String,Object> delete (String suitId){
    	Map<String,Object> resMap=suiteSerivce.delete(suitId);
    	return resMap;
    }
}
