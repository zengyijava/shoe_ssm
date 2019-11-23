package com.yc.biz;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.po.GoodsType;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value= {"classpath:spring-bean.xml"})
public class GoodsTypeTest {
	
	@Autowired
	IGoodsTypeBiz biz;

	@Test
	public void test() {
		GoodsType gt=new GoodsType();
		gt.setTname("新");
		System.out.println(biz.findByLike(gt));
	}
	
	@Test
	public void testFindAll() {
		System.out.println(biz.findAll());
	}


}
