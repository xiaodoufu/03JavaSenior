package cn.bdqn.sale;

/**
 * 售票的线程类   实现同步
 */
public class SynchronizedSaleMethod implements Runnable {

	// 定义总票数
	private int counts = 1000;

	// 定义出售票的下标
	private int num = 0;

	// 定义一个标识
	private boolean flag = false;

	@Override
	public void run() {
		while (!flag) {
			sale(); // 只要还有票 循环的调用卖票的方法
		}
	}

	// 同步方法
	public synchronized void sale() {
		// 如果没有票 退出循环
		if (counts <= 0) {
			flag = true;
			return;
		}
		counts--; // 卖了一张票
		num++;
		System.out.println(Thread.currentThread().getName() + "抢到了第" + num
				+ "张票！剩余票数：" + counts);
	}

	/**
	 * 模拟5个人同时抢票
	 */
	public static void main(String[] args) {
		// 实例化线程类对象
		SynchronizedSaleMethod sale = new SynchronizedSaleMethod();
		Thread t1 = new Thread(sale, "小黑");
		Thread t2 = new Thread(sale, "小白");
		Thread t3 = new Thread(sale, "小红");
		Thread t4 = new Thread(sale, "小粉");
		Thread t5 = new Thread(sale, "小蓝");
		System.out.println("开始抢票");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
