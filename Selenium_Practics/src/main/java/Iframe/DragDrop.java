package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		WebElement iframe = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement dragEle = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement dropEle = driver.findElement(By.cssSelector("div[id='droppable']"));
		
		System.out.println(driver.findElement(By.cssSelector("div[id='droppable'] p")).getText());
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(dragEle, dropEle).build().perform();
		
		System.out.println(driver.findElement(By.cssSelector("div[id='droppable'] p")).getText());
		

	}

}
