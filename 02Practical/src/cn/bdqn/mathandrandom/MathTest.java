package cn.bdqn.mathandrandom;

public class MathTest {

	public static void main(String[] args) {

		System.out.println("向上取整：" + Math.ceil(20.001));
		System.out.println("向下取整：" + Math.floor(20.999));
		System.out.println("四舍五入：" + Math.round(20.5));
		System.out.println("四舍五入：" + Math.round(20.4));
		System.out.println("最大值：" + Math.max(5, 20));
		System.out.println("最小值：" + Math.min(20.4, 0.1));
		System.out.println("绝对值：" + Math.abs(-52));
		System.out.println("绝对值：" + Math.random());
		/**
		 * Math.random() 底层是执行了Random类中的nextDouble()
		 * 
		public static double random() {
		Random rnd = randomNumberGenerator;
		if (rnd == null) rnd = initRNG();
		return rnd.nextDouble();
		}
		 */

	}

}
