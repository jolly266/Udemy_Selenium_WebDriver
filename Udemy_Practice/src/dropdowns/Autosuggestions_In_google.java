package dropdowns;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions_In_google {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Youvraj Singh");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("(//ul[@class= 'G43f7e'])[1]/li"));

		/*for (int i = 0; i < options.size(); i++) {

			WebElement option = options.get(i);
			if(option.getText().contains("Wife"))
			{
				option.click();
				break;
			}	
			
		}*/
		
		 for(WebElement option:options) 
		 { if(option.getText().contains("sister"))
		 {
		  option.click();
		 
		 break;
		 }
		 

	}
	}
}
