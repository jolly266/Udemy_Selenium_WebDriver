package linkValidation;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IteratingLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links =	driver.findElements(By.cssSelector("div[id='gf-BIG'] a"));
		System.out.println("Total Links Present is  "+links.size());	
			
		for(int i=1;i<links.size();i++)
		{
			String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			links.get(i).sendKeys(tab);
		}

		Set<String> winId = driver.getWindowHandles();
		int k=1;
		for(String id : winId)		
		{
			
			driver.switchTo().window(id);
		System.out.println(k+" "+driver.getTitle());
		k++;
		}
	}

}
