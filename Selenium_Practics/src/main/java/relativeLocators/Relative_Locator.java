package relativeLocators;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Locator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Above
		WebElement nameBoxEle = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameBoxEle)).getText()); 
		
		//Below
		
		WebElement emailLableEle = driver.findElement(By.xpath("//label[text()='Email']"));
		driver.findElement(with(By.tagName("input")).below(emailLableEle)).sendKeys("prakash");
		
		//Right
		WebElement checkBoxEle = driver.findElement(By.cssSelector("#exampleCheck1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(checkBoxEle)).getText());	
		
		//Left
		WebElement studentLabel = driver.findElement(By.xpath("//label[text()='Student']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(studentLabel)).click();
		
		
	}

}
