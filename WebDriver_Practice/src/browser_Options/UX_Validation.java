package browser_Options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UX_Validation {

	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nametextbox	= driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(nametextbox.getRect().getDimension().getHeight());
		System.out.println(nametextbox.getRect().getDimension().getWidth());
		

		
	}

}
