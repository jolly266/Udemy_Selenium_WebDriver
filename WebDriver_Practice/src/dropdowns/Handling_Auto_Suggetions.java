package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Auto_Suggetions {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> sugglist = driver.findElements(By.xpath("//Li[@class='ui-menu-item']/a"));
		
		for(WebElement option:sugglist)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();	
				break;			
			}
		}	
		
		
		/*WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option :options)
		{
		if(option.getText().equalsIgnoreCase("India"))
		{
		option.click();
		break;
		}

		}*/
	}
	

}
