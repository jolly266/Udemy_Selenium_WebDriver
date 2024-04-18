package annotaion_Helper_Attributes;

import org.testng.annotations.Test;

public class Depends_OnMethods {

	
	
	@Test
	public void webcarloan() {

		System.out.println("Web Car Loan");
	}

	@Test (dependsOnMethods="webcarloan")
	public void mobilecarloan() {

		System.out.println("Mobile Car Loan");
	}

	@Test (dependsOnMethods= {"webcarloan","mobilecarloan"})
	public void apicarloan() {

		System.out.println("API Car Loan");
	}

}
