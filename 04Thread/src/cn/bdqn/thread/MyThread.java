package cn.bdqn.thread;

public class MyThread {

	/**
	 * 主线程的入口
	 */
	public static void main(String[] args) {
		// 获取当前执行的线程
		Thread t = Thread.currentThread();
		System.out.println("当前线程的名称是====》：" + t.getName());
		// 设置线程名称
		t.setName("主线程Main");
		System.out.println("当前线程的名称是====》：" + t.getName());
	}

}
