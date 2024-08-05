package actionClass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RobotClass {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");

		WebElement gmailEle = driver.findElement(By.cssSelector("[class='gb_y']"));
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).build().perform();
		ac.moveToElement(gmailEle).contextClick().build().perform();

		Robot r = new Robot();
		int i = 1;
		while (i < 4)
			
		{
			r.keyPress(KeyEvent.VK_DOWN);
			i++;
		}
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Set<String> winId = driver.getWindowHandles();
		System.out.println(winId);
		Iterator<String> it = winId.iterator();
		String parentID =it.next();
		String childID =it.next();
		driver.switchTo().window(childID);
		Thread.sleep(2000);
		driver.switchTo().window(parentID);
		Thread.sleep(2000);
		
	}

}
