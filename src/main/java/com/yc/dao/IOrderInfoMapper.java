package com.yc.dao;

import com.yc.po.OrderInfo;
/**
 * 订单
 * 源辰信息
 * @author lydia
 * @2019年8月27日
 */
public interface IOrderInfoMapper {
	/**
	 * 添加订单的方法
	 * @param of
	 * @return
	 */
	public int add(OrderInfo of);
}
