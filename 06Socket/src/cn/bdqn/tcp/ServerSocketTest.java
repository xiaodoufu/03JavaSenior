package cn.bdqn.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 超市   =====》服务器
 */
public class ServerSocketTest {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 超市
		Socket socket = null; // 顾客
		InputStream inputStream = null; // 购物车
		BufferedReader br = null; // 收银员
		OutputStream outputStream = null; // 收银员的反馈信息
		try {
			// 创建一个指定位置的超市 （服务器）
			serverSocket = new ServerSocket(8800);
			// 超市开门 等待顾客购物
			socket = serverSocket.accept();
			// 顾客开始疯狂购物
			inputStream = socket.getInputStream();
			/**
			 * 收银员会一个商品一个商品进行扫码
			 * inputStream:顾客购买的商品
			 */
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("您购买的商品是：" + line);
			}
			/**
			 * 顾客买完商品  结了账  能不能转转？？ 没出超市
			 *  结束购物  结账
			 */
			socket.shutdownInput(); // 关闭了输入流
			// 打开输出流
			outputStream = socket.getOutputStream();
			outputStream.write("谢谢您的光临".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				outputStream.close();
				socket.close();
				br.close();
				inputStream.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
