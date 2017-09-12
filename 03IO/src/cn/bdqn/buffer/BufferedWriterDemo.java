package cn.bdqn.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 带有缓冲区的  输出流
 */
public class BufferedWriterDemo {

	public static void main(String[] args) {

		Writer writer = null;
		BufferedWriter bw = null;
		try {
			writer = new FileWriter("e:/io.txt", true);
			bw = new BufferedWriter(writer);
			// 开始输出
			bw.write("今天天气不错1111！");
			bw.newLine();
			bw.write("今天天气不错呀2222！");
			bw.flush();
			bw.write("今天天气不错呀3333！");
			bw.write("今天天气不错呀4444！");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
