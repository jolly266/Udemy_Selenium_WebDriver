package windowHandles;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLink1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Count of Link Present on Page = "+allLinks.size());

		WebElement topper = driver.findElement(By.cssSelector("[class='_3sdu8W emupdz']"));
		System.out.println(topper.findElements(By.tagName("a")).size());
		
		for (int i = 0; i < topper.findElements(By.tagName("a")).size(); i++) 
		{	
			String linkText = topper.findElements(By.tagName("a")).get(i).getText();
			System.out.println(linkText);
		}

	}

}
