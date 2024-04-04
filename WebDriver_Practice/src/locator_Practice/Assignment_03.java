package locator_Practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_03 {

	public void login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement typelist = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(typelist);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class ='card-body']/h4/a")));
		
		String[] requireditem = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		List<WebElement> products = driver.findElements(By.xpath("//div[@class ='card-body']/h4/a"));
		
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			System.out.println(name);
			List<String> itemneeded = Arrays.asList(requireditem);

			if (itemneeded.contains(name)) {
				
				
				driver.findElements(By.xpath("//button[@class ='btn btn-info']")).get(i).click();
			}

		}

			driver.findElement(By.xpath("//a[@class ='nav-link btn btn-primary']")).click();
			
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@class='btn btn-success']")));
			
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();		
	}

	public static void main(String[] args) {

		Assignment_03 ass = new Assignment_03();
		ass.login();

	}
}
