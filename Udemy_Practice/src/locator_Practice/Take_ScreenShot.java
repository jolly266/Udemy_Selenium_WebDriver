package locator_Practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Take_ScreenShot {

	public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	      
	        Dimension[] resolutions = {
	                new Dimension(1024, 768),
	                new Dimension(1280, 800),
	                new Dimension(1920, 1080)
	        }; 
	        String projectDir = System.getProperty("Udemy\\Udemy_String_Practice");
	        
	        for (Dimension resolution : resolutions) {
	            try {
	                driver.manage().window().setSize(resolution);
	                driver.get("https://www.google.com");
	                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	                
	                // Generate a unique filename based on timestamp
	                String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	                String fileName = "screenshot_" + resolution.getWidth() + "x" + resolution.getHeight() + "_" + timeStamp + ".png";
	                String filePath = projectDir + File.separator + fileName;
	                FileUtils.copyFile(screenshot, new File(filePath));
	                System.out.println("Screenshot saved: " + fileName);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	       
	        driver.quit();
	    }
	}