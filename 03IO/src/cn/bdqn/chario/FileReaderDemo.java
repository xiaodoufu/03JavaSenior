package cn.bdqn.chario;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 * 字符  输入流
 */
public class FileReaderDemo {

	public static void main(String[] args) {

		// 创建输入流对象
		Reader reader = null;
		try {
			reader = new FileReader("e:/io.txt");
			int num = 0;
			// 创建char类型的字符数组 用来保存 输入流中的数据
			char[] words = new char[1024];
			// 创建字符串对象
			StringBuffer sb = new StringBuffer();
			while ((num = reader.read(words)) != -1) {
				sb.append(words);
			}
			System.out.println(sb.toString());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
