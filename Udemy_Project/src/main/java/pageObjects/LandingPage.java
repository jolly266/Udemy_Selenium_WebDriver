package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponent;

public class LandingPage  extends AbstractComponent {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "#userEmail")
	WebElement userNameBox;
	
	@FindBy(css = "#userPassword")
	WebElement passwordBox;
	
	@FindBy(css = "#login")
	WebElement submitBtn;
	
	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMessage;
	
	
	public ProductCatalog loginApplication(String username, String Password) {
		userNameBox.sendKeys(username);
		passwordBox.sendKeys(Password);
		submitBtn.click();	
		return new ProductCatalog(driver);
		
	}
	
	public void goTo(String url) {
		driver.get(url);
	}
	
	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}
}
