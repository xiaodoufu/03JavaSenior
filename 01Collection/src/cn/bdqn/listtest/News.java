package cn.bdqn.listtest;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 新闻实体类
 */
public class News {

	private int id; // 新闻编号
	private String title; // 新闻标题

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public News(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public News() {
		super();
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + "]";
	}

	public static void main(String[] args) {
		// 创建一个集合
		ArrayList list = new ArrayList();
		// 创建新闻对象
		News news1 = new News(1, "新闻1");
		News news2 = new News(2, "新闻2");
		News news3 = new News(3, "新闻3");
		News news4 = new News(4, "新闻4");

		// 集合中保存新闻信息
		list.add(news1);
		list.add(news2);
		list.add(news3);
		list.add(news4);
		// list.add("aaaaaa");ClassCastException 类型转换

		// 01.第1种方式 遍历 for循环
		for (int i = 0; i < list.size(); i++) {
			News news = (News) list.get(i); // 必须向下转型
			System.out.println(news);
		}
		System.out.println("*****************************");
		// 02.第2种方式 遍历 for增强循环
		for (Object n : list) {
			News news = (News) n; // 必须向下转型
			System.out.println(news);
		}
		System.out.println("*****************************");
		/**
		 *  03.第3种方式 遍历 iterator 迭代器循环
		 *  
		 *  001.hasNext() :判断我们的集合中是否还有元素
		 *  002.next（）：获取集合中的下一个元素
		 *  003.remove()：删除元素
		 */
		// 清空整个集合
		list.clear();
		// 判断集合是否为空
		System.out.println("集合是否为空:" + list.isEmpty());
		Iterator it = list.iterator();
		while (it.hasNext()) {
			News news = (News) it.next();// 获取元素
			System.out.println(news);
		}

	}

}
