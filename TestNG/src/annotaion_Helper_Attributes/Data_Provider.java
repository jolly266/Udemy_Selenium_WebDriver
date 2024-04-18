package annotaion_Helper_Attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	@Test
	public void webcarloan() {

		System.out.println("Web Car Loan");
	}

	@Test(dataProvider = "getData")
	public void mobilecarloan(String username, String password) {

		System.out.println("Mobile Car Loan");
		System.out.println(username);
		System.out.println(password);
	}

	@Test
	public void apicarloan() {

		System.out.println("API Car Loan");
	}

	@DataProvider
	public Object[][] getData() {
		// Inistilizing Object Array for Data
		Object[][] data = new Object[4][2];
		// Adding Data in Array

		// First Set Of Data
		data[0][0] = "First UserName";
		data[0][1] = "First Password";

		// Second Set Of Data
		data[1][0] = "Second UserName";
		data[1][1] = "Second Password";

		// Third Set Of Data
		data[2][0] = "Third UserName";
		data[2][1] = "Third Password";

		// Fourth Set Of Data
		data[3][0] = "Fourth UserName";
		data[3][1] = "Fourth Password";
		
		return data;
	}
}
