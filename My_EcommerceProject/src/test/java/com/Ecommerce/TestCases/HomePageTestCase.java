package com.Ecommerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.PageObject.CartPage;
import com.Ecommerce.PageObject.HomePage;
import com.Ecommerce.PageObject.LoginPage;
import com.Ecommerce.actionDriver.ActionClass;

public class HomePageTestCase extends BaseClass {

	HomePage homepage;
	CartPage cartpage;
	
	@BeforeMethod
	public void launchbrowser() throws IOException {
		launchapp();
	}

	@AfterMethod
	public void closebrowser() {
		teardown();
	}
	
	@Test
	public void verifyZaraCoatPresent() throws InterruptedException {
		
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(conpro.getProperty("username"), conpro.getProperty("password"));
		ActionClass.implicitwait(driver, 10);
		boolean result=	homepage.validateZaraCoatpresent();
		Assert.assertTrue(result);
	}
	

	@Test
	public void verifyIphonePresent() throws InterruptedException {
		
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(conpro.getProperty("username"), conpro.getProperty("password"));
		ActionClass.implicitwait(driver, 10);
		homepage.searchProduct(conpro.getProperty("prodSearch"));;
		boolean result=	homepage.validateIphone();
		System.out.println(result);
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyAddidasShoePresent() throws InterruptedException{
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(conpro.getProperty("username"), conpro.getProperty("password"));
		ActionClass.implicitwait(driver, 10);
		homepage.clickOnFashionCheckBox();
		boolean result= homepage.validateAddidasShoe();	
		System.out.println(result);
		Thread.sleep(1000);
		Assert.assertFalse(result);
		
		
	}	
	
	@Test
	public void addZaraCoatInCart() throws Throwable {
		LoginPage loginpage = new LoginPage();
		homepage = loginpage.login(conpro.getProperty("username"), conpro.getProperty("password"));
		homepage.addingItemToCart();
		Thread.sleep(2000);
		cartpage= homepage.clickOnCartBtn();
	}
	
}
