package cn.bdqn.byteio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 字节  输出流
 */
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		OutputStream stream = null;
		try {
			stream = new FileOutputStream("e:/io.txt"); // 不会覆盖之前的内容
			stream.write("我爱你中国!！".getBytes());
			stream.flush(); // 无效
			/**
			 * OutputStream本身没有设置缓冲区！
			 * 它的子类中有！ 比如 BufferedOutputStream 和PrintStream中有带缓冲区！
			 * 
			 * 举个例子：
			 *   你家在黄土高坡！
			 *   现在需要从松花江上给老家送 松花蛋！
			 *   
			 *   比如说  你现在需要1000个松花蛋！
			 *   没有缓冲区 就是   每生产一个就会送一个到你家！
			 *   这样需要送1000次！
			 *   有缓冲区，就是先把生产出来的松花蛋放进仓库！等仓库满了之后或者flush（）的时候
			 *   才去发送！
			 *   
			 *   flush（） 举例：
			 *   现在我的仓库有50个松花蛋！  但是 用户flush（）， 那么不需要等待仓库装满！
			 *   立即发送！
			 */
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
