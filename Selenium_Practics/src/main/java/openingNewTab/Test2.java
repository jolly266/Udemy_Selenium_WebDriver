package openingNewTab;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/");
		
		WebElement headerEle = driver.findElement(By.xpath("//div[@id='navbar-collapse-header']/ul"));
		List<WebElement> headerLinks = headerEle.findElements(By.tagName("a"));
		System.out.println(headerLinks.size());
		
		
		List<WebElement> topMenuText = driver.findElements(By.xpath("//div[@id='navbar-collapse-header']/ul/li/a"));
		
		for(WebElement eachText : topMenuText)
		{
			System.out.println(eachText.getText());
		}
		

	}

}
