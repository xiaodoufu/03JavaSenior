package cn.bdqn.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void test01() {
		Date date = new Date();
		// date.getYear()获取的是1900年开始的时间
		System.out.println(date.getYear() + 1900);
		// getMonth() 0-11
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate()); // 一个月当中的第几天
		System.out.println(date.getDay()); // 周几
		System.out.println(date);// Mon Sep 11 14:43:19 CST 2017
		// 转换成字符串
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日 hh:mm:ss");
		// format 把日期格式转换成字符串
		System.out.println(sdf.format(date));
		try {
			date = sdf.parse("2017年-11月-09日 20:02:20");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test02() {
		// 创建日历类对象
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK) - 1);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
	}

}
