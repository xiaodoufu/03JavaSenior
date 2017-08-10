package cn.bdqn.bean;

public class Student2 {

	// 01.创建一个静态的本类类型的成员属性
	private static Student2 stu = new Student2(); // 饿汉式

	// 02.私有化构造 不允许有 其他的构造
	private Student2() {
	}

	// 03.创建供外部访问的接口 返回值 肯定是我们Student
	public static synchronized Student2 getInstance() {
		return stu;
	}

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

}
