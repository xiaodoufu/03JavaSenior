package cn.bdqn.control;

import cn.bdqn.thread.MyRunnableDemo;

/**
 * 线程的优先级
 * 默认是5 
 * 取值是1-10
 * 优先级越高代表获取cpu资源的概率越高！并不代表一定高！（cpu不一定没给分配时间片）
 */
public class MyThread implements Runnable {

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
		MyRunnableDemo demo2 = new MyRunnableDemo();

		// 创建线程对象
		Thread t1 = new Thread(demo1, "第1个线程");
		Thread t2 = new Thread(demo2, "第2个线程");

		// 获取两个线程的默认优先级
		System.out.println("第1个线程的默认优先级是===》" + t1.getPriority());
		System.out.println("第2个线程的默认优先级是===》" + t2.getPriority());

		// 设置t1的优先级为10
		t1.setPriority(10);
		System.out.println("第1个线程的默认优先级是===》" + t1.getPriority());
		System.out.println("第2个线程的默认优先级是===》" + t2.getPriority());

		// 启动线程
		t1.start();
		t2.start();

	}
}
