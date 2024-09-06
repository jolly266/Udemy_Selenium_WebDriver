package PageObjectModel_Practics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Object_Model {
	
	static WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Draggable']")
	WebElement drag;
	
	public  Page_Object_Model(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void initilizeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
	}
	
	public void click() {
		drag.click();
	}
	
	public static void main(String[] args) {
		
		
		Page_Object_Model po1 = new Page_Object_Model(driver);
		po1.initilizeBrowser();
		po1 = new Page_Object_Model(driver);
		po1.click();
		
		
		
	}

}
