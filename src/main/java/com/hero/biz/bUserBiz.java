package com.hero.biz;

import java.util.Map;

import com.hero.model.bUser;

public interface bUserBiz {
	
	public bUser CheckLogin(Map map);
	
	public bUser getUserById(Integer id);

}
