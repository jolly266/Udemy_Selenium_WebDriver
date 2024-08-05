package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AdF4I770QpG2VSRejx7E0E5fDNRikeO9VVD84-i9JS_NVz3HflLq34AlQVijUD2sC52G7Y-ptbldcg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1224368155%3A17");
		 driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[3]")).click();
		
		 Actions ac = new Actions(driver);
		 int i=1;
		 while(i<3)
		 {
		 ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		 }
		 Keys enter1 = Keys.ENTER;
		 ac.sendKeys(Keys.ENTER).build().perform();
	}

}
