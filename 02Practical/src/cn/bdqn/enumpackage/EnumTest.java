package cn.bdqn.enumpackage;

public class EnumTest {

	public static void main(String[] args) {
		// 创建学生对象
		Student stu = new Student();
		// 通过set（）给stu对象赋值
		stu.setName("小黑黑");
		stu.setSex(Gender.WOMAN); // 只能是MAN和WOMAN
		System.out.println(stu.getName() + "的性别是："
				+ stu.getSex().getGenderSex());

	}

}
