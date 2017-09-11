package cn.bdqn.collections;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class CollectionsTest {

	/**
	 *Collections 操作所有集合的工具类
	 *
	 *对字母和数字进行排序
	 */
	@Test
	public void test01() {
		List<String> list = new ArrayList<>();
		list.add("z");
		list.add("g");
		list.add("a");
		list.add("c");
		System.out.println(list);
		// 01.升序
		Collections.sort(list);
		System.out.println("升序=====》" + list);
		// 02.降序
		Collections.reverse(list);
		System.out.println("降序=====》" + list);
		// 03.查询元素在集合中的一个位置 必须升序排列
		Collections.sort(list);
		int index = Collections.binarySearch(list, "z");
		System.out.println("z出现的位置：" + index);
		// 04.随机排序
		Collections.shuffle(list);
		System.out.println("随机排序之后的集合：" + list);
	}

	// 对象进行排序
	@Test
	public void test02() {
		List<News> list = new ArrayList<>();
		list.add(new News(3, "新闻3"));
		list.add(new News(4, "新闻4"));
		list.add(new News(1, "新闻1"));
		list.add(new News(2, "新闻2"));
		/**
		 * 根据对象的id属性  来进行排序
		 * 01.对象所在类 需要实现  Comparable
		 */
		for (News news : list) {
			System.out.println(news);
		}
		System.out.println("================排序之后===============");
		Collections.sort(list);
		for (News news : list) {
			System.out.println(news);
		}
	}

	@Test
	public void test03() {
		String[] a = { "a", "b", "c", "d", "e", "c", "d" };
		// 把数组转换成集合
		List<String> list = Arrays.asList(a);
		String[] b = { "c", "d" };
		List<String> list2 = Arrays.asList(b);
		// 查询list2在list中 首次出现的位置
		System.out.println(Collections.indexOfSubList(list, list2));
		System.out.println(Collections.lastIndexOfSubList(list, list2));
	}

	@Test
	public void test04() {
		String[] a = { "a", "b", "c", "d", "e" };
		// 把数组转换成集合
		List<String> list = Arrays.asList(a);
		// list集合中所有元素后移2位 溢出的部分补到前面
		Collections.rotate(list, 2);
		System.out.println(list);
	}

	// 对中文进行排序
	@Test
	public void test05() {
		List<String> list = new ArrayList<String>();
		list.add("e话");
		list.add("d说");
		list.add("a就");
		list.add("b是");
		list.add("c不");
		Comparator<Object> c = Collator.getInstance(Locale.CHINA);
		Collections.sort(list, c);
		System.out.println(list);

	}

}
