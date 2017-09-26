package com.xdf.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.xdf.bean.User;
import com.xdf.dao.impl.NetPackage;
import com.xdf.dao.impl.SuperPackage;
import com.xdf.dao.impl.TalkPackage;

/**
 * 解析xml文件的工具类
 */
public class ParseUserXml {

	// 创建我们需要的dom树
	static Document dom;

	/**
	 * 获取dom树
	 * @throws DocumentException 
	 */
	public static void getDocument() throws DocumentException {
		SAXReader reader = new SAXReader();
		dom = reader.read("user.xml");
	}

	/**
	 * @param phoneNum  随机生成的手机号
	 * @return   是否存在
	 * @throws DocumentException 
	 */
	public static boolean findPhoneNum(String phoneNum)
			throws DocumentException {
		// 获取dom
		getDocument();
		// 获取根节点
		Element users = dom.getRootElement();
		Iterator<Element> it = users.elementIterator();
		while (it.hasNext()) {
			Element user = it.next();
			if (user.attributeValue("phoneNum").equals(phoneNum)) {
				return false; // 证明 手机号存在
			}
		}
		return true;
	}

	/**
	 * @param user  需要保存的用户
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	public static void saveUser(User u) throws DocumentException, IOException {
		// 获取dom
		getDocument();
		// 获取根节点
		Element users = dom.getRootElement();
		// 新增节点
		Element user = users.addElement("user");
		// 给节点新增属性
		user.addAttribute("userName", u.getUserName());
		user.addAttribute("password", u.getPassword());
		user.addAttribute("phoneNum", u.getPhoneNum());
		user.addAttribute("realTalkTime", u.getRealTalkTime() + "");
		user.addAttribute("realFlow", u.getRealFlow() + "");
		user.addAttribute("realSendMsg", u.getRealSendMsg() + "");
		user.addAttribute("money", u.getMoney() + "");
		user.addAttribute("consumMoney", u.getConsumMoney() + "");

		Element servicePackage = user.addElement("servicePackage");
		// 套餐进xml 具体是什么套餐 我们不知道
		if (u.getServicePackage() instanceof SuperPackage) {
			servicePackage.addAttribute("name", "超人套餐");
			servicePackage
					.addAttribute(
							"sendMsg",
							((SuperPackage) u.getServicePackage())
									.getSendCounts() + "");
			servicePackage.addAttribute("talkTime",
					((SuperPackage) u.getServicePackage()).getTalkTime() + "");
			servicePackage.addAttribute("flow",
					((SuperPackage) u.getServicePackage()).getFlow() + "");
		} else if (u.getServicePackage() instanceof NetPackage) {
			servicePackage.addAttribute("name", "网虫套餐");
			servicePackage.addAttribute("flow",
					((NetPackage) u.getServicePackage()).getFlow() + "");
		} else if (u.getServicePackage() instanceof TalkPackage) {
			servicePackage.addAttribute("name", "话唠套餐");
			servicePackage.addAttribute("sendMsg",
					((TalkPackage) u.getServicePackage()).getSendCounts() + "");
			servicePackage.addAttribute("talkTime",
					((TalkPackage) u.getServicePackage()).getTalkTime() + "");
		}

		// 真正保存xml
		saveXML("user.xml");
	}

	/**
	 * 把数据保存xml
	 * @throws IOException 
	 */
	private static void saveXML(String path) throws IOException {
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(new FileWriter(path), format);
		writer.write(dom);
		writer.close();
	}
}
