package cn.bdqn.control;

import cn.bdqn.thread.MyRunnableDemo;

/**
 * t1.join() ：必须等待t1线程执行完毕之后，其他的线程才能执行！
 */
public class JoinDemo implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + "执行了====》"
					+ i);
		}
	}

	// 多线程的并发执行
	public static void main(String[] args) {
		// 创建线程类对象
		MyRunnableDemo demo1 = new MyRunnableDemo();
		// 创建线程对象
		Thread t1 = new Thread(demo1, "join的线程");
		// 启动辅助线程t1
		t1.start();
		for (int i = 1; i <= 10; i++) { // 在main主线程中进行输出操作
			System.out.println(Thread.currentThread().getName() + "执行的i值：" + i);
			if (i == 5) {
				try {
					t1.join(); // 阻塞主线程main ！执行t1
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
