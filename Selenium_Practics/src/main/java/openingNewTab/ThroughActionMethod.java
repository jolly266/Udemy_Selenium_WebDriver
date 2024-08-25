package openingNewTab;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ThroughActionMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement soapEle = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[3]/a"));
		Actions ac = new Actions(driver);
		
		ac.moveToElement(soapEle).keyDown(Keys.CONTROL).click().build().perform();	
		System.out.println("hhh");
	}

}
