package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".tox-edit-area__iframe")));
		//driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().frame(0);
		WebElement editbox = driver.findElement(By.cssSelector(".mce-content-body "));
		editbox.clear();
		editbox.sendKeys("i am a boy.");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//div[@role='toolbar'])[3]//button[1]")).click();
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".tox-edit-area__iframe")));
		//driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().frame(0);
		editbox.sendKeys(" i am a girl");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//div[@role='toolbar'])[4]//button[3]")).click();
	
	}

}
