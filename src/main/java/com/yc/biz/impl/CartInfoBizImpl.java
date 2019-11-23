package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.ICartInfoBiz;
import com.yc.dao.ICartInfoMapper;
import com.yc.po.CartInfo;
@Service
public class CartInfoBizImpl implements ICartInfoBiz{
	
	@Autowired
	private ICartInfoMapper mapper;

	@Override
	public int add(CartInfo cf) {
		return mapper.add(cf);
	}

	@Override
	public List<CartInfo> findByMno(int mno) {
		
		return mapper.findByMno(mno);
	}

	@Override
	public List<CartInfo> finds(int mno) {
		
		return mapper.finds(mno);
	}

	@Override
	public int delete(String[] cnos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCno(int cno) {
		
		return mapper.deleteByCno(cno);
	}

	@Override
	public int update(CartInfo cf) {
		
		return mapper.update(cf);
	}

	@Override
	public List<CartInfo> findByCnos(String[] cnos) {
		
		return null;
	}

}
