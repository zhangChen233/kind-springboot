package com.hero.biz;

import java.util.List;

import com.hero.model.Bgzcd;

public interface BgzcdBiz {
	
	public boolean AddGzcd(Bgzcd gzcd);
	
	public List<Bgzcd> getAllGzcd();
	
	public boolean DeleteGzcd(Integer id);
	
	public Bgzcd getGzcd(Integer gzcdid);
	
	public boolean UpdateBgzcd(Bgzcd gzcd);

}
