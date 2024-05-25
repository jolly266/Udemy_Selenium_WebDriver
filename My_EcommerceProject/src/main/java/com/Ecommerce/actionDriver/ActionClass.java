package com.Ecommerce.actionDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.Ecommerce.BaseClass.BaseClass;

public class ActionClass extends BaseClass {

	public static void clickOnElement( WebDriver driver,WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();
	}

	public static void implicitwait(WebDriver driver,long timeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}

	public static File takescreenshot(WebDriver driver) throws IOException {

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + "//ScreenShot//abc.png"));
		return screenshot;
	}
	
	public static void sendkeysToTextBox(WebElement ele, String text) {
		
		ele.sendKeys(text);
	}
	
	public static  String getText(WebDriver driver,WebElement ele) {
		return ele.getText();
		
	}
	
	
	public static boolean isDisplayed(WebDriver driver, WebElement ele) {
		
		return ele.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
}
