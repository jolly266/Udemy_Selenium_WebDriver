package annotaion_Helper_Attributes;

import org.testng.annotations.Test;

public class timeout {

	@Test
	public void webcarloan() {

		System.out.println("Web Car Loan");
	}

	//(enabled=false)
	@Test(timeOut = 4000,description = "Mobile,Mobile,Mobile",invocationCount = 5)
	public void mobilecarloan() {

		System.out.println("Mobile Car Loan");
	}

	@Test 
	public void apicarloan() {

		System.out.println("API Car Loan");
	}	
}
