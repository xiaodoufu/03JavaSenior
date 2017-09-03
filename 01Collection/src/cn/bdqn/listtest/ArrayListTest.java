package cn.bdqn.listtest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/**
		 * 在程序运行过程中,不确定有多少个对象  加入到 集合中!
		 * 使用集合框架!
		 * 现在 我们想 新增   LinkedList
		 * 现在 我们想 查询   ArrayList
		 * 上述的两个类  都是  List接口的 实现类！
		 * 
		 * 01. ArrayList 底层是实现了一个可变长度（自动扩容）的数组！
		 *     在内存中也是分配连续的空间！
		 *     遍历元素和随机访问元素的时候 性能高！  因为有下标！
		 *     
		 *    谁能告诉我？？？
		 *    为什么不使用 !!!!
		 *   ArrayList list=  new ArrayList();
		 *   
		 *    List  和 ArrayList 什么关系？
		 *      001.ArrayList继承了List！
		 *    List接口中有的方法ArrayList有吗？  
		 *      002. 有
		 *    ArrayList中有特有的方法，  List接口中有吗？
		 *      003. 没有！
		 *      
		 *     List list = new ArrayList();   父类的引用指向了子类的对象！
		 *     
		 * 
		 */

		// 01创建一个ArrayList集合
		ArrayList list = new ArrayList();
		/**
		 *  02. 向集合中增加元素
		 *    为什么可以存放这么多数据类型
		 *    因为底层就是一个Object[]数组   默认的初始长度=10
		 *    Object 所有类的父类，所以可以存放任何类型！
		 *  
		 */
		list.add(1);
		list.add("2");
		list.add(12.5);
		list.add('1');
		list.add('1');
		list.add(null);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		// 03.输出集合的长度 实际使用的位置个数
		System.out.println(list.size());

	}
}
