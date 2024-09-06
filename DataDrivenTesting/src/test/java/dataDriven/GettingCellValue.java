package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingCellValue {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetCount = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetCount; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.rowIterator();
				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.iterator();
				int k = 0;
				int column = 0;
				while (cells.hasNext()) {
					Cell cellValue = cells.next();
					if (cellValue.getStringCellValue().equalsIgnoreCase("Add Profile")) {
						column = k;
					}
					k++;
				}
				while (rows.hasNext()) {
					Row row = rows.next();
					if (row.getCell(column).getStringCellValue().equalsIgnoreCase("Add Profile")) {

						Iterator<Cell> cell = row.iterator();
						while (cell.hasNext()) {
							System.out.println(cell.next().getStringCellValue());
						}
					}
				}
			}
		}
		workbook.close();
		
	}
}
