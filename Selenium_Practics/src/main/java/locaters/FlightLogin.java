package locaters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.partialLinkText("Regi")).click();
		
		driver.findElement(By.name("name")).sendKeys("Shivam");           
		driver.findElement(By.id("contact")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shivam@123");
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("password");
		
		WebElement genderEle =	driver.findElement(By.xpath("(//*[@class='form-control'])[5]"));
		Select gendropdown = new Select(genderEle);
		gendropdown.selectByVisibleText("Male");
	
		System.out.println(gendropdown.getFirstSelectedOption().getText());	
		
		
		driver.findElement(By.xpath("//div/table/tbody/tr[4]/td[5]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		System.out.println(driver.getCurrentUrl());	
		String actualTitle = driver.getTitle();	
		String expectedTitle = "Flight Reservation | Registration";
		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title Didn't Matched");
		}
		
		System.out.println(actualTitle.length());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		
		driver.quit();
		
		
	}

}
