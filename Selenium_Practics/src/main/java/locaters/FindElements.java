package locaters;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://flights.qedgetech.com/");
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));		
		for(WebElement each : allLinks)
		{
			System.out.println(each.getText());
			System.out.println(each.getAttribute("href"));
		}
		
		driver.quit();
	}
}
