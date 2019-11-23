package com.yc.biz;

import java.util.List;

import com.yc.po.AddrInfo;


public interface IAddrInfoBiz {
	
	/**
	 * 娣诲姞鍦板潃淇℃伅
	 * @param af
	 * @return
	 */
	public int add(AddrInfo af);
	
	/**
	 * 淇敼榛樿鍦板潃
	 * @param af
	 * @return
	 */
	public int update(String[] anos);

	/**
	 * 鏌ヨ鎸囧畾浼氬憳鐨勫湴鍧�淇℃伅
	 * @param mno
	 * @return
	 */
	public List<AddrInfo> findByMno(Integer mno);
}
