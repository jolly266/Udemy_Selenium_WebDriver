package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppUtil {
	public static WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
	}

	@Test(priority = 0)
	public void clickonlogin() {

		driver.findElement(By.className("_38VF5e")).click();
	}

	@Test(priority = 1)
	public void clickRegistrationButton() {

		driver.findElement(By.className("_14Me7y")).click();
	}
}
