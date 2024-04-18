package actionsClass;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_Loop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		System.out.println(driver.findElements(By.tagName("a")).size());

		WebElement footer = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		WebElement discount = footer.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(discount.findElements(By.tagName("a")).size());

		for (int i = 1; i < discount.findElements(By.tagName("a")).size(); i++)

		{
			String clicklinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			discount.findElements(By.tagName("a")).get(i).sendKeys(clicklinktab);
		}
		
		ArrayList<String> winid = new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=0;i<winid.size();i++)
		{
		driver.switchTo().window(winid.get(i));
		System.out.println(driver.getTitle()); 
		}
		
	
	}
}
