package com.yc.biz;

import java.util.List;

import com.yc.po.AdminInfo;
import com.yc.po.MemberInfo;

public interface IMemberInfoBiz {
	/**
	 * 登录
	 */
	public MemberInfo login(MemberInfo mf);
	
	/**
	 * 注册
	 */
	public int add(MemberInfo mf);
	
	
	/*
	 * 查看会员信息
	 */
	public List<MemberInfo> findAll();
	
	
}
