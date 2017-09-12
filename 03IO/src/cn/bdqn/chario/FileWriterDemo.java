package cn.bdqn.chario;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符输出流
 */
public class FileWriterDemo {

	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("e:/io.txt", true);
			// 开始从内存中输出到 文件中
			writer.write("我也爱你！");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close(); // 释放资源
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
