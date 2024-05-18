package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	private WebDriver driver;

	// Define Repository for Login
	@FindBy(css = "#txtUsername")
	private WebElement username;

	@FindBy(css = "#txtPassword")
	private  WebElement password;

	@FindBy(css = ".button")
	private WebElement loginbutton;

	// Constructor to initialize driver and instance elements using pageFactory
	public Login(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Sending User name
	public void enterusername(String user) {
		username.sendKeys(user);
	}

	// Sending password name
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}

	// Sending User name
	public void clickLoginButton() {
		loginbutton.click();
	}

}
