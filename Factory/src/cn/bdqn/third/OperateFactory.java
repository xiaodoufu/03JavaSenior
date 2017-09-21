package cn.bdqn.third;

import cn.bdqn.third.impl.Addtion;
import cn.bdqn.third.impl.Division;
import cn.bdqn.third.impl.Minus;
import cn.bdqn.third.impl.Multiplication;
import cn.bdqn.third.impl.Operation;

/**
 * 运算类
 * 
 * 
 * 
 *  真正运算的是 我们的接口还是  实现类！！！！   
 *  肯定是实现类！
 *  言外之意，我们需要实例化 实现类 才能实现运算的功能！
 *  这么多实现类 都需要 实例化！
 *  
 *  01.我们有继承关系！
 *  02.有多个实现类需要实例化
 *  03.首选我们的工厂设计模式
 *  
 *  虽然代码量增加！ 但是我们程序的扩展性和复用性强了！耦合度降低！
 *  
 */
public class OperateFactory {

	/**
	 * 
	 * @param operate  用户传递过来的运算符号
	 * @return  根据用户的运算符号  返回不同的算法
	 */
	public static Operation getOperate(String operate) {
		// 父类引用指向子类的对象
		Operation operation = null;
		switch (operate) {
		case "+":
			operation = new Addtion();
			break;
		case "-":
			operation = new Minus();
			break;
		case "*":
			operation = new Multiplication();
			break;
		case "/":
			operation = new Division();
			break;
		}
		return operation;
	}

}
