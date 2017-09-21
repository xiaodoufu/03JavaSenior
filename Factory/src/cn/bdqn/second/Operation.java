package cn.bdqn.second;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		double num1 = input.nextDouble();
		System.out.println("请输入运算符号：");
		String operate = input.next();
		System.out.println("请输入第二个数字：");
		double num2 = input.nextDouble();
		// 获取结果
		double sum = Operate.getOperate(num1, operate, num2);
		System.out.println("结果是：" + sum);

	}
}
