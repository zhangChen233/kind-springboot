package com.hero.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hero.model.Bxy;

@Mapper
public interface bXyDao {
	
	public int DeleteXyByQdId(Integer qdid);
	
	public int AddXy(Bxy xy);
	
	public List<Bxy> getXyByCondition(Bxy xy);

}
