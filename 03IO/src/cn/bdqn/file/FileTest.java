package cn.bdqn.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// 创建一个文件
		File file = new File("e:/io.txt");
		// 传入一个File 进行删除 或者 新增 操作
		createOrDelFile(file);
		// 创建文件夹（目录）
		File filePackage = new File("e:/log/log/log/haha");
		// filePackage.mkdir(); 只能创建一级目录
		filePackage.mkdirs(); // 创建多级目录

	}

	private static void createOrDelFile(File file) throws IOException {
		if (file.exists()) { // 如果文件存在
			file.deleteOnExit();
			System.out.println("文件已经存在，自动删除");
		} else {
			if (file.createNewFile()) { // 如果创建成功返回true
				System.out.println("文件创建成功");
				System.out.println("文件的名称：" + file.getName());
				System.out.println("文件的大小：" + file.length());
				System.out.println("文件的路径：" + file.getAbsolutePath());
			} else {
				System.out.println("文件创建失败");
			}
		}

	}

}
