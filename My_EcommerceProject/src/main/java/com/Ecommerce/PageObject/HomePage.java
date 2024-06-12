package com.Ecommerce.PageObject;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Ecommerce.BaseClass.BaseClass;
import com.Ecommerce.actionDriver.ActionClass;

import io.reactivex.rxjava3.functions.Action;

public class HomePage extends BaseClass {

	@FindBy(xpath = "(//button[@class='btn btn-custom'])[2]")
	WebElement orderBtn;

	@FindBy(xpath = "(//button[@class='btn btn-custom'])[3]")
	WebElement cartBtn;

	@FindBy(xpath = "(//div[@class='form-group ng-star-inserted'])[11]/input")
	WebElement fashoincheckbox;

	@FindBy(xpath = "(//input[@name='search'])[2]")
	WebElement searchBox;

	@FindBy(css = ".btn.w-10.rounded")
	List<WebElement> addToCartBtn;

	@FindBy(xpath = "//div[@class='card-body']/h5/b")
	List<WebElement> itemstext;

	@FindBy(css = "(//div[@class='card'])[1]/img")
	WebElement zaraCoat;

	@FindBy(xpath = "(//div[@class='card'])[2]/img")
	WebElement addidasShoe;
	
	@FindBy(xpath = "(//div[@class='card'])[3]/img")
	WebElement iPhone;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public OrdersPage clickOnOrderBtn() {
		ActionClass.clickOnElement(driver, orderBtn);
		return new OrdersPage();
	}

	public CartPage clickOnCartBtn() {
		ActionClass.implicitwait(driver, 10);
		ActionClass.clickOnElement(driver, cartBtn);
		return new CartPage();
	}

	public void clickOnFashionCheckBox() {
		ActionClass.clickOnElement(driver, fashoincheckbox);
	}

	public String getHomePageTitle() {
		String homepageTitle = driver.getTitle();
		return homepageTitle;
	}

	public boolean validateZaraCoatpresent() {

		return ActionClass.isDisplayed(driver, zaraCoat);
	}

	public boolean validateAddidasShoe() {
		return ActionClass.isDisplayed(driver, addidasShoe);
	}
	
	public boolean validateIphone() {
		return ActionClass.isDisplayed(driver, iPhone);
	}

	public void searchProduct(String productName) {
		String keyAction = Keys.chord(Keys.ENTER);
		ActionClass.sendkeysToTextBox(searchBox, productName);
		ActionClass.sendkeysToTextBox(searchBox, keyAction);
	}

	public void addingItemToCart() {
		ActionClass.implicitwait(driver, 10);
		String[] itemsneeded = { "ZARA COAT 3"};
		for (int i = 0; i < itemstext.size(); i++) {
			String name = itemstext.get(i).getText();
			List<String> itemsNeededList = Arrays.asList(itemsneeded);
			if (itemsNeededList.contains(name)) {
				addToCartBtn.get(i).click();
			}
		}
	}
}
