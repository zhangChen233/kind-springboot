package com.hero.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hero.model.Bgzcd;

@Mapper
public interface BgzcdDao {
	
	public int AddGzcd(Bgzcd gzcd);
	
	public List<Bgzcd> getAllGzcd();
	
	public int DeleteGzcd(Integer id);
	
	public Bgzcd getGzcd(Integer gzcdid);
	
	public int UpdateGzcd(Bgzcd gzcd);

}
