package standAlone_Test;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import pageObjects.CartPage;
import pageObjects.ProductCatalog;
import testComponents.BaseClass;

public class ErrorValidationTest extends BaseClass {

	@Test(groups = "ErrorHandlying",retryAnalyzer = testComponents.Retry.class)
	public void loginErrorValidation() throws Throwable {
		
		
		landingPage.loginApplication("jaykrishnagupta@gmail.com", "Jaykrishna@");
		String errorMSg = landingPage.getErrorMessage();
		Assert.assertEquals("Incorrect email or password", errorMSg);	
	}
	
	@Test
	public void productOrderErrorValidation() throws Throwable {

		String productname = "Zara Coat 3";
		ProductCatalog productCatalog = landingPage.loginApplication("jaykrishnagupt@gmail.com", "Jaykrishna#1");

		List<WebElement> products = productCatalog.getProductList();
		productCatalog.addProductToCart(productname);
		CartPage cartPage = productCatalog.goToCartPage();

		Boolean match = cartPage.verifyProductDisplay(productname);
		Assert.assertTrue(match);
	}
}
