package cn.bdqn.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 用户登录
 */
public class ClientTest {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		BufferedReader br = null;
		// 序列化
		ObjectOutputStream oos = null;

		try {
			// 创建socket对象
			socket = new Socket("localhost", 8800);
			// 打开输入流和输出流
			inputStream = socket.getInputStream();
			outputStream = socket.getOutputStream();
			// 创建登录的对象
			User user = new User("admin1", "123456");
			// 序列化到服务器
			oos = new ObjectOutputStream(outputStream);
			oos.writeObject(user);
			socket.shutdownOutput();

			// 登录成功之后 服务器会给我们响应 需要接收
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("服务器给我们的回应=====》" + line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				socket.close();
				oos.close();
				outputStream.close();
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
