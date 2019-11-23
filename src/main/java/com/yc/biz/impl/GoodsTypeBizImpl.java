package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IGoodsTypeBiz;
import com.yc.dao.IGoodsTypeMapper;
import com.yc.po.GoodsType;
@Service
public class GoodsTypeBizImpl  implements IGoodsTypeBiz{
	@Autowired
	IGoodsTypeMapper  mapper;

	@Override
	public List<GoodsType> findAll() {
		return mapper.findAll();
	}

	@Override
	public List<GoodsType> finds() {
		return mapper.finds();
	}

	@Override
	public List<GoodsType> findByLike(GoodsType gt) {
		return mapper.findByLike(gt);
	}

}
