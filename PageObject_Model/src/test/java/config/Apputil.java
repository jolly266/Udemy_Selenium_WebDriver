package config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageActions.Login;

public class Apputil {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Login login = new Login(driver);
		login.enterusername("Admin");
		login.enterpassword("Qedge123!@#");
		login.clickLoginButton();
		
		
		
		
	}

}
