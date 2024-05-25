package com.Ecommerce.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.actionDriver.ActionClass;

public class ConformationPage extends BaseClass{

	@FindBy(css = ".hero-primary")
	WebElement confirmMsgText;
	
	public ConformationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public  String validateOrder() {
		String confirmMsg =ActionClass.getText(null, confirmMsgText);
		return confirmMsg;
		
		
	}
}
