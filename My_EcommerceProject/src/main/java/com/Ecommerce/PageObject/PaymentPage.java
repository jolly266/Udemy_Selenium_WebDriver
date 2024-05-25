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
	
	@FindBy(xpath = "(//button[@class='ta-item list-group-item ng-star-inserted'])[2]")
	WebElement country;
	
	@FindBy(css = ".btnn.action__submit.ng-star-inserted")
	WebElement placeOrderBtn;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterCvvNumber(String cvvText) {
		
		ActionClass.sendkeysToTextBox(cvvBox, cvvText);
		
	}
	
	public void enternameOnCardBox(String cardText) {
		
		ActionClass.sendkeysToTextBox(nameOnCardBox, cardText);	
	}
	
	public void selectcountry(String countryText) {
		ActionClass.sendkeysToTextBox(country, countryText);
		ActionClass.clickOnElement(driver, country);
	}
	
	public OrdersPage clickOnPlaceOrder() {
		ActionClass.clickOnElement(driver, placeOrderBtn);
		return new OrdersPage();
	}
}
