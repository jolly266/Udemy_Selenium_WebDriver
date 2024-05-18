package com.Ecommerce.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Ecommerce.actionDriver.ActionClass;

public class HomePage {

	
	@FindBy(xpath = "(//button[@class=\"btn btn-custom\"])[2]")
	WebElement orderBtn;
	
	@FindBy(xpath = "(//button[@class=\"btn btn-custom\"])[3]")
	WebElement cartBtn;
	
	@FindBy(xpath = "(//button[@class=\"btn btn-custom\"])[4]")
	WebElement signOutBtn;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[11]")
	WebElement fashoincheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[12]")
	WebElement electronicscheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[13]")
	WebElement householdcheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[14]")
	WebElement tshirtscheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[15]")
	WebElement shirtscheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[16]")
	WebElement shoescheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[17]")
	WebElement mobilescheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[18]")
	WebElement laptopscheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[19]")
	WebElement mencheckbox;
	
	@FindBy(xpath = "(//div[@class=\"form-group ng-star-inserted\"]/input)[20]")
	WebElement womencheckbox;
	
	public OrdersPage clickOnOrderBtn() {
		ActionClass.click(orderBtn);
		return new OrdersPage();
	}
	
	public CartPage clickOnCartBtn() {
		ActionClass.click(cartBtn);
		return new CartPage();
	}
	
	public LoginPage clickOnSignOutBtn() {
		ActionClass.click(signOutBtn);
		return new LoginPage();
	}
	
	public void checkFashoinCheckbox() {
		ActionClass.click(electronicscheckbox);
	}
}
