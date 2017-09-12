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
			System.out.println("输入流中可读取的字节数：" + stream.available());
			// 定义一个变量 接收int类型的返回值
			int num = 0;
			// 获取文件中的内容
			while ((num = stream.read()) != -1) {
				System.out.println((char) num);
			}
			/**
			 * stream.read()
			 *       从stream中读取一个8位的字节！然后转换成了0-255之间的整数返回！
			 *       如果读到了stream的结尾，返回-1！
			 * 
			 * stream.read(byte[] b)
			 *       从stream中读取若干个字节，保存到了b字节数组中！
			 *       返回的整数表示读取了多少个字节！如果读到了stream的结尾，返回-1！
			 * 
			 * stream.read(byte[] b,int off,int length)
			 *       从stream中读取若干个字节，保存到了b字节数组中！
			 *       参数off:在b字节数组中开始保存数据的起始下标！
			 *       length：读取的字节数量！返回的整数表示读取了多少个字节！
			 *       如果读到了stream的结尾，返回-1！
			 */
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
