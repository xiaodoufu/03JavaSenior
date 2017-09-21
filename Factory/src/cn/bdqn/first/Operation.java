package cn.bdqn.first;

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
		double sum = 0; // 保存结果
		switch (operate) {
		case "+":
			sum = num1 + num2;
			break;
		case "-":
			sum = num1 - num2;
			break;
		case "*":
			sum = num1 * num2;
			break;
		case "/":
			sum = num1 / num2;
			break;
		}
		System.out.println("结果是：" + sum);
	}
}
