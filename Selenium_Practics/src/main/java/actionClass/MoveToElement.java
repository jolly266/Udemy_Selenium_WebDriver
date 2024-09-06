package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");

		WebElement helloSigninEle = driver.findElement(By.cssSelector("#nav-link-accountList"));
		WebElement enEle = driver.findElement(By.cssSelector("#icp-nav-flyout"));
		WebElement searchBoxEle = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(enEle).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(helloSigninEle).build().perform();
		
		Keys enter = Keys.ENTER;
		ac.moveToElement(searchBoxEle).click().keyDown(Keys.SHIFT).sendKeys("Tshirt").doubleClick().sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
