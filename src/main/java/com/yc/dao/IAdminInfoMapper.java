package com.yc.dao;

import java.util.List;

import com.yc.po.AdminInfo;


/**
 * 后台管理员DAO层
 * 源辰信息
 * @author lydia
 * @2019年8月27日
 */
public interface IAdminInfoMapper {
	/**
	 * 后台管理员登录
	 * @param af
	 * @return
	 */
	public AdminInfo login(AdminInfo af);
	
	/**
	 * 添加后台管理信息
	 * @return
	 */
	public int add(AdminInfo af);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<AdminInfo> findAll();
	
	/**
	 * 重置密码
	 * @param aid
	 * @return
	 */
	public int updatPwd(Integer aid);
}
