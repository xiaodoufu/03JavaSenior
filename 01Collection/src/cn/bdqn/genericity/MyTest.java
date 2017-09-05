package cn.bdqn.genericity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

import cn.bdqn.listtest.News;

public class MyTest {

	@Test
	public void test01() {
		ArrayList list = new ArrayList();
		// list中可以存放什么类型！ Object 所有类型
		list.add(1);
		list.add("1");
		list.add(new Date());
		/**
		 *  我们怎么去遍历这些类型的数据
		 *  01.集合中的数据不是相同类型
		 *  02.不能按照一种方式去遍历
		 */

		Set set = new HashSet();
		set.add(1);
		set.add("1");
		set.add(new Date());

		Map map = new HashMap();
		map.put(1, "1");
		map.put("1", "haha");
		map.put("2", new Date());

		/**
		 * 上面三个 集合 
		 * 01.因为我们没有在创建集合的同时 规定集合中可以存放什么类型的数据
		 * 02.所以集合中可以存放Object类型的数据
		 * 03.导致后续操作很麻烦
		 * 04.如果我们想获取集合中的某个元素，需要使用get（）
		 * 05.但是get()返回值是 object类型
		 * 06.需要向下转型，转换成指定的类型，之后才能操作！
		 * 
		 * 
		 * 有没有一种方式，
		 * 01.可以在创建集合的时候，规定集合中只能存放什么类型
		 * 02.能不能在get()不进行向下转型！！！
		 * 
		 * 能！
		 * 使用泛型！
		 * 泛型集合：  创建集合的时候，规定集合中存放数据的类型！
		 * 
		 */

	}

	/**
	 *  使用泛型集合   方便+安全
	 *  <> 就是集合中指定的元素类型！
	 *  
	 *  泛型集合中 不允许 存放基本数据类型的元素！
	 *  如果想存放基本数据类型！
	 *  必须使用基本数据类型对应的 包装类
	 *  
	 *  java中有8种基本数据类型,使用ctrl+鼠标左键   点不进去！ 说明不是类
	 *   
	 *  那就有8个对应的包装类！
	 *  byte    Byte
	 *  short   Short
	 *  int     Integer        
	 *  long    Long
	 *  float   Float
	 *  double  Double
	 *  
	 *  boolean  Boolean
	 *  char     Character
	 *  
	 */
	@Test
	public void test02() {
		ArrayList<String> list = new ArrayList<String>();
		// 说明list集合中只能存放String类型的数据
		// list.add(new Date()); 编译报错
		ArrayList<News> list2 = new ArrayList<News>();
		// list2集合中 只能存放 News 对象！
		ArrayList<Double> list3 = new ArrayList<Double>();
		list3.add(2.0);

		double a = 2;
		// Double b = 2; 编译报错
	}

	@Test
	public void test03() {
		/**
		 * 创建了一个map泛型集合！
		 * 集合的key只能是String类型
		 * value只能是News类型！
		 * 
		 * map.put(1,"1"); 错误
		 * map.put("1","1"); 错误
		 * map.put("1",new News());
		 */
		Map<String, News> map = new HashMap<>();
		News news1 = new News(1, "新闻1");
		News news2 = new News(2, "新闻2");
		News news3 = new News(3, "新闻3");
		map.put("a", news1);
		map.put("b", news2);
		map.put("c", news3);

		// 遍历出来所有的新闻信息
		Iterator<Entry<String, News>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, News> entry = iterator.next();
			// System.out.println(entry.getKey()); 获取所有的key
			News news = entry.getValue(); // 获取所有的value
			System.out.println(news);
		}

	}
}
