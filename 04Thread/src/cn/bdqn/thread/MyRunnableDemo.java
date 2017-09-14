package cn.bdqn.thread;

/**
 * 02.实现Runnable接口
 */
public class MyRunnableDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "执行了====》"
					+ i);
		}
	}

	// 多线程的并发执行
	public static void main(String[] args) {
		// 创建线程类对象
		MyRunnableDemo demo1 = new MyRunnableDemo();
		MyRunnableDemo demo2 = new MyRunnableDemo();

		// 创建线程对象
		Thread t1 = new Thread(demo1, "第1个线程");
		Thread t2 = new Thread(demo2, "第2个线程");

		// 启动线程
		t1.start();
		t2.start();

	}
}
