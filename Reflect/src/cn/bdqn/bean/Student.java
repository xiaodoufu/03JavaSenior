package cn.bdqn.bean;

import java.util.Date;

/**
 * 学生对象的实体类
 */
public class Student {

	public int age; // 学生年龄
	protected String name;// 学生姓名
	private Date birthday;// 学生生日
	char sex; // 学生性别

	static int a = 50;

	static {
		System.out.println("这是Student类中的静态代码块");
	}

	{
		System.out.println("这是Student类中的普通代码块");
	}

	public Student() {
		System.out.println("这是Student类中的无参构造");
	}

	/**
	 * 私有的方法
	 */
	private double getSum(double number) {
		return number + 10;
	}

	public Student(int age, String name, Date birthday, char sex) {
		super();
		this.age = age;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
	}

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
