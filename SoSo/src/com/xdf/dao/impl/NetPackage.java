package com.xdf.dao.impl;

import com.xdf.bean.User;
import com.xdf.dao.NetDao;
import com.xdf.dao.ServicePackage;

/**
 *  网虫套餐类
 */
public class NetPackage extends ServicePackage implements NetDao {

	private int flow; // 上网流量

	// 用户调用构造时，初始化 网虫套餐数据
	public NetPackage() {
		this.flow = 1024 * 3;
		this.price = 68.0;
	}

	public int netPlay(User user, int flows) throws Exception {
		return 0;
	}

	public void showInfo() {

	}

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

}
