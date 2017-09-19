package cn.bdqn.user;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 */
public class ServerTest {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			// 创建服务器对象
			serverSocket = new ServerSocket(8800);
			// 一直监听 客户端是否有人登录
			while (true) {
				socket = serverSocket.accept();
				/**
				 * 这个socket是第几个用户？？？ 不知道
				 * 只知道一个socket就是一个线程
				 */
				LoginThread thread = new LoginThread(socket);
				thread.start();// 启动线程
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
