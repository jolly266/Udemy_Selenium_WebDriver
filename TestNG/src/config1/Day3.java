package config1;

import org.testng.annotations.Test;

public class Day3 {


	@Test(groups= {"Smoke"})
	public void webbusinessloan() {

			System.out.println("business webloan");
	}

	@Test 
	public void apibusinessloan() {

		System.out.println("business apiloan");
	}

	@Test
	public void mobilebusinessloan(){
		System.out.println("business mobileloan");	
	}
}
