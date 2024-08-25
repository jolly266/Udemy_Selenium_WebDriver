package relativeLocators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UX_Validation {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.partialLinkText("Regi")).click();
		
		WebElement nameTextBoxEle = driver.findElement(By.name("name"));
		
		System.out.println(nameTextBoxEle.getRect().getDimension().getHeight());
		System.out.println(nameTextBoxEle.getRect().getDimension().getWidth());
		
		Assert.assertEquals(nameTextBoxEle.getRect().getDimension().getHeight(), 34);
		Assert.assertEquals(nameTextBoxEle.getRect().getDimension().getWidth(), 341);

	}

}
