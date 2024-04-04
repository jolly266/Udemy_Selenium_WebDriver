package config1;

import org.testng.annotations.Test;

public class Day1 {

	@Test(groups= {"Smoke"})
	public void webhomeloan() {

			System.out.println("home webloan");
	}

	@Test 
	public void apihomeloan() {

		System.out.println("home apiloan");
	}

	@Test
	public void mobilehomeloan(){
		System.out.println("home mobileloan");	
	}
}
