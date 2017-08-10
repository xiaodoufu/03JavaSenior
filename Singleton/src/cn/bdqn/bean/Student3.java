package cn.bdqn.bean;

public class Student3 {

	// 01.创建一个静态的本类类型的成员属性
	private static Student3 stu;

	// 02.私有化构造 不允许有 其他的构造
	private Student3() {
	}

	// 03.创建供外部访问的接口 返回值 肯定是我们Student
	public static synchronized Student3 getInstance() {
		if (stu == null) { // 证明用户是第一次访问
			synchronized (Student3.class) {
				if (stu == null) { // 再次验证对象是否为空
					stu = new Student3();
				}
			}
		}
		return stu; // 如果stu有了 直接返回 不需要再次创建
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
