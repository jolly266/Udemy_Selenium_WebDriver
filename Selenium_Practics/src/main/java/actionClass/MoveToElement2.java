package actionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/hovers");
		
		List<WebElement> figEle = driver.findElements(By.xpath("//div[@class='figure']"));
		for(WebElement eachFig : figEle)
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(eachFig).build().perform();
			
			List<WebElement> captionTextEle = driver.findElements(By.xpath("//div[@class='figcaption']/h5"));
			for(WebElement eachcaptionText:captionTextEle)
			{
				String captionText = eachcaptionText.getText();
				System.out.print(captionText);
			}		
		}
	}
}
