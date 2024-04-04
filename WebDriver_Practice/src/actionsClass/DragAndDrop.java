package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		
		Actions ac = new Actions(driver);
		WebElement drag = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement drop = driver.findElement(By.cssSelector("div[id='droppable']"));
		ac.dragAndDrop(drag, drop).perform();
		
		//Switch to Window
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("About")).click();
	}

}
