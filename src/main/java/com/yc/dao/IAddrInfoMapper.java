package com.yc.dao;

import java.util.List;

import com.yc.po.AddrInfo;
 

/**
 * 地址类
 * 源辰信息
 * @author lydia
 * @2019年8月27日
 */
public interface IAddrInfoMapper {
	/**
	 * 添加地址信息
	 * @param af
	 * @return
	 */
	public int add(AddrInfo af);
	
	/**
	 * 修改默认地址
	 * @param af
	 * @return
	 */
	public int update(int mno);
	
	/**
	 * 修改默认地址
	 * @param af
	 * @return
	 */
	public int updates(String[] anos);

	/**
	 * 查询指定会员的地址信息
	 * @param mno
	 * @return
	 */
	public List<AddrInfo> findByMno(Integer mno);
}
