package locaters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://flights.qedgetech.com/");
		driver.navigate().refresh();
		driver.get("https://bollyflix.band/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://eprprojectjwala2.atlassian.net/jira/software/c/projects/EP/boards/5");
		
	}

}
