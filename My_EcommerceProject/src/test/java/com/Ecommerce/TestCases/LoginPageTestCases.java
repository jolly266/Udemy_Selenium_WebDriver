package com.Ecommerce.TestCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.PageObject.HomePage;
import com.Ecommerce.PageObject.LoginPage;


public class LoginPageTestCases extends BaseClass {

	HomePage homepage;
	
	
	@BeforeMethod
	public void launchbrowser() throws IOException {

		launchapp();
	}

	@AfterMethod
	public void closebrowser() {
		teardown();
	}


	@Test(dataProvider = "credentials",dataProviderClass =com.Ecommerce.DataProvider.DataProviders.class )
	public void verifyLoginTest(String uname, String pswd) throws InterruptedException {
		LoginPage loginPage= new LoginPage();
		//homepage=loginPage.login(conpro.getProperty("username"),conpro.getProperty("password"));	
		homepage=loginPage.login(uname, pswd);
		Thread.sleep(2000);
		String actualtitle =homepage.getHomePageTitle();
		String expectedTitle = "Let's Shop";
		Assert.assertEquals(actualtitle, expectedTitle);
		System.out.println(actualtitle);

	}

}
