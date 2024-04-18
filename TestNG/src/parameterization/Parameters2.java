package parameterization;

import org.testng.annotations.Test;

public class Parameters2 {


	@Test
	public void webhomeloan() {

		System.out.println("Web Car Loan");
	}

	@org.testng.annotations.Parameters({"URL"})
	@Test
	public void mobilehomeloan(String name) {

		System.out.println("Mobile Car Loan");
		System.out.println(name);
	}

	@Test 
	public void apihomeloan() {

		System.out.println("API Car Loan");
	}	
	
	
}
