package com.Ecommerce.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.actionDriver.ActionClass;

public class PaymentPage extends BaseClass {

	@FindBy(xpath = "(//input[@class='input txt'])[1]")
	WebElement cvvBox;
	
	@FindBy(xpath = "(//input[@class='input txt'])[2]")
	WebElement nameOnCardBox;
	
	@FindBy(xpath = "//input[@placeholder='Select Country']")
	WebElement country;
	
	@FindBy (xpath = "(//button[@class='ta-item list-group-item ng-star-inserted'])[2]")
	WebElement ind;
	
	@FindBy(css = ".btnn.action__submit.ng-star-inserted")
	WebElement placeOrderBtn;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterCvvNumber(String cvvText) {
		
		ActionClass.implicitwait(driver, 10);
		ActionClass.sendkeysToTextBox(cvvBox, cvvText);
		
	}
	
	public void enternameOnCardBox(String cardText) {
		
		ActionClass.implicitwait(driver, 10);
		ActionClass.sendkeysToTextBox(nameOnCardBox, cardText);	
	}
	
	public void selectcountry(String countryText) {
		
		ActionClass.implicitwait(driver, 10);
		ActionClass.sendkeysToTextBox(country, countryText);
		ActionClass.clickOnElement(driver, ind);
	}
	
	public ConformationPage clickOnPlaceOrder() {
		
		ActionClass.implicitwait(driver, 10);
		ActionClass.clickOnElement(driver, placeOrderBtn);
		return new ConformationPage();
	}
}
