package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Arrow_Down {

	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("soap");
		Actions ac = new Actions(driver);
		
		int i=1;
		while(i<=4)
			
		{
			ac.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
			i++;
		}
		ac.sendKeys(Keys.ENTER).build().perform();
	
	}

}
