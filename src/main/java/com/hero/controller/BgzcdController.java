package com.hero.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hero.biz.BgzcdBiz;
import com.hero.model.Bgzcd;

@Controller
public class BgzcdController {
	
	@Resource
	private BgzcdBiz biz;
	
	@RequestMapping("/AddGzcd")
	public @ResponseBody boolean AddGzcd(Bgzcd gzcd) {
		
		return biz.AddGzcd(gzcd);
		
		
	}
	@RequestMapping("/getAllGzcd")
	public @ResponseBody List<Bgzcd> getAllGzcd(){
		
		return biz.getAllGzcd();
	}
	
	@RequestMapping("/DeleteGzcd")
	public @ResponseBody boolean removeGzcd(@RequestParam(value="gzcdid") int gzcdid) {
		
		return biz.DeleteGzcd(gzcdid);
	}
	
	@RequestMapping("/getGzcd")
	public @ResponseBody Bgzcd getGzcd(@RequestParam(value="gzcdid") int gzcdid) {
		
	     Bgzcd abc = biz.getGzcd(gzcdid);
	     
	     System.out.println(abc.getGzcdmc());
		
		return biz.getGzcd(gzcdid);
	}
	@RequestMapping("/UpdateGzcd")
	public @ResponseBody boolean UpdateGzcd(Bgzcd gzcd) {
		
		return biz.UpdateBgzcd(gzcd);
	}

}
