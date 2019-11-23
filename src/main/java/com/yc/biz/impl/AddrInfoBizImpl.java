package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IAddrInfoBiz;
import com.yc.dao.IAddrInfoMapper;
import com.yc.po.AddrInfo;
@Service
public class AddrInfoBizImpl implements IAddrInfoBiz{
	
	@Autowired
	IAddrInfoMapper mapper;

	@Override
	public int add(AddrInfo af) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(String[] anos) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AddrInfo> findByMno(Integer mno) {
		return mapper.findByMno(mno);
	}

}
