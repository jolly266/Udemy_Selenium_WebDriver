package linkValidation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Finding_BrokenLinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links =	driver.findElements(By.cssSelector("div[id='gf-BIG'] a"));
		System.out.println("Total Links Present is  "+links.size());
		SoftAssert sa = new SoftAssert();
		for(WebElement link :links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			sa.assertTrue(respCode<400,"The Link With Text "+link.getText()+" Is Broken  "+respCode);
		}
		sa.assertAll();
		
	}
}
