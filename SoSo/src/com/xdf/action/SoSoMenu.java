package com.xdf.action;

import java.io.IOException;
import java.util.Scanner;

import org.dom4j.DocumentException;

import com.xdf.bean.User;
import com.xdf.dao.ServicePackage;
import com.xdf.util.CardUtil;
import com.xdf.util.ParseUserXml;

/**
 * SoSo移动项目的主业务类
 */
public class SoSoMenu {

	// 把输入流提出来
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws DocumentException,
			IOException {
		firstMenu();
	}

	/**
	 * 一级菜单的显示
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	public static void firstMenu() throws DocumentException, IOException {
		do {
			System.out.println("***************欢迎进入*小豆腐*移动大厅***************");
			System.out
					.println("1:用户登录  2.用户注册   3.使用搜搜  4.话费充值   5.资费说明    6.退出系统");
			System.out.println("请输入您的选择：");
			int choose = input.nextInt();
			switch (choose) {
			case 1: // 用户登录

				break;
			case 2: // 用户注册
				resgistCard();
				break;
			case 3: // 使用搜搜

				break;
			case 4: // 话费充值

				break;
			case 5: // 资费说明

				break;
			case 6: // 退出系统

				break;

			default:
				break;
			}

		} while (true);
	}

	/**
	 * 注册新用户
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	private static void resgistCard() throws DocumentException, IOException {
		System.out.println("请输入用户名：");
		String userName = input.next();
		System.out.println("请输入密码：");
		String password = input.next();
		System.out.println("请输入您想显示多少个手机号？");
		int count = input.nextInt();
		String[] newPhoneNums = CardUtil.getNewPhoneNums(count);
		System.out
				.println("*****************************您可以选择的手机号如下*****************************");
		for (int i = 0; i < newPhoneNums.length; i++) {
			System.out.println((i + 1) + ":***" + newPhoneNums[i] + "\t\t");
			if ((i + 1) % 3 == 0) {
				System.out.println(); // 换行操作
			}
		}
		System.out.println("请输入您想使用的手机号码编号：");
		int choose = input.nextInt();
		// 根据用户的选择 获取手机号码
		String phoneNum = newPhoneNums[choose - 1];

		// 选择套餐类型
		System.out.println("1:话唠套餐   2.网虫套餐   3.超人套餐");
		System.out.println("请您输入套餐编号：");
		int packageNum = input.nextInt();
		ServicePackage servicePackage = CardUtil.createPackage(packageNum);
		System.out.println("请您输入充值金额：");
		double money = 0.0;
		money = input.nextDouble();
		while (money < servicePackage.getPrice()) { // 用户的充值金额不足
			if (money < servicePackage.getPrice()) {
				System.out.println("充值金额不足，请重新输入");
				money = input.nextDouble();
			}
		}
		// 把刚才输入的辣么多 信息 都放进xml
		User user = new User(userName, phoneNum, password, 0, 0, 0,
				servicePackage, money - servicePackage.getPrice(),
				servicePackage.getPrice());
		// 保存用户
		ParseUserXml.saveUser(user);

	}

}
