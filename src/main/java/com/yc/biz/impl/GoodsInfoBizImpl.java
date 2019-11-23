package com.yc.biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.biz.IGoodsInfoBiz;
import com.yc.dao.IGoodsInfoMapper;
import com.yc.dao.IGoodsTypeMapper;
import com.yc.po.GoodsInfo;
import com.yc.po.GoodsType;
import com.yc.util.StringUtil;
@Service

public class GoodsInfoBizImpl  implements IGoodsInfoBiz{
	@Autowired
	private IGoodsInfoMapper mapper;
	@Autowired
	private IGoodsTypeMapper typeMapper;

	@Override
	public int add(GoodsInfo gf) {
		
		 if(StringUtil.isNull(gf.getGname(),gf.getPrice()+"",gf.getPics())){   
			 return -1;
		 }
		return mapper.add(gf);
	}
	
	@Override
	public Map<String, Object> finds() {
		//查看所有商品类型
		List<GoodsType> types=typeMapper.findAll();
		//System.out.println(types+"--------------------");
		//查看每种类型的前四条记录
		List<GoodsInfo> goods=mapper.finds();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("types", types);
		map.put("goods",goods);
		//System.out.println(map+"---------------------------");
		return map;
	}
	

	/*
	 * 商品类型编号
	 * page 第几页
	 * 每页显示多少行
	 */
	@Override
	public List<GoodsInfo> findByType(Integer tno, int page, int rows) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("tno", tno);
		map.put("page", (page-1)*rows);
		map.put("rows", rows);
		return mapper.findByType(map);
		
	}

	@Override
	public GoodsInfo findByGno(int gno) {
		
		return mapper.findByGno(gno);
	}

	@Override
	public Map<String, Object> findByFirst(Integer tno, int page, int rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int pageTotal(int tno) {
		return mapper.getTotal(tno);
	}

	

}
