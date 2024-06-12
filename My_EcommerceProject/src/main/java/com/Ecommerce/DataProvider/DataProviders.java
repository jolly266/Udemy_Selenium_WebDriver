package com.Ecommerce.DataProvider;

import org.testng.annotations.DataProvider;

import com.Ecommerce.UtilityClass.ExcelUtility;

public class DataProviders {
	
	ExcelUtility obj = new ExcelUtility();
	
	@DataProvider(name = "credentials")
	public Object[][] getCredentials(){
		
		//Total Row Count
		int rows = obj.getRowCount("credentials");
		int actRow = rows-1;
		
		//Total Column Count
		int column = obj.getColumnCount("credentials");
		
		Object[][]data = new Object[actRow][column];
		
		for(int i=0;i<actRow;i++) {
			
			for(int j=0;j<column;j++) {
			data[i][j]=obj.getCellData("credentials",j,i+2);
			}
		}
		
		return data;	
				
	}
}
