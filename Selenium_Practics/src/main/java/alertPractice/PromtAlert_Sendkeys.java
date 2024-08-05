package alertPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PromtAlert_Sendkeys {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.partialLinkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//li[3]/button")).click();
		
		//Validating alert massage
		String expectedAlertMes = "I am a JS prompt";
		Assert.assertEquals(driver.switchTo().alert().getText(), expectedAlertMes);
		System.out.println(driver.switchTo().alert().getText());
		
		//Dismiss Prompt Alert
		driver.switchTo().alert().dismiss();
		String expectedDisMes = "You entered: null";
		Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(), expectedDisMes);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		//Accept Prompt Alert with null value
		String expectedAccepNullMes = "You entered:";
		driver.findElement(By.xpath("//li[3]/button")).click();
		driver.switchTo().alert().accept();
		Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(), expectedAccepNullMes);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		// Accept Prompt Alert with some value
		String enterAlertMessa = "Gupta";
		driver.findElement(By.xpath("//li[3]/button")).click();
		driver.switchTo().alert().sendKeys(enterAlertMessa);
		driver.switchTo().alert().accept();
		String afterEnterMess = expectedAccepNullMes + " "+enterAlertMessa;
		Assert.assertEquals(driver.findElement(By.xpath("//p[@id='result']")).getText(), afterEnterMess);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		System.out.println(afterEnterMess);
		
		
		driver.quit();
		
		

	}

}
