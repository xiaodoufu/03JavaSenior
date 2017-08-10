package cn.bdqn.bean;

/**
 * 
 * 失去一日甚易,欲得回已无途！
 *  
 * @author 小葱拌豆腐
 * 2017-8-10上午11:50:38
 * 
 * 
 * 学生的实体类！  
 * 类和对象的关系：
 *  01.类是对象的模版   一个类可以创建N个对象  ==>原型（多例）
 *  02.每个对象都是独一无二的！
 *  
 * 单例：
 *   无论我们通过Student创建多少个stu对象！   
 *   每个stu对象 其实都是一个！ 
 *  
 */
public class Student {

	// 01.创建一个静态的本类类型的成员属性
	private static Student stu; // 懒汉式

	// 02.私有化构造 不允许有 其他的构造
	private Student() {
	}

	// 03.创建供外部访问的接口 返回值 肯定是我们Student
	public static synchronized Student getInstance() {
		if (stu == null) { // 证明用户是第一次访问
			stu = new Student();
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
