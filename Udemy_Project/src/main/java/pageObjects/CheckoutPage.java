package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import abstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent{
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[placeholder='Select Country']")
	WebElement countryTextBox;
	
	@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement selectIndia;
	
	@FindBy(css = ".action__submit")
	WebElement submitbtn;
	
	By result = By.cssSelector(".ta-results");
	
	public void selectCountryName(String countryName) {
		Actions a = new Actions(driver);
		a.sendKeys(countryTextBox, countryName).build().perform();
		
		waitForElementToAppear(result);
		selectIndia.click();	
	}
	
	public ConfirmationPage submitOrder() {
		submitbtn.click();
		return new ConfirmationPage(driver);

		
	}
}
