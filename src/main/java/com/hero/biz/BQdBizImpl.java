package com.hero.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hero.dao.bQdDao;
import com.hero.dao.bXyDao;
import com.hero.model.BQd;

@Service
public class BQdBizImpl implements BQdBiz {
	
	@Resource
	private bQdDao dao;
	@Resource
	private bXyDao xydao;

	@Override
	public boolean AddBQd(BQd qd) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		int rows = dao.AddBQd(qd);
		
		if(rows>0) {
			
			flag = true;
		}
		return flag;
	}

	@Override
	public List<BQd> getAllQd() {
		// TODO Auto-generated method stub
		return dao.getAllQds();
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public List<BQd> DeleteQd(Integer id) {
		
		int row1 = xydao.DeleteXyByQdId(id);
		
		int row2 = dao.DeleteQd(id);
		return dao.getAllQds();
	}

	@Override
	public BQd getQd(Integer qdid) {
		// TODO Auto-generated method stub
		return dao.getQd(qdid);
	}

	@Override
	public boolean UpdateB_Qd(BQd qd) {
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		int rows = dao.UpdateQd(qd);
		
		if(rows>0) {
			
			flag = true;
		}
		return flag;
	}

	

}
