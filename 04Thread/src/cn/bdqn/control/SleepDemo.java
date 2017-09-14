package cn.bdqn.control;

/**
 * t1.sleep() ：必须等待t1线程睡醒之后，其他的线程才能执行！
 */
public class SleepDemo implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000); // 线程休眠1秒
				System.out.println(Thread.currentThread().getName()
						+ "执行了====》" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// 多线程的并发执行
	public static void main(String[] args) {
		// 创建线程类对象
		SleepDemo demo1 = new SleepDemo();
		SleepDemo demo2 = new SleepDemo();
		// 创建线程对象
		Thread t1 = new Thread(demo1, "sleep1的线程");
		Thread t2 = new Thread(demo2, "sleep2的线程");
		t1.start();
		t2.start();
	}
}
