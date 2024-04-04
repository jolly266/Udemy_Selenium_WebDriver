package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class End_To_End {

	public static void main(String[] args) {
		
		//Invoking Broser
		WebDriver driver = new ChromeDriver();
		//Launching URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Clicking on Selecting Source point box
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		// Selecting Source Point
		driver.findElement(By.xpath("//a[@text='Jaipur (JAI)']")).click();
		// Selecting Destination Point
		driver.findElement(By.xpath("(//a[@text='Hyderabad (HYD)'])[2]")).click();
		//Selecting Current Date
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
		// clicking on passengers box 
		driver.findElement(By.id("divpaxinfo")).click();
		
		for(int i = 1;i<4;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();	
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
           WebElement list= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
           Select option = new Select(list);
           option.selectByVisibleText("AED");
           
           driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		

	}

}
