package config;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;


public class Forgotcredentials extends config.AppUtil{

	@AfterTest
	public void teardown() {	
		
	driver.findElement(By.className("_14Me7y")).click();
	}
}
