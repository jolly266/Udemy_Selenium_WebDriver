package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Static_Dropdowns {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement list = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(list);

		// Select by visible text
		dropdown.selectByVisibleText("USD");
		// Capturing selected dropdown in console
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// Select by index
		dropdown.selectByValue("INR");
		// Capturing selected dropdown in console
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// select by index
		dropdown.selectByIndex(2);
		// Capturing selected dropdown in console
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.quit();

	}

}
