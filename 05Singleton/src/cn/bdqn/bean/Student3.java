package cn.bdqn.bean;

/**
 * 双重锁  实现 单例
 */
public class Student3 {
	// 01.创建一个静态的需要设置成单例类的 属性！
	private static Student3 student;

	// 02.私有化构造
	private Student3() {
	}

	// 03.创建一个供外部访问的接口
	public static synchronized Student3 getInstance() {
		if (student == null) {
			synchronized (Student3.class) {
				if (student == null) {
					student = new Student3();
				}
			}
		}
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
		Student3 stu1 = Student3.getInstance();
		Student3 stu2 = Student3.getInstance();
		stu2.setName("小黑");
		Student3 stu3 = Student3.getInstance();
		stu3.setAge(50);
		System.out.println(stu1 == stu2);
		System.out.println(stu2 == stu3);
		System.out.println(stu1.getName());
		System.out.println(stu1.getAge());

	}

}
