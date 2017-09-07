package cn.bdqn.mathandrandom;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 创建随机数对象
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			// System.out.println(random.nextBoolean());随机输入boolean值
			// System.out.println(random.nextDouble()); 返回0-1但不包含1的随机小数
			// System.out.println(random.nextInt()); 返回int类型最小值到最大值之间的随机整数
			// System.out.println(random.nextInt(10));返回0-10之间的整数 不包含10
		}

	}

}
