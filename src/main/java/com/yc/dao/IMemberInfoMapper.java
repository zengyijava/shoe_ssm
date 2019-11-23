package com.yc.dao;

import java.util.List;

import com.yc.po.MemberInfo;

/**
 * 商品类型
 * 源辰信息
 * @author lydia
 * @2019年8月27日
 */
public interface IMemberInfoMapper {
	/**
	 * 登录
	 * @param bf
	 * @return
	 */
	public MemberInfo login(MemberInfo mf);
	
	/**
	 * 注册
	 * @param bf
	 * @return
	 */
	public int add(MemberInfo mf);
	
	
	public List<MemberInfo> findAll();
}
