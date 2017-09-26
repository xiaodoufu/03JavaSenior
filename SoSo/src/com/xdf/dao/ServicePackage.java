package com.xdf.dao;

/**
 * 所有套餐的父类
 * 
 * 01.有一个公共的属性   套餐价格
 * 02.每个用户购买对应套餐之后 需要看到  套餐信息 ！  showInfo
 */
public abstract class ServicePackage {

	protected double price; // 套餐价格

	/**
	 * 显示当前套餐信息的方法
	 */
	public abstract void showInfo();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
