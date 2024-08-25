package javaScriptExecuter;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		int sum=0;
		List<WebElement> allValues=	driver.findElements(By.cssSelector("[class='table-display'] td:nth-child(3)"));
		for(int i=0;i<allValues.size();i++)
		{
			String eachValue = allValues.get(i).getText();
			sum = sum+Integer.parseInt(eachValue);
		}
		System.out.println(sum);
	}

}
