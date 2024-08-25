package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/draggable/");

		System.out.println("Iframe Present in this Page = " + driver.findElements(By.tagName("iframe")).size());

		WebElement frameeEle = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(frameeEle);
		
		WebElement draggableEle = driver.findElement(By.cssSelector("div[id='draggable']"));

	
		System.out.println("Before drag attribute Value  ="
				+ driver.findElement(By.cssSelector("div[id='draggable']")).getAttribute("style"));

		Actions ac = new Actions(driver);
		ac.dragAndDropBy(draggableEle, 150, 100).build().perform();
		
		System.out.println("After drag attribute Value  ="
				+ driver.findElement(By.cssSelector("div[id='draggable']")).getAttribute("style"));

	}
}
