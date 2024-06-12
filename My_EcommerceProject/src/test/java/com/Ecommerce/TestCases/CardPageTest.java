package com.Ecommerce.TestCases;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.PageObject.CartPage;
import com.Ecommerce.PageObject.HomePage;
import com.Ecommerce.PageObject.LoginPage;
import com.Ecommerce.PageObject.PaymentPage;

public class CardPageTest extends BaseClass {
	
	HomePage homepage;
	CartPage cartpage;
	PaymentPage paymentpage;

	@BeforeMethod
	public void launchBrowser() throws IOException {
		launchapp();
	}

	@AfterMethod
	public void closeBrowser() {
		teardown();
	}

	@Test
	public void cardPageTest() throws InterruptedException {
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(conpro.getProperty("username"), conpro.getProperty("password"));
		homepage.addingItemToCart();
		Thread.sleep(2000);
		cartpage = homepage.clickOnCartBtn();
		paymentpage = cartpage.clickOncheckOutBtn();			
	}
}
