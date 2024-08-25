package windowHandles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowHandles3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("a[target='_blank']")).click();
		
		Set<String> winIds = driver.getWindowHandles();
		Iterator<String> winid =	winIds.iterator();
		
		/*
		for(int i=0;i<winIds.size();i++)
		{
			String id = winid.next();
			driver.switchTo().window(id);
			System.out.println(id);
			System.out.println(driver.getTitle());
		}
		*/
		
		for(String id :winIds) {
			driver.switchTo().window(id);
			System.out.println(id);
			System.out.println(driver.getTitle());
			
			
		}
		

	}

}
