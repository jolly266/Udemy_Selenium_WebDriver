package selectClassPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSugge {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("textarea[title='Search']")).sendKeys("Narendra Modi");
		List<WebElement> suggoptions = driver.findElements(By.cssSelector("div[class='wM6W7d'] span b"));
		System.out.println(suggoptions.size());
		for(WebElement option : suggoptions)
		{
			System.out.println(option.getText());
			if(option.getText().contains("twitter"))
			{
				option.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
