package standAlone_Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.ConfirmationPage;
import pageObjects.OrderPage;
import pageObjects.ProductCatalog;
import testComponents.BaseClass;

public class SubmitOrderTest extends BaseClass {

	@Test(dataProvider = "getData",groups = "Purchase")
	public void submitOrder(HashMap<String, String> input) throws Throwable {
	

		ProductCatalog productCatalog = landingPage.loginApplication(input.get("email"), input.get("Password"));

		List<WebElement> products = productCatalog.getProductList();
		productCatalog.addProductToCart(input.get("productName"));
		CartPage cartPage = productCatalog.goToCartPage();

		Boolean match = cartPage.verifyProductDisplay(input.get("productName"));
		Assert.assertTrue(match);

		CheckoutPage checkoutPage = cartPage.goToCheakoutPage();
		checkoutPage.selectCountryName("India");
		ConfirmationPage confirmationPage = checkoutPage.submitOrder();

		String confirmMessage = confirmationPage.getConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}

	@Test(dependsOnMethods = "submitOrder")
	public void orderHistoryTest() throws Throwable {
		String productname = "Zara Coat 3";

		ProductCatalog productCatalog = landingPage.loginApplication("jaykrishnagupta@gmail.com", "Jaykrishna@1");
		OrderPage orderPage = productCatalog.goToOrderPage();
		Assert.assertTrue(orderPage.verifyOrderDisplayed(productname));

	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException {
	
		//3rd Way through Json File
		String jsonFilePath = System.getProperty("user.dir") + "/src/test/java/inputData/PurchaseOrder.json";
		List<HashMap<String, String>> data=  getJsonDataToMap(jsonFilePath);
		return new Object [][] {{data.get(0)}, {data.get(1)}};
		
		
		/* 2nd Way 
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", "jaykrishnagupta@gmail.com");
		map.put("Password", "Jaykrishna@1");
		map.put("productName", "ZARA COAT 3");
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("email", "jaykrishnagupt@gmail.com");
		map1.put("Password", "Jaykrishna#1");
		map1.put("productName", "ADIDAS ORIGINAL");
		return new Object[][] { {map},{map1} };
		*/
		
		// 1st Method
		//return new Object[][] { {"jaykrishnagupta@gmail.com","Jaykrishna@1","ZARA COAT 3"},{"jaykrishnagupt@gmail.com","Jaykrishna#1","ADIDAS ORIGINAL"} };	
	
}
}
