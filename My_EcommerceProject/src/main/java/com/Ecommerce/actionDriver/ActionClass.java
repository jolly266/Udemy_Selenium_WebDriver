package com.Ecommerce.actionDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.Ecommerce.BaseClass.BaseClass;

public class ActionClass extends BaseClass {

	public static void click(WebElement ele) {
		ele.click();
	}

	public static void implicitwait(WebDriver driver, long timeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}

	public static void waitUntillElementVisible(long timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(null));
	}

	public static File takescreenshot() throws IOException {

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "//ScreenShot//abc.png"));
		return screenshot;
	}
	
	public static void sendkeys(WebElement ele, String text) {
		
		ele.clear();
		ele.sendKeys(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
