package relativeLocators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://flights.qedgetech.com/");
		driver.findElement(By.partialLinkText("Regi")).click();
		
		WebElement nameTextBoxEle = driver.findElement(By.name("name"));
		File file = nameTextBoxEle.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("E:/Udemy/Selenium_Practics/ScreenShots/Before.png"));
		nameTextBoxEle.sendKeys("Shivam");
		File file1 = nameTextBoxEle.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file1, new File("E:/Udemy/Selenium_Practics/ScreenShots/After.png"));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("E:/Udemy/Selenium_Practics/ScreenShots/Page.png"));

	}

}
