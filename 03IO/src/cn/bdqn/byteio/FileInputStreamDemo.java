package cn.bdqn.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节 输入流    从电脑中的某个盘符下的某个文件中   到   内存！！！
 */
public class FileInputStreamDemo {

	public static void main(String[] args) {
		InputStream stream = null;
		try {
			stream = new FileInputStream("e:/io.txt");
			System.out.println("可读取的字节数：" + stream.available());
			// 定义一个变量 接收int类型的返回值
			int num = 0;
			// 获取文件中的内容
			while ((num = stream.read()) != -1) {
				System.out.println((char) num);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 释放资源
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
