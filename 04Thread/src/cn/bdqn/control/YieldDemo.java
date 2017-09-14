package cn.bdqn.control;


/**
 * t1.yield() ：线程的礼让！  有可能对方不接受！
 */
public class YieldDemo implements Runnable {
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
		YieldDemo demo1 = new YieldDemo();
		Thread t1 = new Thread(demo1, "老幼病残线程");
		// 启动辅助线程t1
		t1.start();
		for (int i = 1; i <= 100; i++) { // 在main主线程中进行输出操作
			System.out.println(Thread.currentThread().getName() + "执行的i值：" + i);
			if (i % 2 == 0) {
				Thread.currentThread().yield(); // 主线程礼让
			}
		}
	}
}
