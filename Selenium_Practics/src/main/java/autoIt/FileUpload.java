package autoIt;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.findElement(By.cssSelector(".l3tlg0-0.ggoliT")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E:/Udemy/Selenium_Practics/Autoit.exe");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='r5zwp6-1 fcIzAX']")));
		driver.findElement(By.cssSelector("div[class='r5zwp6-1 fcIzAX']")).click();
		
		
	}

}
