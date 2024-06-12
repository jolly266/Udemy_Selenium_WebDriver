package com.Ecommerce.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.PageObject.CartPage;
import com.Ecommerce.PageObject.ConformationPage;
import com.Ecommerce.PageObject.HomePage;
import com.Ecommerce.PageObject.LoginPage;
import com.Ecommerce.PageObject.PaymentPage;

public class PaymentPageTest extends BaseClass {

	HomePage homepage;
	CartPage cartpage;
	PaymentPage paymentpage;
	ConformationPage conformationpage;

	@BeforeMethod
	public void launchBrowser() throws Throwable {
		launchapp();
	}

	@AfterMethod
	public void closeBrowser() {
		teardown();
	}

	@Test
	public void paymentPageTest() throws Throwable {
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(conpro.getProperty("username"), conpro.getProperty("password"));
		homepage.addingItemToCart();
		Thread.sleep(2000);
		cartpage = homepage.clickOnCartBtn();
		paymentpage = cartpage.clickOncheckOutBtn();
		paymentpage.enterCvvNumber(conpro.getProperty("CVV"));
		paymentpage.enternameOnCardBox(conpro.getProperty("CardHolderName"));
		paymentpage.selectcountry(conpro.getProperty("Country"));
		conformationpage= paymentpage.clickOnPlaceOrder();

	}

}
