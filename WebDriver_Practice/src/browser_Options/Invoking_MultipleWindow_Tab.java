package browser_Options;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoking_MultipleWindow_Tab {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		String coureses = driver.findElements
				(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();

		//Invoking new Tab/Window
		driver.switchTo().newWindow(WindowType.TAB);
		
		ArrayList<String> windowid = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowid.get(1));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(coureses);
		
		driver.switchTo().window(windowid.get(0));
		driver.findElement(By.cssSelector(".theme-btn.register-btn")).click();
		

	}

}
