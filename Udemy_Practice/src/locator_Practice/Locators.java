package locator_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[contains(@placeholder,'Email')]")).sendKeys("bhabfeg@gmail.com");
		driver.findElement(By.xpath("//*[contains(@placeholder,'Pass')]")).sendKeys("shbfsyuf@65");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		String errormsg = driver.findElement(By.xpath(" //*[contains(@class,'_9ay7')]")).getText();
		System.out.println((errormsg));
		
		
		
		
		
		

	}

}
