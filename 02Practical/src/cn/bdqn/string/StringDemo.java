package cn.bdqn.string;

import org.junit.Test;

public class StringDemo {

	@Test
	public void test01() {
		String a = "abc";
		String b = "ABC";
		System.out.println("字符串的长度：" + a.length());
		System.out.println("字符串是否相等：" + (a == b));
		System.out.println("字符串内容是否一致(区分大小写)：" + (a.equals(b)));
		System.out.println("字符串内容是否一致(不区分大小写)：" + (a.equalsIgnoreCase(b)));
		System.out.println("把abc变成大写：" + a.toUpperCase());
		System.out.println("把ABC变成大写：" + b.toLowerCase());
	}

	@Test
	public void test02() {
		String a = "abcdefg";
		// 把字符串转换成char类型的数组
		char[] newArray = a.toCharArray();
		for (char c : newArray) {
			System.out.println(c);
		}
	}

	@Test
	public void test03() {
		String a = "a+b?c?d-e?f?g";
		/**
		 *  把一个有特点的字符串拆分成一个Stirng类型的数组
		 *  了解 正则表达式  后续会有讲解
		 */
		String[] newStringArr = a.split("-");
		for (String s : newStringArr) {
			System.out.println(s);
		}
	}

	@Test
	public void test04() {
		String a = "501804392@qq.com.cn";
		// indexOf("@") 返回@在字符串中的下标 如果没有 返回-1
		int index = a.indexOf("@");
		System.out.println("@在字符串中出现的位置是：" + index);
		// 邮箱最多有两个. 找到最后一个点的位子
		index = a.lastIndexOf(".");
		System.out.println(".在字符串中最后出现的位置是：" + index);
	}

	@Test
	public void test05() {
		String a = "0123456789";
		// 只想获取6789 substring(6) 从下标为6的开始截取包含本身
		a = a.substring(6);
		System.out.println(a);
		/**
		 *  只想获取456 
		 *  substring(4, 7)  
		 *  4:我们开始截取的位置  包含本身
		 *  7：我们截取结束的位置 不包含本身
		 */
		a = "0123456789";
		a = a.substring(4, 7);
		System.out.println(a);
	}

	@Test
	public void test06() {
		String a = "0123456789";
		// 把5换成+
		a = a.replace("5", "+");
		System.out.println(a);
	}

	@Test
	public void test07() {
		String a = "01234a6789";
		// 返回下标位置的 元素
		char b = a.charAt(5);
		System.out.println(b);
	}

	@Test
	public void test08() {
		String a = "01234";
		String b = "56789";
		System.out.println(a + b);
		System.out.println(a.concat(b));
	}

	@Test
	public void test09() {
		String a = "01234";
		// 是否包含某个字符 如果不存在返回false
		System.out.println(a.contains("0"));
	}

	@Test
	public void test10() {
		String a = "abcde";
		byte[] bytes = a.getBytes();
		for (byte b : bytes) {
			System.out.println((char) b);
		}
	}

	@Test
	public void test11() {
		String a = new String("abc").intern();
		/**
		 * intern() :  说  把a指向了 常量池中的“abc”
		 */
		String b = new String("abc");
		String c = "abc";
		System.out.println(a == c);
	}

	@Test
	public void test12() {
		// 01.定义变量
		String name = "xiaohei";
		// 02.定义操作字符串的次数
		int count = 2000000;
		// 03.设置开始时间
		long beginTime = System.currentTimeMillis();
		for (int i = 0; i < count / 100; i++) { // 20000次
			name += "haha";
		}
		// 03.设置结束时间
		long endTime = System.currentTimeMillis();
		System.out.println("String的执行时间：" + (endTime - beginTime));
		System.out.println("****************************");
		name = "xiaohei";
		// 04.使用StringBuffer
		StringBuffer buffer = new StringBuffer(name);
		beginTime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			buffer = buffer.append("haha");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer的执行时间：" + (endTime - beginTime));
		System.out.println("****************************");
		name = "xiaohei";
		// 05.使用StringBuilder
		StringBuilder builder = new StringBuilder(name);
		beginTime = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			builder = builder.append("haha");
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder的执行时间：" + (endTime - beginTime));

	}
}
