package com.hero.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hero.dao.bXyDao;
import com.hero.model.Bxy;
@Service
public class BxyBizImpl implements BxyBiz {
	
	@Resource
	private bXyDao dao;

	@Override
	public boolean AddXy(Bxy xy) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		int rows = dao.AddXy(xy);
		
		if(rows>0) {
			
			flag = true;
		}
		
		return flag;
	}

	@Override
	public List<Bxy> getXy(Bxy xy) {
		// TODO Auto-generated method stub
		return dao.getXyByCondition(xy);
	}

}
