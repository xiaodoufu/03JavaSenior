package com.xdf.dao.impl;

import com.xdf.bean.User;
import com.xdf.dao.CallDao;
import com.xdf.dao.NetDao;
import com.xdf.dao.SendMsgDao;
import com.xdf.dao.ServicePackage;

/**
 * 超人套餐类
 */
public class SuperPackage extends ServicePackage implements NetDao, CallDao,
		SendMsgDao {

	private int flow; // 上网流量
	private int talkTime; // 通话时长
	private int sendCounts; // 发送短信条数

	// 初始化 超人套餐数据
	public SuperPackage() {
		this.flow = 1024 * 1;
		this.talkTime = 200;
		this.sendCounts = 50;
		this.price = 78.0;

	}

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	public int getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}

	public int getSendCounts() {
		return sendCounts;
	}

	public void setSendCounts(int sendCounts) {
		this.sendCounts = sendCounts;
	}

	public int sendMessage(User user, int counts) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int call(User user, int time) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int netPlay(User user, int flows) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public void showInfo() {

	}

}
