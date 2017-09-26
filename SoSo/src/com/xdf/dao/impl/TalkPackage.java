package com.xdf.dao.impl;

import com.xdf.bean.User;
import com.xdf.dao.CallDao;
import com.xdf.dao.SendMsgDao;
import com.xdf.dao.ServicePackage;

/**
 * 话唠套餐类
 */
public class TalkPackage extends ServicePackage implements CallDao, SendMsgDao {

	private int talkTime; // 通话时长
	private int sendCounts; // 发送短信条数

	// 用户调用构造时，初始化 话唠套餐数据
	public TalkPackage() {
		this.talkTime = 500;
		this.sendCounts = 30;
		this.price = 58.0;
	}

	public void showInfo() {

	}

	public int sendMessage(User user, int counts) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public int call(User user, int time) throws Exception {
		// TODO Auto-generated method stub
		return 0;
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

}
