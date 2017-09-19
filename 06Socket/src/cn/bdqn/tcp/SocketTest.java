package cn.bdqn.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 顾客=====》客户端
 */
public class SocketTest {

	public static void main(String[] args) {
		Socket socket = null; // 顾客
		OutputStream outputStream = null; // 钱包
		InputStream inputStream = null; // 账单或者是收银员的回馈信息
		BufferedReader br = null;
		try {
			// 顾客去哪个地方的哪个超市购物
			socket = new Socket("localhost", 8800);
			// 消费 相当于 钱从钱包 出去了.......
			outputStream = socket.getOutputStream();
			outputStream.write("买了一艘航空母舰".getBytes());
			// 购物完毕
			socket.shutdownOutput();

			// 接收收银员的回馈信息
			inputStream = socket.getInputStream();
			// 循环获取收银员的回馈信息
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				inputStream.close();
				socket.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
