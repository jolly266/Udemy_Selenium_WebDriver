package locator_Practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws Throwable {

		addToCart();
		
	}
		public static void addToCart() throws Throwable {
			
			WebDriver driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			String[] itemsneeded = { "Cucumber", "Brinjal", "Pumpkin", "Mango" };
			int j = 0;
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/seleniumPractise/");

			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			

			for (int i = 0; i < products.size(); i++) {
				String[] name = products.get(i).getText().split("-");
				String formatedName = name[0].trim();
				List<String> itemsNeededList = Arrays.asList(itemsneeded);

				if (itemsNeededList.contains(formatedName))

				{
					j++;
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if (j == itemsneeded.length)

					{
						break;
					}
				}

			}
				driver.findElement(By.cssSelector("img[alt='Cart']")).click();
				driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
				driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
				driver.findElement(By.cssSelector("button.promoBtn")).click();				
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
				System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
				driver.findElement(By.xpath("//button[text()='Place Order']")).click();
				
				
			
			
			
			
	}
}
