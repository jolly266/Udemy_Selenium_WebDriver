package com.Ecommerce.UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileLibrary {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	String excelpath = System.getProperty("user.dir")+"/src/test/resources/TestData/Test Data.xlsx";
	public ExcelFileLibrary() throws IOException {
		
		File file = new File(excelpath);
		FileInputStream fis = new FileInputStream(file);
		wb= new XSSFWorkbook(fis);
	}
	
	public String readExcelData(String sheetName,int row, int col) {
		XSSFSheet sheet =wb.getSheet(sheetName);
		String cellData = sheet.getRow(row).getCell(col).getStringCellValue();
		return cellData;
	}

 
	public void writeExcel(String sheetName,int row,int col,String cellValue) throws IOException {
		
		XSSFSheet sheet =wb.getSheet(sheetName);
		sheet.getRow(row).createCell(col).setCellValue(cellValue);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);

	}
	
	public static void main(String[] args) throws Exception {
	
		ExcelFileLibrary obj = new ExcelFileLibrary();
		System.out.println(obj.readExcelData("Test", 3, 1));
		
		obj.writeExcel("Test", 3, 2, "Male");
		
	}
	
	
}


