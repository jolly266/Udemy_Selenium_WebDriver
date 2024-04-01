package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selecting_Static_Dropdown_by_loop {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		  // By Using While loop 
		  int i = 1; while(i<5) {
		  driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		// By Using for loop
		
		for (int i2 = 1; i2 < 4; i2++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.quit();

	}

}
