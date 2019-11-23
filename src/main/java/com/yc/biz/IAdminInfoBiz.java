package com.yc.biz;

import java.util.List;

import com.yc.po.AdminInfo;



public interface IAdminInfoBiz {
	/**
	 * 登陆
	 * @param af
	 * @return
	 */
	public AdminInfo login(AdminInfo af);
	
	/**
	 * 娣诲姞鍚庡彴绠＄悊淇℃伅
	 * @return
	 */
	public int add(AdminInfo af);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<AdminInfo> findAll();
	
	/**
	 * 修改密码
	 * @param aid
	 * @return
	 */
	public int updatPwd(Integer aid);
}	
