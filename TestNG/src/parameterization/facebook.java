package parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		driver.findElement(By.cssSelector(".inputtext._58mg._5dba._2ph-")).sendKeys("Manish");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("Password");
		WebElement date = driver.findElement(By.cssSelector("._9407._5dba._9hk6._8esg"));
		Select select = new Select(date);
		select.selectByVisibleText("10");
		
		WebElement month=driver.findElement(By.cssSelector("#month"));
		Select select1 = new Select(month);
		select1.selectByIndex(6);
		WebElement year= driver.findElement(By.cssSelector("#year"));
		Select select2= new Select(year);
		select2.selectByIndex(8);
		driver.findElement(By.xpath("(//input[@name='sex'][@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
	}
}
