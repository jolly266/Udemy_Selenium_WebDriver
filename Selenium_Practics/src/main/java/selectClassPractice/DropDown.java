package selectClassPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Throwable {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  
		 WebElement CurrencyEle = driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
		 Select dropCurrency = new Select(CurrencyEle);
		// 
		List<WebElement> allOption = dropCurrency.getOptions(); 
		for(WebElement option : allOption)
		{
			System.out.println(option.getText());
		}
		//
		 dropCurrency.selectByVisibleText("USD");
		 System.out.println(dropCurrency.getFirstSelectedOption().getText());
		 
		 driver.findElement(By.cssSelector(".paxinfo")).click(); 
		 System.out.println( driver.findElement(By.cssSelector(".paxinfo")).getText());
		 Thread.sleep(1000);
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
		 driver.close();
	
	}

}
