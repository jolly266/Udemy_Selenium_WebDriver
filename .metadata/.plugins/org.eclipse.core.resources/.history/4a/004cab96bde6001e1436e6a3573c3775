package actionsClass;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window_Handles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		ArrayList<String> windowsid = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowsid);

		driver.switchTo().window(windowsid.get(1));
		String text = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String emailtext = text.split("at")[1].trim().split(" ")[0];
		System.out.println(emailtext);
		driver.switchTo().window(windowsid.get(0));
		driver.findElement(By.cssSelector(".form-control")).sendKeys(emailtext);

	}

}
