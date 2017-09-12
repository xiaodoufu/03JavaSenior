package cn.bdqn.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 序列化 和 反序列化
 */
public class ObjectStreamDemo {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// 调用add
		add();

		// 登录的方法
		System.out.println("请输入您的用户名：");
		String name = input.next();
		System.out.println("请输入您的密码：");
		String password = input.next();
		/**
		 * 用户输入的这个用户名和密码  需要和 文件中的对象 进行比较
		 * 01.怎么从文件中获取这个对象到 内存中呢？
		 * 02.使用ObjectInputStream  输入流
		 */

		InputStream in = new FileInputStream("e:/student.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		User user = (User) ois.readObject();
		if (user.getPassword().equals(password) && user.getName().equals(name)) {
			System.out.println("登录成功！");
		} else {
			System.out.println("登陆失败！");
		}

		ois.close();
		in.close();
	}

	// 注册用户
	public static void add() throws Exception {
		System.out.println("请输入您的用户名：");
		String name = input.next();
		System.out.println("请输入您的密码：");
		String password = input.next();
		// 创建用户对象
		User user = new User(name, password);

		// 想把我们这个user对象放进文件中
		OutputStream out = new FileOutputStream("e:/student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(user);
		oos.close();
		out.close();

	}

}
