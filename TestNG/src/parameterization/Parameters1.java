package parameterization;

import org.testng.annotations.Test;

public class Parameters1 {


	@Test
	public void webcarloan() {

		System.out.println("Web Car Loan");
	}

	@org.testng.annotations.Parameters("URL")
	@Test
	public void mobilecarloan(String name) {

		System.out.println("Mobile Car Loan");
		System.out.println(name);
	}

	@Test 
	public void apicarloan() {

		System.out.println("API Car Loan");
	}	
	
}
