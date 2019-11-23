package com.yc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.IAddrInfoBiz;
import com.yc.po.AddrInfo;
import com.yc.po.MemberInfo;

@Controller
@RequestMapping("/addr")
public class AddrInfoController {
	
	@Autowired
	IAddrInfoBiz biz;
	
	
	@RequestMapping("/findByMno")
	@ResponseBody
	public List<AddrInfo> findByMno(HttpSession session){
		MemberInfo member=(MemberInfo) session.getAttribute("loginMember"); 
		if(member==null) {
			return null;
		}
		return biz.findByMno(member.getMno());
	}

}
