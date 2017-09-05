package cn.bdqn.settest;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		/**
		 * Set ：
		 *   01.存储的是唯一（不能重复） 无序的数据！
		 *   02.HashSet是常用的实现类
		 *   03.存放的是对象的引用
		 */

		Set set = new HashSet();
		set.add(1);
		set.add("1");
		set.add('1');
		set.add(null);
		System.out.println(set.size()); // 输出集合的大小 4

		Set set2 = new HashSet();
		set2.add(1);
		set2.add(1);
		set2.add(1);
		System.out.println(set2.size()); // 输出集合的大小 1

		/**
		 *  通过观看底层代码得知：                                        
			private transient HashMap<E,Object> map; 
			 public boolean add(E e) {               
			      return map.put(e, PRESENT)==null;  
			  }  
		 01.HashSet	类中 有一个属性是 map  ，值类型是 HashMap
		 02.我们在使用add(e) ，其实是调用了map.put(e,PRESENT)
		      把e当成了map的key值！
		      因为Map的key是唯一的！ 所以我们的hashSet存储的也是唯一的！
		 03.那么怎么知道	map中的key是唯一的呢？ 看hashMap的put()  
		 
		   String的底层 是 char类型的数组！
		   怎么比较两个值是否一致？  把char数组中的每一个元素都比较，全相等  才相等！
		   
		   所以hashMap在添加数据的时候
		   01.先进行hash运算
		   02.把计算的值当成数组中的下标
		   03.判断下标指向的数组元素是否为空，如果为空 直接 添加数据
		   04.如果不为空
		           依次查询entry中的所有元素
		   05.判断key是否相等
		        001.e.hash == hash
		        002.(k = e.key) == key || key.equals(k)
		      如果相等  直接覆盖
		   不相等 通过next的变量 将值 新增到entry！  
		   
		   
		   
		   
		   HashSet 和 TreeSet的区别
		   
		  01. HashSet底层是哈希表实现的！
		      TreeSet底层是二叉树实现的！
		  02. HashSet存放的数据是无序的！
		      TreeSet存放的数据是有序的！
		  03. HashSet可以存放 null！但是只能是一个null!
		      TreeSet不可以存放null！
		  04. HashSet底层是由HashMap实现！ 
		      TreeSet底层是由TreeMap实现！ 
		  05. HashSet是线程不安全的！ 单线程是安全！
		      TreeSet是线程安全的！   
		   
		 */

	}

}
