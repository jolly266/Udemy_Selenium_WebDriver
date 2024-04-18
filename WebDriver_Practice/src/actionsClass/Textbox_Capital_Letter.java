package actionsClass;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Textbox_Capital_Letter {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
	
		WebElement footer = driver.findElement(By.cssSelector(".footer_top_agile_w3ls.gffoot.footer_style"));
		WebElement discount = footer.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		
		for(int i=1;i<discount.findElements(By.tagName("a")).size();i++)
		{
		String clickontab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		discount.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
		}
		
		ArrayList<String> winid = new ArrayList<String>(driver.getWindowHandles());
		for(int j=0;j<winid.size();j++)
		{
			driver.switchTo().window(winid.get(j));
			System.out.println(driver.getTitle());
		}		
		driver.navigate().to("https://www.amazon.in/");
		WebElement searchbox= driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		Actions ac = new Actions(driver);
		ac.moveToElement(searchbox);
		ac.click().keyDown(Keys.SHIFT).sendKeys("men t-shirt").build().perform();
		String enter = Keys.chord(Keys.ENTER);
		Thread.sleep(2000);
		ac.keyDown(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		ac.keyDown(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		ac.sendKeys(enter).build().perform();
		
		
		
	}
}
