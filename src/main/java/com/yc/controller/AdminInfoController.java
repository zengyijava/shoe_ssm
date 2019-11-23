package com.yc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.IAdminInfoBiz;
import com.yc.po.AdminInfo;

@Controller
@RequestMapping("/back")
public class AdminInfoController {
	@Autowired
	private IAdminInfoBiz  biz;
	
	@RequestMapping("/login")
	@ResponseBody
	public int login(AdminInfo  af,HttpSession session){
		AdminInfo  info = biz.login(af);
		if(info==null || "".equals(info)){
			return 0;
		}
		session.setAttribute("admin", info);
		return 1;
	}
	
	@RequestMapping("/admin/findAll")
	@ResponseBody
	public List<AdminInfo> findAll(){
		return biz.findAll();
	}
	
	@RequestMapping("/admin/add")
	@ResponseBody
	public int add(AdminInfo af){
		return biz.add(af);
	}
	
	@RequestMapping("/admin/update")
	@ResponseBody
	public int update(int aid){
		return biz.updatPwd(aid);
	}
	
	@RequestMapping("/manager")
	public String loginSuccess(){
		return "index";
	}
}
