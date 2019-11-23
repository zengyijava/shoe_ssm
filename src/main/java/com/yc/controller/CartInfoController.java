package com.yc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.ICartInfoBiz;
import com.yc.po.CartInfo;
import com.yc.po.MemberInfo;

@Controller
@RequestMapping("/cart")
@ResponseBody
public class CartInfoController {
	
	@Autowired
	private ICartInfoBiz biz;
	
	@RequestMapping("/add")
	public int add(CartInfo cf,HttpSession session) {
		//先校验用户是否登录
		MemberInfo memberInfo=(MemberInfo) session.getAttribute("loginMember");
		if(null==memberInfo) {
			return -1;
		}
		cf.setMno(memberInfo.getMno());
		cf.setNum(1);   //num初始值为1
		return biz.add(cf);
	}
	
	//查看当前会员的购物车信息
	@RequestMapping("/finds")
	public List<CartInfo> finds(HttpSession session){
		MemberInfo memberInfo=(MemberInfo) session.getAttribute("loginMember");
		if(null==memberInfo) {
			return null;
		}
		return biz.finds(memberInfo.getMno());
	}
	
	@RequestMapping("/update")
	public int update(CartInfo cf,HttpSession session) {
		MemberInfo memberInfo=(MemberInfo) session.getAttribute("loginMember");
		if(null==memberInfo) {
			return -1;
		}
		return biz.update(cf);
	}
	
	@RequestMapping("/findByMno")
	public List<CartInfo> findByMno(HttpSession session) {
		MemberInfo memberInfo=(MemberInfo) session.getAttribute("loginMember");
		if(null==memberInfo) {
			return null;
		}
		return biz.findByMno(memberInfo.getMno());
	}
	
	//删除
	@RequestMapping("/delCon")
	public int DelCon(Integer cno) {
		return biz.deleteByCno(cno);
	}
	
	
	
}
