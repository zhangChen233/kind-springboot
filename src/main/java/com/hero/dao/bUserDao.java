package com.hero.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.hero.model.bUser;

@Mapper
public interface bUserDao {
	
	public List<bUser> getUserByCondtion(Map map);
	
	public bUser getUserById(Integer id);

}
