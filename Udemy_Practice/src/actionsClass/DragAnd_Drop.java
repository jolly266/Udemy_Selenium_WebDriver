package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAnd_Drop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement drag = driver.findElement(By.xpath("//div[@id= 'column-a']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id= 'column-b']"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
		
	}

}
