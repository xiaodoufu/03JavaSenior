package cn.bdqn.third.impl;

/**
 *  无论是加减乘除 还是平方，开根等
 *  都是运算
 *  接口就是规定一种行为！ 不关注实现！
 *  就写一个运算的方法!
 *  
 */
public interface Operation {

	double getResult(double num1, double num2);

}
