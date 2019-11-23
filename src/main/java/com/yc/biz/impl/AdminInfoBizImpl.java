package com.yc.biz.impl;

import java.util.List;
import java.util.logging.Handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import com.yc.biz.IAdminInfoBiz;
import com.yc.dao.IAdminInfoMapper;
import com.yc.po.AdminInfo;
import com.yc.util.StringUtil;
/**
 * 鍚庡彴绠＄悊鍛樹笟鍔″眰瀹炵幇 
 * @author Lydia
 * @2019骞�09鏈�16鏃�
 */
@Service
public class AdminInfoBizImpl implements IAdminInfoBiz {
	HandlerInterceptor  a;
	
	@Autowired
	IAdminInfoMapper  mapper;

	@Override
	public AdminInfo login(AdminInfo af) {
	 if(StringUtil.isNull(af.getAname(),af.getPwd())){
		 //System.out.println("-----------------");
		 //System.out.println(af.getAname()+"----"+af.getPwd());
		 return null;
	 }
	 	
 		return mapper.login(af);
	}

	@Override
	public int add(AdminInfo af) {
		if(StringUtil.isNull(af.getAname(),af.getPwd(),af.getTel())){
			return -1;
		}
		return mapper.add(af);
	}

	@Override
	public List<AdminInfo> findAll() {
		return mapper.findAll();
	}

	@Override
	public int updatPwd(Integer aid) {
		 if(null==aid){
			 return -1;
		 }
		return mapper.updatPwd(aid);
	}

}
