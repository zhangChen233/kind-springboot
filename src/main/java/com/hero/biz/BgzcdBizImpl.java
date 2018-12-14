package com.hero.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hero.dao.BgzcdDao;
import com.hero.model.Bgzcd;
@Service
public class BgzcdBizImpl implements BgzcdBiz {
	@Resource
	private BgzcdDao dao;
	
	

	@Override
	public boolean AddGzcd(Bgzcd gzcd) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		int rows = dao.AddGzcd(gzcd);
		
		if(rows>0) {
			
			flag = true;
		}
		
		return flag;
	}

	@Override
	public List<Bgzcd> getAllGzcd() {
		// TODO Auto-generated method stub
		return dao.getAllGzcd();
	}

	@Override
	public boolean DeleteGzcd(Integer id) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		int row1 = dao.DeleteGzcd(id);
		
		if(row1>0){
			
			flag = true;
		}
		
		return flag;
	}

	@Override
	public Bgzcd getGzcd(Integer gzcdid) {
		// TODO Auto-generated method stub
		return dao.getGzcd(gzcdid);
	}

	@Override
	public boolean UpdateBgzcd(Bgzcd gzcd) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		int rows = dao.UpdateGzcd(gzcd);
		
		if(rows>0) {
			
			flag = true;
		}
		
		return flag;
	}


}
