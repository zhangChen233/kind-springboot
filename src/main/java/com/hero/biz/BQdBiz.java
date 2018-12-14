package com.hero.biz;

import java.util.List;

import com.hero.model.BQd;

public interface BQdBiz {
	
	public boolean AddBQd(BQd qd);
	
	public List<BQd> getAllQd();
	
	public List<BQd> DeleteQd(Integer id);
	
	public BQd getQd(Integer qdid);
	
	public boolean UpdateB_Qd(BQd qd);

}
