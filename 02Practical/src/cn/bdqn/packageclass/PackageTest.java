package cn.bdqn.packageclass;

import org.junit.Test;

public class PackageTest {

	// 所有的封装类 都有将对应的基本数据类型作为参数的方法 来构造实例
	@Test
	public void test01() {
		/**
		 * Float有三个实例化构造方法  分别是  传递 double  float  String
		 * 其他的数值类型都是两种构造！
		 * Character只有一个构造！
		 */
		Byte a = new Byte((byte) 1);
		Short s = new Short((short) 1);
		Integer b = new Integer(5);
		Long l = new Long(1);
		Float f = new Float(2);
		Double c = new Double(5);
		// 上面的六个封装类都继承了Number
		Boolean boolean1 = new Boolean(true);
		Character character1 = new Character((char) 1);
		Character character2 = new Character('1');

	}

	/**
	 * 六个封装类继承了Number
	 * 用String来构造实例的时候，String中存放的必须是数值类型的字符串
	 * 除了Character来构造实例的时候，没有String类型的参数！
	 * 其它7种封装类 都可以传递一个Stirng类型的变量，来构造实例！
	 * 注意点：
	 *    Stirng类型的变量必须能转换成数值类型，否则会抛出异常(NumberFormatException)！
	 */
	@Test
	public void test02() {
		Byte a = new Byte("1");
		Short s = new Short("1");
		Integer b = new Integer("1");
		Long l = new Long("1");
		Float f = new Float("1");
		Double c = new Double("1");
		// 除了大小写的true 其它都返回false
		Boolean boolean1 = new Boolean("");
		System.out.println(boolean1);
		// 编译报错 Character character1 = new Character("1");
	}

}
