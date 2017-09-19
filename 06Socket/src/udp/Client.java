package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client { // 客户端
	public static void main(String[] args) {
		DatagramPacket dp = null; // 打包 和 拆包数据
		DatagramSocket ds = null; // 接收和 发送数据
		// 创建一个包 给服务器响应
		DatagramPacket dpTo = null;
		InetAddress address = null;
		try {
			// 你在网上购物 要不要给客服 说你的地址
			byte[] say = "买个航空母舰！".getBytes();
			// 获取本机的地址！
			address = InetAddress.getByName("localhost");
			// 打包
			dp = new DatagramPacket(say, say.length, address, 8855);
			// 发送
			ds = new DatagramSocket();
			ds.send(dp);

			// 接收
			byte[] buf = new byte[1024];
			dpTo = new DatagramPacket(buf, buf.length);
			ds.receive(dpTo);
			// 我们看客服给我们回复了 什么 拆包
			String reply = new String(dpTo.getData(), 0, dpTo.getLength());
			System.out.println(dpTo.getAddress().getHostAddress() + "说===》"
					+ reply);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
