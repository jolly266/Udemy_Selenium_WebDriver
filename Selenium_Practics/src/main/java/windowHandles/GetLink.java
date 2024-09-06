package windowHandles;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	
		WebElement header =	driver.findElement(By.id("nav-xshop-container"));
		List<WebElement> headerLinks = header.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		
		for(int i=0;i<headerLinks.size();i++)
		{
			System.out.println(headerLinks.get(i).getText());
			String tab = Keys.chord(Keys.SHIFT,Keys.ENTER);
			//headerLinks.get(i).sendKeys(tab);
		}
		
		Set<String> winids =	driver.getWindowHandles();
		for(String winid:winids)
		{
			driver.switchTo().window(winid);
			System.out.println(driver.getTitle());
		}
	}
}
