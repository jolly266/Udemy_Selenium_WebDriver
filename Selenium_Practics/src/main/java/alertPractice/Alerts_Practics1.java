package alertPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alerts_Practics1 {

	public static void main(String[] args) {
		
		String text1 = "Gupta";
		String text2 = "Hello Gupta, share this practice page and share your knowledge";

		String text3 = "Prakash";
		String text4 = "Hello Prakash, Are you sure you want to confirm?";
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		//alert.accept //alert.getText 
		driver.findElement(By.cssSelector("[placeholder ='Enter Your Name']")).sendKeys(text1);
		driver.findElement(By.cssSelector("[value='Alert']")).click();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		Assert.assertEquals(alertMessage, text2);
		driver.switchTo().alert().accept();
		
		//alert.accept //alert.getText 
		driver.findElement(By.cssSelector("[placeholder ='Enter Your Name']")).sendKeys(text3);
		driver.findElement(By.cssSelector("[value='Confirm']")).click();
		String alertMessage1 = driver.switchTo().alert().getText();
		System.out.println(alertMessage1);
		Assert.assertEquals(alertMessage1, text4);
		driver.switchTo().alert().accept();
		
		 //alert.dismiss
		driver.findElement(By.cssSelector("[placeholder ='Enter Your Name']")).sendKeys(text3);
		driver.findElement(By.cssSelector("[value='Confirm']")).click();
		String alertMessage2 = driver.switchTo().alert().getText();
		System.out.println(alertMessage2);
		Assert.assertEquals(alertMessage2, text4);
		driver.switchTo().alert().dismiss();
		
		driver.close();
	}

}
