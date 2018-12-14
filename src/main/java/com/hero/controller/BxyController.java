package com.hero.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.biz.BxyBiz;
import com.hero.model.Bxy;

@Controller
public class BxyController {
	
	@Resource
	private BxyBiz biz;
	
	@RequestMapping("/AddXy")
	public @ResponseBody boolean AddXy(Bxy xy){
		
		return biz.AddXy(xy);
	}
	@RequestMapping("/getXys")
	public @ResponseBody List<Bxy> getXys(Bxy xy){
		
		return biz.getXy(xy);
	}

}
