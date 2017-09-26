package com.xdf.util;

import java.util.Random;

import org.dom4j.DocumentException;

import com.xdf.dao.ServicePackage;
import com.xdf.dao.impl.NetPackage;
import com.xdf.dao.impl.SuperPackage;
import com.xdf.dao.impl.TalkPackage;

/**
 * 手机操作的工具类
 */
public class CardUtil {

	/**
	 * @param count  生成几个手机号
	 * @return  返回生成手机号的集合
	 * @throws DocumentException 
	 */
	public static String[] getNewPhoneNums(int count) throws DocumentException {
		String[] phoneNums = new String[count];
		for (int i = 0; i < phoneNums.length; i++) {
			phoneNums[i] = createNewPhoneNum(); // 一次生成一个
		}
		return phoneNums;
	}

	/**
	 * 创建卡号 的开头  +（随机八位数字）
	 * int [] begin={157,136,137,177,159,158,130};
	 * @return  生成的随机手机号
	 * 
	 * 
	 *注意点：
	 *  01.和xml文件中的手机号不能重复
	 *  02.生成必须是8位
	 * @throws DocumentException 
	 */
	private static String createNewPhoneNum() throws DocumentException {
		int[] begin = { 157, 136, 137, 177, 159, 158, 130 }; // 定义手机号的开始
		Random random = new Random();
		int randomBegin = random.nextInt(begin.length);
		// 创建一个准备返回的手机号
		String phoneNum = "";
		// 定义标记 方便跳出循环
		boolean flag = false;
		// 定义一个变量 保存8位数字
		int temp = 0;
		do {
			do { // 只要不是8位的数字 就一直循环 直到找到为止
				temp = random.nextInt(100000000);
			} while (temp < 10000000); // 小于1000w就不是8位
			phoneNum = begin[randomBegin] + "" + temp;
			// 和xml文件中的手机号不能重复
			flag = ParseUserXml.findPhoneNum(phoneNum);
		} while (!flag);
		return phoneNum;
	}

	/**
	 * @param packageNum   用户选择的套餐编号
	 * @return   返回的套餐的类型
	 */
	public static ServicePackage createPackage(int packageNum) {
		ServicePackage pack = null;
		switch (packageNum) {
		case 1:
			pack = new TalkPackage();
			break;
		case 2:
			pack = new NetPackage();
			break;
		case 3:
			pack = new SuperPackage();
			break;
		}
		return pack;
	}

}
