package cn.bdqn.test;

public class FatherClass { // 外部类
	private static int age = 5;
	private int num = 5000;

	class Son { // 成员内部类
		int age = 50;
		private int num = 5;

		public void sayHello() {
			System.out.println(FatherClass.this.num);
		}
	}

	// 外部类的方法
	public void getSon() {
		class Son { // 这个类被定义在了一个方法中 ===》局部内部类
			public void sayBye() {
				System.out.println("再见了！老大哥！");
			}
		}
		Son son = new Son(); // 仅限于本方法中使用
		son.sayBye();
	}

	// 静态内部类

	static class Son2 {
		public void sayBye() {
			System.out.println("再见了！Son2静态内部类");
		}
	}
}
