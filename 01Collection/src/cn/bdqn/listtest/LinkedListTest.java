package cn.bdqn.listtest;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		/**
		 * 02.LinkedList ：采用的是链表式存储结构！  插入和删除的效率高！
		 *    
		 *    谁能告诉我？？？
		 *    为什么不使用 
		 *   List list = new LinkedList();   父类的引用指向了子类的对象！
		 *    
		 *   LinkedList list=  new LinkedList();  使用这种方式！
		 *   
		 *    List  和 LinkedList 什么关系？
		 *      001.LinkedList继承了List！
		 *    List接口中有的方法LinkedList有吗？  
		 *      002. 有
		 *    LinkedList中有特有的方法，  List接口中有吗？  !!!!
		 *      003. 没有！
		 *     
		 */
		// 创建集合
		LinkedList list = new LinkedList();
		// 创建新闻对象
		News news1 = new News(1, "新闻1");
		News news2 = new News(2, "新闻2");
		News news3 = new News(3, "新闻3");
		News news4 = new News(4, "新闻4");

		// 集合中保存新闻信息
		list.add(news1);
		list.addFirst(news2);
		list.add(news3);
		list.addFirst(news4);

		for (Object object : list) {
			News news = (News) object;
			System.out.println(news);
		}

		// 删除最后一个对象
		list.removeLast();
		System.out.println("*********************");
		for (Object object : list) {
			News news = (News) object;
			System.out.println(news);
		}
		// 查询某个元素在集合中的位置
		System.out.println("news4在集合中的位置：" + list.indexOf(news4));

	}
}
