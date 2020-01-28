package com.jaya.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) {

		try {
			// Specify the path of file
			File src = new File("./res/data/TestData.xlsx");

			// load file
			FileInputStream fis = new FileInputStream(src);

			// Load workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);

			// Load sheet- Here we are loading first sheetonly
			XSSFSheet sh1 = wb.getSheetAt(0);

			// getRow() specify which row we want to read.

			// and getCell() specify which column to read.
			// getStringCellValue() specify that we are reading String data.

//			System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
//
//			System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
//
//			System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
//
//			System.out.println(sh1.getRow(3).getCell(0).getStringCellValue());
//
//			System.out.println(sh1.getRow(4).getCell(0).getStringCellValue());
//
//			System.out.println(sh1.getRow(5).getCell(0).getStringCellValue());
			
			for (int i = 0; i < sh1.getLastRowNum(); i++) {
				for (int j = 0; j <=0 ; j++) {
					System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());
				}
			}
			
			sh1.getRow(0).createCell(1).setCellValue("7656.87");
			sh1.getRow(0).createCell(2).setCellValue("Jaya");
			
			FileOutputStream fout=new FileOutputStream(new File("./res/data/TestData.xlsx"));
						 
			// finally write content 
			 
			 wb.write(fout);
			 
			// close the file
			 
			 fout.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
