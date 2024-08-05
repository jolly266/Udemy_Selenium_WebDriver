package windowHandles;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/*
		 Actions ac = new Actions(driver); ac.scrollToElement( (WebElement)
		  driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[5]"))); 
		  WebElement allLinks = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		  
		  for (int i = 1; i < allLinks.findElements(By.tagName("a")).size(); i++) {
		  String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		 allLinks.findElements(By.tagName("a")).get(i).sendKeys(tab); 
		 }
		 */
		
		
		/*
		List<WebElement> tabEle = driver.findElements(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li/a"));

		for (WebElement eachtab : tabEle) {
			Actions ac = new Actions(driver);
			ac.moveToElement(eachtab).keyDown(Keys.CONTROL).click().build().perform();
		}
	*/
		
		List<WebElement> tabEle = driver.findElements(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li/a"));
		for(WebElement eachTab : tabEle)
		{
			String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			eachTab.sendKeys(tab);
		}
		
		ArrayList<String> winid = new ArrayList<String>(driver.getWindowHandles());

		for (int i = 0; i < winid.size(); i++) {
			driver.switchTo().window(winid.get(i));
			System.out.println(driver.getTitle());
		}

	}

}
