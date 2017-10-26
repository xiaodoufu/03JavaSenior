package com.xdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 
 * 失去一日甚易,欲得回已无途！
 *  
 * @author 小葱拌豆腐
 * 2017-10-26下午3:53:36
 * 
 * 
 * Excel表的导出 ===》输出流
 */
public class ExcelDemo {

	public static void main(String[] args) {

		// 创建Excel文件对应的对象
		HSSFWorkbook hw = new HSSFWorkbook();
		// 创建sheet
		HSSFSheet sheet = hw.createSheet("成绩表");
		// 通过sheet创建row 0-65535
		HSSFRow row1 = sheet.createRow(0);
		HSSFRow row2 = sheet.createRow(1);
		HSSFRow row3 = sheet.createRow(2);
		// 通过row创建cell 0-255
		HSSFCell c1 = row1.createCell(0);
		HSSFCell c2 = row2.createCell(1);
		HSSFCell c3 = row3.createCell(2);
		// 一个cell就是一个单元格
		c1.setCellValue("第1行的第1列");
		c2.setCellValue("第2行的第2列");
		c3.setCellValue("第3行的第3列");
		// 创建输出流 把数据写入 磁盘
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("e:/myExcel.xls");
			hw.write(fos); // 文件的生成
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
