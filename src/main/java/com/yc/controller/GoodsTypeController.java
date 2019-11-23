package com.yc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.biz.IGoodsTypeBiz;
import com.yc.po.GoodsType;

@Controller
@RequestMapping("/type")
@ResponseBody
public class GoodsTypeController {

	@Autowired
	private IGoodsTypeBiz biz;
	
	@RequestMapping("/findAll")
	public List<GoodsType>  findAll(){
		return biz.findAll();
	}
	
	@RequestMapping("/finds")
	public List<GoodsType> finds(){
		return biz.finds();
	}
	
	@RequestMapping("/findByLike")
	@ResponseBody
	public List<GoodsType> findByList(GoodsType gt){
		return biz.findByLike(gt);
	}
	
}
