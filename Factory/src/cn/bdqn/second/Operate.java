package cn.bdqn.second;


/**
 * 运算类
 */
public class Operate {

	public static double getOperate(double num1, String operate, double num2) {
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
		return sum;
	}

}
