package com.hero.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hero.model.BQd;
@Mapper
public interface bQdDao {
	
	public int AddBQd(BQd qb);
	
	public List<BQd> getAllQds();
	
	public int DeleteQd(Integer id);
	
	public BQd getQd(Integer qdid);
	
	public int UpdateQd(BQd qd);

}
