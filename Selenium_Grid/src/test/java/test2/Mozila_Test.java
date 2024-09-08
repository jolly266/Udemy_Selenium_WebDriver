package test2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Mozila_Test {

	@Test
	public void mozilaTest() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.106:4444"), cap); 
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Gupta");
		System.out.println(driver.getTitle());	
	}
	
}
