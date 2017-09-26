package com.xdf.bean;

import org.apache.log4j.Logger;

import com.xdf.dao.ServicePackage;

/**
 * 用户对应的实体类
 */
public class User {

	Logger log = Logger.getLogger(User.class);

	private String userName; // 用户名
	private String phoneNum; // 手机号
	private String password; // 密码
	private int realTalkTime; // 实际通话时长
	private int realFlow; // 实际上网流量
	private int realSendMsg; // 实际发送短信数量
	private ServicePackage servicePackage; // 用户手机号对应的套餐类型
	private double money; // 用户手机号中的余额
	private double consumMoney; // 用户手机号中的实际消费金额

	/**
	 * 显示注册用户的信息 以及对应手机号套餐的信息
	 */
	public void showUserMsg() {
		System.out.println("注册用户的姓名是：" + this.userName);
		System.out.println("注册用户的手机号是：" + this.phoneNum);
		System.out.println("注册用户的余额是：" + this.money);
		// 显示套餐的信息
		servicePackage.showInfo();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRealTalkTime() {
		return realTalkTime;
	}

	public void setRealTalkTime(int realTalkTime) {
		this.realTalkTime = realTalkTime;
	}

	public int getRealFlow() {
		return realFlow;
	}

	public void setRealFlow(int realFlow) {
		this.realFlow = realFlow;
	}

	public int getRealSendMsg() {
		return realSendMsg;
	}

	public void setRealSendMsg(int realSendMsg) {
		this.realSendMsg = realSendMsg;
	}

	public ServicePackage getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(ServicePackage servicePackage) {
		this.servicePackage = servicePackage;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getConsumMoney() {
		return consumMoney;
	}

	public void setConsumMoney(double consumMoney) {
		this.consumMoney = consumMoney;
	}

	public User(String userName, String phoneNum, String password,
			int realTalkTime, int realFlow, int realSendMsg,
			ServicePackage servicePackage, double money, double consumMoney) {
		super();
		this.userName = userName;
		this.phoneNum = phoneNum;
		this.password = password;
		this.realTalkTime = realTalkTime;
		this.realFlow = realFlow;
		this.realSendMsg = realSendMsg;
		this.servicePackage = servicePackage;
		this.money = money;
		this.consumMoney = consumMoney;
	}

	public User() {
		super();
	}

}
