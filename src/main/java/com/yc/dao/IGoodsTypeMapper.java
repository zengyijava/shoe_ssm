package com.yc.dao;

import java.util.List;

import com.yc.po.GoodsType;


public interface IGoodsTypeMapper {
	/**
	 * 查询所有
	 * @return
	 */
	public List<GoodsType> findAll();
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<GoodsType> finds();
	
	/*
	 * 模糊查询
	 */
	public List<GoodsType> findByLike(GoodsType gt);
}
