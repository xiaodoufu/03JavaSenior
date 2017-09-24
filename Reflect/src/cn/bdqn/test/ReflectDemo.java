package cn.bdqn.test;

import org.junit.Test;

import cn.bdqn.bean.Student;

public class ReflectDemo {

	/**
	 * 全类名（完整限定名）cn.bdqn.test.ReflectDemo
	 *  包名+类名
	 *  
	 * 完整路径  /Reflect/src/cn/bdqn/test/ReflectDemo.java
	 * 
	 * 
	 * 完整限定名 是我们反射的基础！
	 * 问题：
	 *     01.一个包中可能出现两个相同的类吗？？  不能
	 *     02.完整限定名就是来确保我们类的唯一性
	 *     03.程序怎么获取完整限定名呢？
	 */
	@Test
	public void test01() {
		// 三种方式获取我们的完整限定名
		try {
			System.out.println("第一种方式 ：Class.forName()===>"
					+ Class.forName("cn.bdqn.bean.Student").getName());

			System.out.println("第二种方式 ：类名.Class===>" + Student.class.getName());
			System.out.println("第三种方式 ：对象名.getClass()===>"
					+ new Student().getClass().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	class A {
	}

	class B {
	}
}
