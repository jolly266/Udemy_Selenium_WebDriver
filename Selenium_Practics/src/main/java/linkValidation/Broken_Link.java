package linkValidation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Broken_Link {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement link= driver.findElement(By.cssSelector("a[href*='broken']"));
		String url = link.getAttribute("href");	
		System.out.println(url);
		
		HttpURLConnection conne = (HttpURLConnection) new URL(url).openConnection();
		conne.setRequestMethod("HEAD");
		conne.connect();
		int ststusCode = conne.getResponseCode();
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(ststusCode<400,"Name of the Broken Link is "+link.getText()+ " Status is "+ststusCode);
		sa.assertAll();
	}
}
