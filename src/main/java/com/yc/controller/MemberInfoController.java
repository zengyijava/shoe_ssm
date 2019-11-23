package com.yc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.IMemberInfoBiz;
import com.yc.po.AdminInfo;
import com.yc.po.MemberInfo;

@Controller
@RequestMapping("/front")
public class MemberInfoController {
	
	@Autowired
	IMemberInfoBiz biz;
	
	@RequestMapping("/MemberLogin")
	@ResponseBody
	public int login(MemberInfo mf,HttpSession session) {
		MemberInfo info=biz.login(mf);
		//System.out.println(info+"-----------------");
		if(info==null || "".equals(info)) {
			return 0;
		}
		session.setAttribute("loginMember", info);
		return 1;
	}
	
	@RequestMapping("/MemberAdd")
	@ResponseBody
	public int add(MemberInfo mf) {
		int i=biz.add(mf);
		if(i>0) {
			return 1;
		}
		return 0;
	}
	
	
	@RequestMapping("/MemberFindAll")
	@ResponseBody
	public List<MemberInfo> findAll(){
		return biz.findAll();
	}
	

}
