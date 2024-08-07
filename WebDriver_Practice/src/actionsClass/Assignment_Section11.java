package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Section11 {

	// Pull Request and Pull Request(3)
	// Pull Request and Pull Request(4)
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String optionText= driver.findElement(By.xpath("(//div[@id='checkbox-example']/fieldset/label)[2]")).getText();
		
		
		WebElement droplist = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select dropdown = new Select(droplist);
		dropdown.selectByVisibleText(optionText);
		
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(optionText);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		if(alertText.contains(optionText))
		{
			System.out.println("Sucess");
		}
		else
		{
			System.out.println("Error");
		}
		
	}

}
