package cn.bdqn.sale;

/**
 * 售票的线程类   实现同步
 */
public class SynchronizedSale implements Runnable {

	// 定义总票数
	private int counts = 10000;

	// 定义出售票的下标
	private int num = 0;

	@Override
	public void run() {
		while (true) {
			/**
			 * 在多个线程并发访问我们这个run（）的时候
			 * 只能有一个线程进入我们这个synchronized 同步代码块！
			 * 第一个线程执行完毕之后，之后的线程才能进入....依次类推
			 */
			synchronized (this) {
				// 如果没有票 退出循环
				if (counts <= 0) {
					break;
				}
				counts--; // 卖了一张票
				num++;
				System.out.println(Thread.currentThread().getName() + "抢到了第"
						+ num + "张票！剩余票数：" + counts);
			}
		}
		synchronized (this) {

		}
	}

	/**
	 * 模拟3个人同时抢票
	 */
	public static void main(String[] args) {
		// 实例化线程类对象
		SynchronizedSale sale = new SynchronizedSale();
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
