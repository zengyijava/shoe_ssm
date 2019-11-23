package com.yc.biz;

import java.util.List;
import java.util.Map;

import com.yc.po.GoodsInfo;


public interface IGoodsInfoBiz {
	/**
	 * 添加商品信息
	 * @param gf
	 * @return
	 */
	public int add(GoodsInfo gf);
	
	//public List<GoodsInfo> finds();
	
	public Map<String, Object> finds();
	
	/**
	 * 根据类型分页查询
	 * @return
	 */
	public List<GoodsInfo> findByType(Integer tno, int page, int rows);
	
	/**
	 * 根据商品编号，查询商品信息
	 * @param gno
	 * @return
	 */
	public GoodsInfo findByGno(int gno);
	
	
	public Map<String, Object> findByFirst(Integer tno, int page, int rows);    
	
	
	public int pageTotal(int tno);
}
