package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test(dataProvider = "data")
	public void getData(String a,String b,String c) {
		System.out.println(a+b+c);
	}
	
	
	@DataProvider(name="data")
	public Object[][] data() {
		Object [][] data1= {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		return data1;
	}	
}
