package cn.bdqn.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

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

	/**
	 * 获取类的包名  类名 访问修饰符
	 */
	@Test
	public void test02() {
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			System.out.println("所在的包：" + c.getPackage().getName());
			System.out.println("全类名：" + c.getName());
			System.out.println("简写的类名：" + c.getSimpleName());

			// 获取类的修饰符
			int num = c.getModifiers();
			System.out.println(num);
			// 通过Modifier的toString()就可以把int类型转换成对应的修饰符
			System.out.println(Modifier.toString(num));

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取类中所有的属性相关内容
	 * 
	 * 所有的属性，方法，构造方法 都有修饰符！
	 * 不同的访问修饰符 访问权限不一样！
	 * Class类中给我们提供了两个方案来获取属性，方法，构造方法！
		  01.获取所有的
		           getDeclared系列
		  02.获取public修饰的 
		           get系列
	 */
	@Test
	public void test03() {
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			// Field[] fields = c.getFields(); 只是获取public
			Field[] fields = c.getDeclaredFields(); // 获取所有
			for (int i = 0; i < fields.length; i++) {
				System.out.println(fields[i]);
			}

			// 获取所有属性的访问修饰符 default的int值是0 没有对应的字符串类型
			for (int i = 0; i < fields.length; i++) {
				System.out.println(Modifier.toString(fields[i].getModifiers()));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建对象
	 */
	@Test
	public void test04() {
		// Student stu = new Student(); 耦合
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			Student stu = (Student) c.newInstance(); // 相对耦合
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 访问对象的私有属性
	 */

	@Test
	public void test05() {
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			Student stu = (Student) c.newInstance();

			Field field = c.getDeclaredField("birthday");
			// 打开访问私有属性的开关
			field.setAccessible(true);
			System.out.println(field.get(stu));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 访问对象的私有方法
	 */

	@Test
	public void test06() {
		try {
			Class c = Class.forName("cn.bdqn.bean.Student");
			Student stu = (Student) c.newInstance();

			Method method = c.getDeclaredMethod("getSum", double.class);
			method.setAccessible(true);
			// 执行方法
			double sum = (Double) method.invoke(stu, 50.0);
			System.out.println(sum);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
