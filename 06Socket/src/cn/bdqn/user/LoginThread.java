package cn.bdqn.user;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LoginThread extends Thread {

	// 创建每个用户对应的socket
	Socket socket = null;

	public LoginThread(Socket socket) {
		this.socket = socket;
	}

	// 获取客户端的请求 给客户端响应
	public void run() {

		InputStream is = null;
		OutputStream os = null;
		// 反序列化
		ObjectInputStream ois = null;
		// 打开输入流和输出流
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
			ois = new ObjectInputStream(is);
			User user = (User) ois.readObject();
			System.out.println("您的用户名是：" + user.getName());
			System.out.println("您的密码是：" + user.getPassword());
			socket.shutdownInput();

			// 给用户成功响应
			os.write("恭喜您登录成功！".getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				socket.close();
				ois.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
