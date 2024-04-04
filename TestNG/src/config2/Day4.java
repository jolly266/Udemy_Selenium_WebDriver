package config2;

import org.testng.annotations.Test;

public class Day4 {


	@Test(groups= {"Smoke"})
		public void webbikeloan() {

				System.out.println("bike webloan");
		}

		@Test 
		public void apibikeloan() {

			System.out.println("bike apiloan");
		}

		@Test
		public void mobilebikeloan(){
			System.out.println("bike mobileloan");	
		}
}
