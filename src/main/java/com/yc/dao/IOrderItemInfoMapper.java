package com.yc.dao;

import java.util.Map;
/**
 * 订单详情
 * 源辰信息
 * @author lydia
 * @2019年8月27日
 */
public interface IOrderItemInfoMapper {
	/**
	 * 添加订单详细
	 * @param map
	 * @return
	 */
	public int add(Map<String, Object> map);
}
