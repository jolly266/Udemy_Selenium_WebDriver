package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NestedFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		System.out.println("Iframe Present in this Page = " + driver.findElements(By.tagName("frame")).size());

		WebElement firstFrame = driver.findElement(By.cssSelector("frame[name='frame-top']"));
		driver.switchTo().frame(firstFrame);

		WebElement firstFrameleft = driver.findElement(By.cssSelector("frame[name='frame-left']"));
		WebElement firstFramemiddle = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		WebElement firstFrameright = driver.findElement(By.cssSelector("frame[name='frame-right']"));

		driver.switchTo().defaultContent();
		WebElement secoundFrame = driver.findElement(By.cssSelector("frame[name='frame-bottom']"));

		driver.switchTo().frame(firstFrame);
		driver.switchTo().frame(firstFrameleft);

		driver.switchTo().parentFrame();
		driver.switchTo().frame(firstFramemiddle);
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());

	}

}
