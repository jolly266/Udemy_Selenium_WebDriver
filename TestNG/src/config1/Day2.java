package config1;

import org.testng.annotations.Test;

public class Day2 {


	@Test(groups= {"Smoke"})
	public void webcarloan() {

			System.out.println("car webloan");
	}

	@Test 
	public void apicarloan() {

		System.out.println("car apiloan");
	}

	@Test
	public void mobilecarloan(){
		System.out.println("car mobileloan");	
	}
}
