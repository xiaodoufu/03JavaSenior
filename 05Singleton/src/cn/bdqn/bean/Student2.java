package cn.bdqn.bean;

/**
 * 饿汉式  实现 单例
 */
public class Student2 {
	// 01.创建一个静态的需要设置成单例类的 属性！
	private static Student2 student = new Student2();

	// 02.私有化构造
	private Student2() {
	}

	// 03.创建一个供外部访问的接口
	public static synchronized Student2 getInstance() {
		return student;
	}

	private String name; // 姓名
	private int age; // 年龄

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 测试方法
	public static void main(String[] args) {

		// 创建3个student对象
		Student2 stu1 = Student2.getInstance();
		Student2 stu2 = Student2.getInstance();
		stu2.setName("小黑");
		Student2 stu3 = Student2.getInstance();
		stu3.setAge(50);
		System.out.println(stu1 == stu2);
		System.out.println(stu2 == stu3);
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());

	}

}
