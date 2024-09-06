package alertPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Accept_Alerts {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.partialLinkText("JavaScript Alerts")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//JavaScript Alerts
		String alert = "I am a JS Alert";
		String expectedResult = "You successfully clicked an alert";
		driver.findElement(By.xpath("//li[1]/button")).click();
		Assert.assertEquals(driver.switchTo().alert().getText(), alert);
		System.out.println(driver.switchTo().alert().getText());
		
		//Alerts Validation
		driver.switchTo().alert().accept();
		Assert.assertEquals(driver.findElement(By.cssSelector("p[id='result']")).getText(), expectedResult);
		System.out.println(driver.findElement(By.cssSelector("p[id='result']")).getText());
		
		
		//driver.quit();

	}

}
