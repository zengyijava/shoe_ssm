package com.yc.biz;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.po.GoodsInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class GoodsInfoTest {
	@Autowired
	IGoodsInfoBiz  biz;

	@Test
	public void testFinds() {
		System.out.println(biz.finds());
	}
	
	@Test
	public void testFindByGno() {
		
		System.out.println(biz.findByGno(2));
	}
	
	
	@Test
	public void testFindByPage() {
		
		System.out.println(biz.findByType(1, 1, 2));
	}

	
	@Test
	public void testpageTotal() {
		
		System.out.println(biz.pageTotal(1));
	}
	
	

}
