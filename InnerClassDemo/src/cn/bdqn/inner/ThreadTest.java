package cn.bdqn.inner;

public class ThreadTest {
	public static void main(String[] args) {
		// 匿名内部类
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("老大哥！辛苦了！");
				}
			}
		});
		thread.start();

	}

}
