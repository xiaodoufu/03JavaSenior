package cn.bdqn.maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;

import cn.bdqn.listtest.News;

public class MapTest {

	public static void main(String[] args) {

		/**
		 * Map： 是一个key  value 键值对的集合！
		 *       key是唯一的！
		 * 
		 * 存放值：
		 *  put(key,value)
		 *  
		 * 取值
		 *   get(key)    根据key获取value
		 */

		Map map = new HashMap();
		map.put(1, "haha1");
		map.put("1", "haha2");
		map.put(new String("1"), "haha3");
		System.out.println(map.size());
	}

	@Test
	public void test1() {
		Map map = new HashMap();
		map.put("news1", new News(1, "新闻标题1"));
		map.put("news2", new News(2, "新闻标题2"));
		map.put("news3", new News(3, "新闻标题3"));
		/**
		 * 我们想获取value的值   只能通过key
		 * key是一个集合 就是set
		 */
		Set keySet = map.keySet();
		for (Object o : keySet) {
			System.out.println(o); // key
		}
		/**
		 * 获取所有value的集合
		 */
		Collection values = map.values();
		for (Object o : values) {
			System.out.println(o); // value
		}

		System.out.println("****************************");

		// 直接使用一个循环 获取value
		for (Object key : keySet) {
			News news = (News) map.get(key); // 根据key获取value
			System.out.println(news);
		}
		System.out.println("****************************");
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			News news = (News) map.get(it.next());
			System.out.println(news);
		}

		System.out.println("************ EntrySet（）****************");

		/**
		 * 强烈推荐使用 EntrySet（）
		 * 可以在获取key的同时获取value！不需要两次查询
		 */
		Iterator it1 = map.entrySet().iterator();
		while (it1.hasNext()) {
			Entry entry = (Entry) it1.next();
			System.out.println("map中的key：" + entry.getKey());
			System.out.println("map中的value：" + entry.getValue());
		}
	}

	Logger log = Logger.getLogger(MapTest.class);

	@Test
	public void test2() {
		Map map = new HashMap();
		for (int i = 1; i <= 200000; i++) {
			map.put(i, "" + i);
		}
		System.out.println("map的大小：" + map.size());

		// 获取当前的毫秒数 从1970年1月1日到现在的毫秒
		long start = System.currentTimeMillis();
		Set keySet = map.keySet();
		for (Object key : keySet) {
			System.out.println(map.get(key));
		}
		long end = System.currentTimeMillis();
		log.debug("使用for循环的用时：" + (end - start));

		start = System.currentTimeMillis();
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			System.out.println(entry.getValue());
		}
		end = System.currentTimeMillis();
		log.debug("使用Iterator循环的用时：" + (end - start));
	}

	/***
	 * 
	 *  HashMap 和  HashTable 的区别
	 *   01.HashMap    线程不安全 但是性能高
	 *      HashTable  线程   安全 但是性能低
	 *   02.HashMap 底层是哈希表实现的，每一个元素一个key -value键值对！
	 *        key和value都可以为null！
	 *      HashTable的key和value都不可以为null！
	 *   03.历史版本不同
	 *      HashMap    1.2
	 *      HashTable  1.0
	 */
}
