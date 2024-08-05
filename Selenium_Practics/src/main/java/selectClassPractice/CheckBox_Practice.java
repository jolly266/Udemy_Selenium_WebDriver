package selectClassPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckBox_Practice {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Clicking on Country
		driver.findElement(By.id("autosuggest")).sendKeys("en");
		List<WebElement> suggoption = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement eachoption : suggoption) {

			if (eachoption.getText().equalsIgnoreCase("Denmark")) {
				eachoption.click();
				break;
			}
		}

		// Selecting CheckBox
		Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected());
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).isSelected());

		Assert.assertEquals(driver.findElements(By.cssSelector("[type='checkbox']")).size(), 6);

		// Clicking on From List box
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();

		// Clicking on To List box
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();

		// Selecting Depart Date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

		// return date Validation disabled
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("It's Disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Clicking on Passenger List box
		driver.findElement(By.cssSelector(".paxinfo")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".paxinfo")).getText(), "1 Adult");
		//
		int i = 1;
		while (i < 4) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
		}
		Assert.assertEquals(driver.findElement(By.cssSelector(".paxinfo")).getText(), "4 Adult");

		//
		for (int j = 0; j < 4; j++) {
			driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click();
		}
		Assert.assertEquals(driver.findElement(By.cssSelector(".paxinfo")).getText(), "4 Adult, 4 Child");

		//
		for (int k = 0; k < 4; k++) {
			driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click();
		}
		Assert.assertEquals(driver.findElement(By.cssSelector(".paxinfo")).getText(), "4 Adult, 4 Child, 4 Infant");
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector(".paxinfo")).getText(), "4 Adult, 4 Child, 4 Infant");

		// Clicking on Currency
		WebElement CurrencyEle = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		Select dropCurrency = new Select(CurrencyEle);
		dropCurrency.selectByVisibleText("USD");
		System.out.println(dropCurrency.getFirstSelectedOption().getText());
		
		// Clicking on Search Button
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_btn_FindFlights']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
