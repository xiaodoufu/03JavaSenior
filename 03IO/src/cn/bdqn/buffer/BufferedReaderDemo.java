package cn.bdqn.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 
 * BufferedReader
 * 
 *  01.带有缓冲区的  输入流
 *  02.可以逐行读取
 */
public class BufferedReaderDemo {

	public static void main(String[] args) {
		Reader reader = null;
		BufferedReader br = null;

		try {
			reader = new FileReader("e:/io.txt");
			br = new BufferedReader(reader);
			StringBuffer sb = new StringBuffer();
			String line = null;
			// 开始循环读取
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // 释放资源
				br.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
