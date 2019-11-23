package com.yc.biz;

import com.yc.po.OrderInfo;

public interface IOrderInfoBiz {
	/**
	 * 下单的方法
	 * @param of
	 * @return
	 */
	public int add(OrderInfo of);
}
