package com.yc.dao;

import java.util.List;
import java.util.Map;

import com.yc.po.GoodsInfo;


/**
 * 商品类型
 * 
 */
public interface IGoodsInfoMapper {
	/**
	 * 添加商品信息
	 * @param gf
	 * @return
	 */
	public int add(GoodsInfo gf);
	
	
	
	
	//public Map<String,Object> find();
	
	/**
	 * 查询每种类型的商品的前四条数据
	 * @return
	 */
	
	public List<GoodsInfo> finds();

	/**
	 * 根据类型分页查询
	 * @return
	 */
	public List<GoodsInfo> findByType(Map<String, Integer> map);

	/**
	 * 根据商品编号，查询商品信息
	 * @param gno
	 * @return
	 */
	public GoodsInfo findByGno(int gno);
	
	/**
	 * 根据类型获取商品数量
	 * @param tno 类型编号
	 * @return
	 */
	public int getTotal(Integer tno);
	
	/**
	 * 根据购物车编号修改库存量
	 * @param cnos
	 * @return
	 */
	public int updateStore(String[] cnos);
	
	/**
	 * 后台查看所有的商品信息
	 * @return
	 */
	public List<GoodsInfo> findAll();
}
