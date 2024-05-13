package locator_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM {

	public static void orangehrm() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.cssSelector(".loginText")).sendKeys("nareshit");
		driver.findElement(By.xpath("(//input[@class='loginText'])[2]")).sendKeys("nareshit");
		driver.findElement(By.cssSelector(".button")).click();
		
	}
	
	public static void main(String[] args) {
		
		orangehrm();
	}
}
