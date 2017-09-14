package cn.bdqn.control;

/*
 * 设置线程的中止状态
 */
public class InterruptDemo implements Runnable {

	@Override
	public void run() {

		// 判断线程中止状态
		if (!Thread.currentThread().isInterrupted()) {
			for (int i = 1; i <= 50; i++) {
				System.out.println(Thread.currentThread().isInterrupted());
				Thread.currentThread().interrupt(); // 设置终止状态
				System.out.println(Thread.currentThread().getName()
						+ "执行了====》" + i);
				if (i == 2) {
					Thread.currentThread().interrupted();// 清除终止状态
				}
			}
		} else {
			System.out.println("当前线程状态是  中止状态");
		}
	}

	public static void main(String[] args) {

		// 创建线程对象
		InterruptDemo demo = new InterruptDemo();
		Thread t = new Thread(demo);
		t.start();

	}

}
