package cn.bdqn.thread;

/**
 * 01.继承Thread类
 */
public class MyThreadDemo extends Thread {

	/**
	 * 重写父类的run（）
	 */
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "执行了====》"
					+ i);
		}
	}

	// 多线程的并发执行
	public static void main(String[] args) {
		// 创建两个线程对象
		MyThreadDemo t1 = new MyThreadDemo();
		MyThreadDemo t2 = new MyThreadDemo();
		/**
		t1.run();
		t2.run();   这样调用run()  就是普通的方法，一个方法不执行完毕，另一个方法无法执行！所以顺序执行！
		*/

		// 真正的启动线程 是调用线程类（继承了Thread类或者实现了Runnable接口）的start()

		t1.setName("第1个线程");
		t2.setName("第2个线程");

		t1.start();
		t2.start();

	}

}
