package actionsClass;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Move_To_Element {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement moveToAccount = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		WebElement searchbox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		
		Actions ac = new Actions(driver);
		//Mouse over to Account button
		ac.moveToElement(moveToAccount).perform();
		
		//Enter chair in search box in capital letter.
		ac.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("chair").build().perform();
		
		
		
		
		
	}

}
