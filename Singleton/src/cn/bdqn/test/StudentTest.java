package cn.bdqn.test;

import cn.bdqn.bean.Student3;

public class StudentTest {
	/**
	            创建多个学生对象
		Student stu1 = new Student(1, "小黑");
		Student stu2 = new Student(2, "小白");
		Student stu3 = new Student(3, "大黄");
		 改变stu2的姓名
		stu2.setName("小白2");
		 获取stu3的姓名
		System.out.println(stu3.getName());
	 */
	public static void main(String[] args) {
		/**
		 * 想实现的效果    无论我们改变了哪个对象的属性，其他的对象属性随之改变！！！
		 *  必须使用单例！
		 */
		Student3 stu1 = Student3.getInstance();
		// 给stu1对象的age赋值
		stu1.setAge(50);
		Student3 stu2 = Student3.getInstance();
		// 给stu2对象的name赋值
		stu2.setName("所有人共享的姓名");
		Student3 stu3 = Student3.getInstance();
		// 输出stu3的属性
		System.out.println(stu3.getAge());
		System.out.println(stu3.getName());
		System.out.println(stu1 == stu2); // true

	}
}
