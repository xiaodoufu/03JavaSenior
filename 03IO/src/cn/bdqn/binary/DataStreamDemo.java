package cn.bdqn.binary;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 2进制 的输入 输出流 
 */
public class DataStreamDemo {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("e:/U2/music.mp3");
		// 从电脑中读取某个2进制文件
		DataInputStream dis = new DataInputStream(in);

		OutputStream out = new FileOutputStream("e:/haha.mp3");
		// 需要从内存中 放到电脑中的指定位置
		DataOutputStream dos = new DataOutputStream(out);

		int num = 0;
		// 读取之后 直接 写入
		while ((num = dis.read()) != -1) {
			// 写入
			dos.write(num);
		}

		dos.close();
		dis.close();
		out.close();
		in.close();

	}

}
