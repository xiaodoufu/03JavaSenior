package cn.bdqn.array;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * String[] nums = {}; buySomething(nums);
		 */
		String[] nums = { "啤酒", "饮料", "矿泉水" };
		saleSomething("小黑"); // 没有东西可以出售
		saleSomething("小黑", nums); // 没有东西可以出售
		saleSomething("小黑", "haha1", "haha2", "haha3"); // 没有东西可以出售

	}

	/**
	 * 如果别人调用我们这个buySomething
	 * 必须传递一个数组！
	 * 如果说 用户确实没有参数可传递！
	 * 我们还得创建一个空数组 给 参数！
	 */
	public static void buySomething(Object[] o) {

	}

	/**
	 *  ...的特点：
	 *  
	 *  01.就是一个数组，怎么操作数组 怎么操作 ...
	 *  02.只能位于参数列表的最后一个位置
	 *  03.需要这个参数时，书写
	 *     不需要的时候，不用传递！
	 * 
	 */
	public static void saleSomething(String name, String... something) {
		for (String s : something) {
			System.out.println(name + "在出售：" + s);
		}

	}

}
