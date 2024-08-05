package alertPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Accept_Dismiss {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.partialLinkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//li[2]/button")).click();
		
		//Validating Alerts Text weather we accept or dismiss	
		String expectedAlert = "I am a JS Confirm";
		Assert.assertEquals(driver.switchTo().alert().getText(), expectedAlert);
		System.out.println(driver.switchTo().alert().getText());
		
		//Validating Alerts when we accept or dismiss
		String expectedOkResult = "You clicked: Ok";
		driver.switchTo().alert().accept();
		Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(), expectedOkResult);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		//Validating Alerts when we dismiss
		String expectedCancleResult = "You clicked: Cancel";
		driver.findElement(By.xpath("//li[2]/button")).click();
		driver.switchTo().alert().dismiss();
		Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(), expectedCancleResult);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		driver.quit();
	}

}
