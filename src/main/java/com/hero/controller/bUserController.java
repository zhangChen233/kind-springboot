package com.hero.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.biz.bUserBiz;
import com.hero.model.bUser;

@Controller
public class bUserController {
	
	@Resource
	private bUserBiz biz;
	
	@RequestMapping("/Main")
	public @ResponseBody bUser getUser(@RequestParam(value="userid") int userid) {
		
		return biz.getUserById(userid);
	}
	
	@RequestMapping("/Login")
	public @ResponseBody bUser LoginUser(@RequestParam(value="yhm") String yhm,@RequestParam(value="mm") String mm) {
		
		Map map = new HashMap();
		
		map.put("yhm", yhm);
		
		map.put("mm",mm);
		
		bUser user = biz.CheckLogin(map);
		
		return user;
	}

}
