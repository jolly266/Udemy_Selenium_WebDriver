package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getting_CellValue {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/Data.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println(sheetCount);

		for (int i = 0; i < sheetCount; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet3")) 
			{
				XSSFSheet sheet = workbook.getSheetAt(i);

				Iterator<Row> rows = sheet.rowIterator();
			
				Row firstRow = rows.next();
				Iterator<Cell> cells = firstRow.cellIterator();
				
				int k=0;
				int column=0;
				while (cells.hasNext()) 
				{
					Cell ceValue = cells.next();
					if (ceValue.getStringCellValue().equalsIgnoreCase("Test Data3")) 
					{
				
						column=k;
					}
					k++;
				}
				System.out.println(column);
				
				while(rows.hasNext())
				{
				Row row = rows.next();
				if(row.getCell(column).getStringCellValue().equalsIgnoreCase("Logout"))
				{
				Iterator<Cell> cell= row.iterator();
				while(cell.hasNext())
				{
					System.out.println(cell.next().getStringCellValue());
				}
				}
				}
				
			}
		}
		workbook.close();
	}

}
