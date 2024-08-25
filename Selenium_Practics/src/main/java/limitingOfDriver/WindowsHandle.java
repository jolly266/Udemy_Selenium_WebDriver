package limitingOfDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));	
		
		//Count Total Links landing Page
		System.out.println("Count of Links on Landing Page = "+allLinks.size());
		
		//Limiting Webdriver object to footer section and getting Links Count
		WebElement footerEle = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		List<WebElement> footerLinks = footerEle.findElements(By.tagName("a"));
		System.out.println("Count of Links on footer section = "+footerLinks.size());
		
		//Limiting Webdriver object to footer first table section and getting Links Count
		WebElement footerFirstTableEle = footerEle.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		List<WebElement> footerFirstTableLinks = footerFirstTableEle.findElements(By.tagName("a"));
		System.out.println("Count of Links on footer First column = "+footerFirstTableLinks.size());
		
		// Iterating all Links
		for(WebElement eachLink : footerFirstTableLinks)
		{
		String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		eachLink.sendKeys(tab);
		}
		
		//Iterating all tabs and getting title
		Set<String> winids = driver.getWindowHandles();
		for(String id:winids)
		{
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());	
		}

	}

}
