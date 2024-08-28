package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement boxEle = driver.findElement(By.cssSelector("[class='inputs ui-autocomplete-input']"));
		File src = boxEle.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:/Udemy/Selenium_Practics/ScreenShots/boxEleBefore.png"));
		
		boxEle.sendKeys("Ind");
		File src1 = boxEle.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("E:/Udemy/Selenium_Practics/ScreenShots/boxEleAfter.png"));
		
		System.out.println(boxEle.getRect().getDimension().getHeight());
		System.out.println(boxEle.getRect().getDimension().getWidth());
		
		
	}

}
