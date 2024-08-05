package windowHandles;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandles2_Set {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement link = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li/a"));
		String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		link.sendKeys(tab);
		Thread.sleep(3000);
			
		Set<String> winId = driver.getWindowHandles();
		Iterator<String> it = winId.iterator();	
		/*
		String parentID = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());	
		*/	
	/*
		for(int i=0;i<winId.size();i++)
		{
			String id =it.next();
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
		}		
	*/		
		for(String id:winId)
		{
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
		}	
	}
}
