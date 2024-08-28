package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement elementA = driver.findElement(By.cssSelector("#column-a"));
		WebElement elementB = driver.findElement(By.cssSelector("#column-b"));
		
		Actions ac = new Actions(driver);
		System.out.println(driver.findElement(By.cssSelector("#column-a header")).getText());
		ac.dragAndDrop(elementB, elementA).build().perform();
		System.out.println(driver.findElement(By.cssSelector("#column-a header")).getText());
		
		ac.contextClick(elementA).build().perform();
		
				
	}

}
