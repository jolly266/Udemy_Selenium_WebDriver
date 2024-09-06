package actionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pract_MoveToEmelemet {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/hovers");
		
	/*	
		List<WebElement> imgeleList = driver.findElements(By.cssSelector("div[class='figure'] img"));
		for(WebElement imgele:imgeleList) {
			Actions ac = new Actions(driver);
			ac.moveToElement(imgele).build().perform();
			
			List<WebElement> imgnameList = driver.findElements(By.cssSelector("div[class='figcaption'] h5"));
			
			for(WebElement imgname:imgnameList)
			{
				System.out.println(imgname.getText()	);	
			}
		}
*/
		
		List<WebElement> imgeleList = driver.findElements(By.cssSelector("div[class='figure'] img"));
		for(int i=0;i<imgeleList.size();i++)
		{
			Actions ac = new Actions(driver);
			ac.moveToElement(imgeleList.get(i)).build().perform();
			
			List<WebElement> imgnameList = driver.findElements(By.cssSelector("div[class='figcaption'] h5"));
			for(int j=0;j<imgnameList.size();j++)
			{
				System.out.println(imgnameList.get(j).getText());	
			}
		}
	}

}
