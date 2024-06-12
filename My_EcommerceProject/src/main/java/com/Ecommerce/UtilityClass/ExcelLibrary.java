package com.Ecommerce.UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelLibrary {
	
	XSSFWorkbook wb;
	XSSFSheet sheet ;
	
	public ExcelLibrary() throws Throwable {
	
		String excelPath = System.getProperty("user.dir") + "/src/test/resources/TestData/Test Data.xlsx";
			
		// Create Object of File Class to Get Excel Path
		File file = new File(excelPath);

		// To Read that Excel File
		FileInputStream fis = new FileInputStream(file);
		 wb = new XSSFWorkbook(file);
	}

	@Test
	public void readExcel() throws Throwable {
		
		String sheetName = "Test";
		XSSFSheet sheet= wb.getSheet(sheetName);
		
		// To get Total Row Count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);

		// To get Particular Row Data;
		String data = sheet.getRow(10).getCell(1).getStringCellValue();
		System.out.println(data);

		// To Print all data from Cell
		for (int i = 0; i <= rowCount; i++) {

			// To print String Data
			String data1 = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(data1);

			/* 
			  To print integer data
			int data2 = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
			System.out.println(data2);
			
			*/
		}

		for (int i = 0; i<= rowCount; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j<row.getLastCellNum(); j++) {
				String data3 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data3+" ");
			}
			System.out.println();
		}
	}
		@Test
		public void writeExcel() {
		//	
		
	}
}