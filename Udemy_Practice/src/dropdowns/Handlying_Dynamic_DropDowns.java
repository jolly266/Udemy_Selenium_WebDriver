package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlying_Dynamic_DropDowns {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		WebElement start = driver.findElement(By.xpath("//a[@value=\"HYD\"]"));
		start.click();
		System.out.println(start.getText());
		Thread.sleep(2000);
		WebElement depart  = driver.findElement(By.xpath("(//a[@value=\"PAT\"])[2]"));
		depart.click();
		System.out.println(depart.getText());
				driver.quit();
		
		
		

	}

}
