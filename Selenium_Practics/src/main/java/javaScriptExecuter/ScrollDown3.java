package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown3 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.amazon.in/'");
		
		
		//Scroll Top to Bottom Vertically
		js.executeScript("window.scrollTo(document.body.scrollHeight,500)");
		
		Thread.sleep(2000);
		//Scroll to Certain Pixel
		js.executeScript("window.scrollBy(0,900)");

	}

}
