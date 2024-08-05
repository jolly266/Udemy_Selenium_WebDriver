package windowHandles;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement header = driver.findElement(By.xpath("//div[@id='nav-xshop']"));
		System.out.println(header.findElements(By.tagName("a")).size());
		
		for(int i =1; i<header.findElements(By.tagName("a")).size();i++)
		{
			String headerText = header.findElements(By.tagName("a")).get(i).getText();
			String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			header.findElements(By.tagName("a")).get(i).sendKeys(tab);
			System.out.println(headerText);
			
		}
	}
}
