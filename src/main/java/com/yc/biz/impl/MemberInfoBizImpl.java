package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IMemberInfoBiz;
import com.yc.dao.IMemberInfoMapper;
import com.yc.po.MemberInfo;
import com.yc.util.StringUtil;
@Service
public class MemberInfoBizImpl implements IMemberInfoBiz{
	
	@Autowired
	IMemberInfoMapper mapper;

	public MemberInfo login(MemberInfo mf) {
		
		if(StringUtil.isNull(mf.getNickName(),mf.getPwd())) {
			
			return null;
		}
		return mapper.login(mf);
	}

	@Override
	public int add(MemberInfo mf) {
		return mapper.add(mf);
	}

	@Override
	public List<MemberInfo> findAll() {
		return mapper.findAll();
	}

}
