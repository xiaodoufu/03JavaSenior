package cn.bdqn.settest;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class StringTest {

	public static void main(String[] args) {

		Set set = new HashSet();
		set.add("1");
		set.add(new String("1"));
		set.add(new String("1"));
		System.out.println(set.size());

		// 疑问？ 为什么 两次new 确是一样的
		String a = new String("1");
		String b = new String("1");
		String c = "1";
		System.out.println(a == b);
		System.out.println(a == c);
		// 内容相同的String对象 hashCode是一致的！
		System.out.println(a.hashCode() == b.hashCode());
		System.out.println(a.hashCode() == c.hashCode());
	}

	@Test
	public void test1() {
		String a = new String("1");
		/**
		 * 01.首先在栈中开辟空间存储a
		 * 02.去常量池中查询有没有 字符串1 没有就在常量池中创建字符串1
		 * 03.再去堆中创建一个字符串1
		 * 04.a指向堆中的字符串1
		 */
		String b = "1";
		/**
		 * 01.首先在栈中开辟空间存储b
		 * 02.去常量池中查询有没有 字符串1   有
		 * 03.b指向常量池中的字符串1
		 */
		System.out.println(a == b); // false
	}

	@Test
	public void test2() {
		String a = "abc";
		String b = "abc";
		System.out.println(a == b); // true
		System.out.println(a == "abc"); // true
	}

	@Test
	public void test3() {
		String a = "abc";
		String b = "a";
		String c = "bc";
		System.out.println(a == ("a" + "bc")); // true
		/**
		 * b  和  c  都是变量！！！！！！
		 * 在运行期间可以改变的量！
		 */
		System.out.println(a == (b + c)); // false
	}

	@Test
	public void test4() {
		String a = "abc";
		final String b = "a";
		final String c = "bc";
		System.out.println(a == ("a" + "bc")); // true
		/**
		 * 在编译期间因为b  和  c  都是常量
		 * 所以就把b+c="abc"
		 */
		System.out.println(a == (b + c)); // true
	}
}
