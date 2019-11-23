package com.yc.po;

import java.io.Serializable;


public class CartInfo implements Serializable{
	private static final long serialVersionUID = 4256437176822209042L;
	private int cno;
	private int mno;
	private int gno;
	private int num;
	
	private String gname; // 商品名称
	private double price; // 价格
	private String pics; // 图片
	private String unit; // 单位
	private String weight; // 净重
	
	@Override
	public String toString() {
		return "CartInfo [cno=" + cno + ", mno=" + mno + ", gno=" + gno + ", num=" + num + ", gname=" + gname
				+ ", price=" + price + ", pics=" + pics + ", unit=" + unit + ", weight=" + weight + "]";
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPics() {
		return pics;
	}

	public void setPics(String pics) {
		this.pics = pics;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public CartInfo(int cno, int mno, int gno, int num) {
		super();
		this.cno = cno;
		this.mno = mno;
		this.gno = gno;
		this.num = num;
	}

	public CartInfo() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cno;
		result = prime * result + ((gname == null) ? 0 : gname.hashCode());
		result = prime * result + gno;
		result = prime * result + mno;
		result = prime * result + num;
		result = prime * result + ((pics == null) ? 0 : pics.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartInfo other = (CartInfo) obj;
		if (cno != other.cno)
			return false;
		if (gname == null) {
			if (other.gname != null)
				return false;
		} else if (!gname.equals(other.gname))
			return false;
		if (gno != other.gno)
			return false;
		if (mno != other.mno)
			return false;
		if (num != other.num)
			return false;
		if (pics == null) {
			if (other.pics != null)
				return false;
		} else if (!pics.equals(other.pics))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}
}
