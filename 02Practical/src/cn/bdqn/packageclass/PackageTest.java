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

	/**
	*除了Character，都有对应的parse的方法
	*/
	@Test
	public void test03() {
		Integer i = new Integer("5");
		System.out.println(i + 1);
		System.out.println(Integer.parseInt("54321") + 1);
		// 转换进制 把2进制的1011转换成10进制的数字
		System.out.println("10对应的2进制：" + Integer.parseInt("1011", 2));

		/**    String num = "27";
		    System.out.println(Integer.parseInt(num) + 1);

		    Double.parseDouble("20");
		    Byte.parseByte("1");
		    Short.parseShort("1");
		    System.out.println(1 + 1 + "2"+1); // 221
		    System.out.println("1" + (1 + 2)); // 13
		*/
	}

	@Test
	public void test04() {
		System.out.println(Integer.toBinaryString(28)); // 转换成2进制
		System.out.println(Integer.toHexString(28)); // 转换成16进制
		System.out.println(Integer.toOctalString(28)); // 转换成8进制
	}

	/**
	* valueOf 
	* 把基本数据类型转换成对应的封装类
	* 除了Character没有传递String类型的参数
	* 
	* xxxValue
	* 把xxx类型转换成xxx对应的基本数据类型
	*/
	@Test
	public void test05() {
		// 基本数据类型和对应封装类之间的转换 我们称之为 装箱和拆箱操作
		int a = 5;
		Integer integer = Integer.valueOf(a); // 装箱 把基本数据类型a转换成了包装类integer
		integer.intValue(); // 拆箱 把包装类integer转换成基本数据类型

		Double d = Double.valueOf(20.0);
		double h = d.doubleValue();

		Character character = Character.valueOf('a');
		character.charValue();
	}

}
