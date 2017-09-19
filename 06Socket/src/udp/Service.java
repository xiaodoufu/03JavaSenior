package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class Service { // 服务器
	public static void main(String[] args) {
		DatagramPacket dp = null; // 打包 和 拆包数据
		DatagramSocket ds = null; // 接收和 发送数据
		// 创建一个包 给客户端响应
		DatagramPacket dpTo = null;
		try {
			byte[] buf = new byte[1024];
			// 创建数据包的对象
			dp = new DatagramPacket(buf, buf.length);
			ds = new DatagramSocket(8855);
			// 接收
			ds.receive(dp);
			// 显示接收的信息 拆包
			String msg = new String(dp.getData(), 0, dp.getLength());
			// 获取 对方的地址 客户端的信息
			System.out.println(dp.getAddress().getHostAddress() + "说====："
					+ msg);

			// 回复给 客户端
			byte[] reply = "您好！航母已经发货！".getBytes();
			// dp就是从客户端传来的信封 信封上肯定有 寄件人的地址
			SocketAddress address = dp.getSocketAddress();
			// 打包成功
			dpTo = new DatagramPacket(reply, reply.length, address);
			// 发送
			ds.send(dpTo);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}