package selectClassPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestionDropDown {

	public static void main(String[] args) {


		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 //Clicking on Country
		 driver.findElement(By.id("autosuggest")).sendKeys("en");
		 List<WebElement> suggoption = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		 for(WebElement eachoption : suggoption)
		 {
			 
			 if(eachoption.getText().equalsIgnoreCase("Denmark"))
			 {
				 eachoption.click();
				 break;
			 }
		 }
			 			 
		 //Clicking on From List box
		 driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		 System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).getText());
		 driver.findElement(By.xpath("//a[@value='HYD']")).click();
		 System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXTaction")).getText());
		 
		 //Clicking on To List box
		 System.out.println( driver.findElement(By.xpath("(//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction'])[1]")).getText());
		 driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 System.out.println( driver.findElement(By.xpath("(//span[@id='ctl00_mainContent_ddl_destinationStation1_CTXTaction'])[1]")).getText());
		 
		 //Clicking on Passenger List box
		 driver.findElement(By.cssSelector(".paxinfo")).click(); 
		 System.out.println( driver.findElement(By.cssSelector(".paxinfo")).getText());
		
		 int i=1;
		 while(i<4)
		 {
		 driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		 i++;
		 }
		 System.out.println( driver.findElement(By.cssSelector(".paxinfo")).getText());
		 
		 for(int j=0;j<4;j++)
		 {
			 driver.findElement(By.xpath("//span[@id='hrefIncChd']")).click(); 
		 }
		 System.out.println( driver.findElement(By.cssSelector(".paxinfo")).getText());
		 
		 for(int k=0;k<4;k++)
		 {
			 driver.findElement(By.xpath("//span[@id='hrefIncInf']")).click(); 
		 }
		 System.out.println( driver.findElement(By.cssSelector(".paxinfo")).getText());
		 
		 driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		 
		//Clicking on Currency
		 WebElement CurrencyEle = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		 Select dropCurrency = new Select(CurrencyEle);
		 dropCurrency.selectByVisibleText("USD");
		 System.out.println(dropCurrency.getFirstSelectedOption().getText());
		 driver.close();
		
		

	}

}
