package com.hero.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.biz.BQdBiz;
import com.hero.model.BQd;

@Controller
public class BqdController {
	
	@Resource
	private BQdBiz biz;
	
	@RequestMapping("/AddQd")
	public @ResponseBody boolean AddQd(BQd qd) {
		
		return biz.AddBQd(qd);
	}
	@RequestMapping("/getAllQd")
	public @ResponseBody List<BQd> getAllQds(){
		
		return biz.getAllQd();
	}
	@RequestMapping("/DeleteQd")
	public @ResponseBody List<BQd> removeQd(@RequestParam(value="qdid") int qdid){
		
		return biz.DeleteQd(qdid);
	}
	@RequestMapping("/getQd")
	public @ResponseBody BQd getQd(@RequestParam(value="qdid") int qdid) {
		
		return biz.getQd(qdid);
	}
	@RequestMapping("/UpdateQd")
	public @ResponseBody boolean UpdateQd(BQd qd) {
		
		return biz.UpdateB_Qd(qd);
	}
	

}
