package abstractComponents;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.CartPage;
import pageObjects.OrderPage;

public class AbstractComponent {

	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (css = "[routerlink*='cart']")
	WebElement cartHeaderBtn;
	
	@FindBy (css = "[routerlink*='myorders']")
	WebElement orderHeaderBtn;
	
	public void waitForElementToAppear(By findby) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}
	
	public void waitForElementToDisappear(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public void waitForWebElementToAppear(WebElement findby) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findby));
	}
		
	public CartPage goToCartPage() throws Throwable {
		Thread.sleep(2000);
		cartHeaderBtn.click();
		return new CartPage(driver);
		
	}
	
	public OrderPage goToOrderPage() throws Throwable {
		Thread.sleep(2000);
		orderHeaderBtn.click();
		return new OrderPage(driver);
		
	}
}
