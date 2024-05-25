package com.Ecommerce.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.actionDriver.ActionClass;

public class CartPage extends BaseClass {

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	WebElement continewShopingBtn;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[5]")
	WebElement checkOutBtn;

	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOncheckOutBtn() {
		ActionClass.clickOnElement(driver, checkOutBtn);
	}
}
