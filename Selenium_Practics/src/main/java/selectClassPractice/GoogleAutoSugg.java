package selectClassPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSugg {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		
		//Sending Text to SearchBox
		driver.findElement(By.cssSelector("textarea[aria-label='Search']")).sendKeys("Virat Kohli");
		Thread.sleep(2000);
		
		//Getting All AutoSuggestion 
		List<WebElement> suggOption = driver.findElements(By.cssSelector("div[class='wM6W7d'] span b"));
		
		//Ittrating each Suggoption
		for(WebElement eachOption : suggOption)
		{
			System.out.println(eachOption.getText());
			
			if(eachOption.getText().contains("net"))
			{
				eachOption.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
