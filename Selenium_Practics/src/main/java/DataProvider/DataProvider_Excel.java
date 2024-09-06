package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Excel {

	DataFormatter dataformatter = new DataFormatter();

	@Test(dataProvider = "dataProvider")
	public void testCaseData(String s, String x, String k) {
		System.out.println(s+" "+x+" "+k);
	}

	@DataProvider(name="dataProvider")
	public Object[][] getData() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/DataProvider.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = dataformatter.formatCellValue(cell);
			}
		}
		return data;
	}

}
