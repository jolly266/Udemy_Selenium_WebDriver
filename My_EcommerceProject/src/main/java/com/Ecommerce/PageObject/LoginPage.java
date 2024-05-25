package com.Ecommerce.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.actionDriver.ActionClass;

public class LoginPage extends BaseClass {

	@FindBy(css = ".btn1")
	private WebElement registerBtn;

	@FindBy(css = "#userEmail")
	private WebElement emailTextBox;

	@FindBy(css = "#userPassword")
	private WebElement passTextBox;

	@FindBy(css = "#login")
	private WebElement logInBtn;

	@FindBy(css = ".forgot-password-link")
	private WebElement forgotPassLink;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public RegisterPage clickOnRegisterInBtn() {
		ActionClass.clickOnElement(driver, registerBtn);
		return new RegisterPage();

	}

	public ForgotPassPage clickOnForgotPassLink() {

		ActionClass.clickOnElement(driver, forgotPassLink);
		return new ForgotPassPage();
	}

	public String getLoginPageTitle() {
		String loginPageTitle = driver.getTitle();
		return loginPageTitle;

	}

	public HomePage login(String user, String pass) {

		ActionClass.sendkeysToTextBox(emailTextBox, user);
		ActionClass.sendkeysToTextBox(passTextBox, pass);
		ActionClass.clickOnElement(driver, logInBtn);
		return new HomePage();
		
		
	}

}
