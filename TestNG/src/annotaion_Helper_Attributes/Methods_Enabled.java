package annotaion_Helper_Attributes;

import org.testng.annotations.Test;

public class Methods_Enabled {
	
	
	@Test
	public void webcarloan() {

		System.out.println("Web Car Loan");
	}

	@Test
	public void mobilecarloan() {

		System.out.println("Mobile Car Loan");
	}

	@Test (dependsOnMethods = {"webcarloan","mobilecarloan"},enabled=true)
	public void apicarloan() {

		System.out.println("API Car Loan");
	}	
}
