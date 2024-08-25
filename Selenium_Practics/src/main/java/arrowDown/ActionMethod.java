package arrowDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethod {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("[id='autocomplete']")).sendKeys("uni");
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		ac.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		ac.click().build().perform();
	}

}
