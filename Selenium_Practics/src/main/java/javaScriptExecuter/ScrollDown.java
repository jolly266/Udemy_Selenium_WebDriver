package javaScriptExecuter;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollDown {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
	
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		System.out.println(values.size());

		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);

		int finalValue = Integer
				.parseInt(driver.findElement(By.cssSelector("[class='totalAmount']")).getText().split(":")[1].trim());
		System.out.println(finalValue);

		Assert.assertEquals(sum, finalValue);
		
	}
}
