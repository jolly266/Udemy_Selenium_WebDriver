package javaScriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Title_ {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Launch URL
		js.executeScript("window.location='https://www.tatacliq.com/'");
		
		//Get PageTitle
		String strTitle = js.executeScript("return document.title").toString();
		System.out.println(strTitle);
		
		//Get URL
		String strURL = js.executeScript("return document.URL").toString();
		System.out.println(strURL);
		System.out.println(strURL.length());
		
		//Print Domain
		String strDomain = js.executeScript("return document.domain").toString();
		System.out.println(strURL);
		
	}

}
