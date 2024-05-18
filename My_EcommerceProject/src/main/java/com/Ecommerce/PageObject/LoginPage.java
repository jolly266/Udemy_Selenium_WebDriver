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

	public RegisterPage clickOnSignInBtn() {
		ActionClass.click(registerBtn);
		return new RegisterPage();

	}

	public ForgotPassPage clickOnForgotPassLink() {
		
		ActionClass.click(forgotPassLink);
		return new ForgotPassPage();
	}
	
	public HomePage login(String username,String password) {
	
		ActionClass.sendkeys(emailTextBox, username);
		ActionClass.sendkeys(passTextBox, password);
		ActionClass.click(logInBtn);
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
