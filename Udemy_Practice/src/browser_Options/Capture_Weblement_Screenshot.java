package browser_Options;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Capture_Weblement_Screenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nametextbox = driver.findElement(By.cssSelector("[name='name']"));
		nametextbox.sendKeys("Jay Krishna Gupta");
		File screenshot = nametextbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("E:/Screenshot/Textbox.jpg"));

	}
}
