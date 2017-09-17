package cn.bdqn.sale;

/**
 * 售票的线程类
 */
public class Sale implements Runnable {

	// 定义总票数
	private int counts = 100;

	// 定义出售票的下标
	private int num = 0;

	@Override
	public void run() {
		while (true) {
			// 如果没有票 退出循环
			if (counts <= 0) {
				break;
			}
			counts--; // 卖了一张票
			num++;
			System.out.println(Thread.currentThread().getName() + "抢到了第" + num
					+ "张票！剩余票数：" + counts);
		}
	}

	/**
	 * 模拟3个人同时抢票
	 */
	public static void main(String[] args) {
		// 实例化线程类对象
		Sale sale = new Sale();
		Thread t1 = new Thread(sale, "小黑");
		Thread t2 = new Thread(sale, "小白");
		Thread t3 = new Thread(sale, "小红");
		System.out.println("开始抢票");
		t1.start();
		t2.start();
		t3.start();

	}

}
