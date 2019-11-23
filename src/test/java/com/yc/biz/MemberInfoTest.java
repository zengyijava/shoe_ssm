package com.yc.biz;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.po.MemberInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})

public class MemberInfoTest {
	@Autowired
	IMemberInfoBiz biz;

	@Test
	public void testLogin() {
		MemberInfo mf=new MemberInfo();
		mf.setNickName("sam");
		mf.setPwd("a");
		System.out.println(biz.login(mf));
	}
	
	@Test
	public void testAdd() {
		MemberInfo mf=new MemberInfo();
		mf.setNickName("jk");
		mf.setRealName("a");
		mf.setPwd("a");
		mf.setTel("13525583558");
		mf.setEmail("258147@qq.com");
		mf.setPhoto("0000");
		//mf.setRegDate("2018-01-01 1:30:00");
		mf.setStatus(0);
		System.out.println(biz.add(mf));
	}
	
	@Test
	public void testfindAll() {
		System.out.println(biz.findAll());
		
	}

}
