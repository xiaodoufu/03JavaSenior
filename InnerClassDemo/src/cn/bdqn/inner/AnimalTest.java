package cn.bdqn.inner;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Animal() {// 匿名内部类
			@Override
			public void eat() {
				System.out.println("小狗在eat");
			}

			@Override
			public void sleep() {
				System.out.println("小狗在sleep");
			}
		};

		dog.eat();
		dog.sleep();
	}

}
