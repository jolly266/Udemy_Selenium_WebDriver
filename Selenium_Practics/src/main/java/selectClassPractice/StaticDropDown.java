package selectClassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 WebElement CurrencyEle = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		 Select dropCurrency = new Select(CurrencyEle);
		 
		 dropCurrency.selectByVisibleText("INR");
		 System.out.println(dropCurrency.getFirstSelectedOption().getText());
		 
		 dropCurrency.selectByIndex(2);
		 System.out.println(dropCurrency.getFirstSelectedOption().getText());
		 
		 dropCurrency.selectByValue("USD");
		 System.out.println(dropCurrency.getFirstSelectedOption().getText());
		 driver.close(); 
		 
		
	}

}
