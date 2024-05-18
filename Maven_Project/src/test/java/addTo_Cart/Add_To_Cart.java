package addTo_Cart;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Add_To_Cart {

	
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("jaykrishnagupta@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Jaykrishna@1");
		driver.findElement(By.id("login")).click();

		// Adding Items to Cart
		String[] itemsneeded = { "ZARA COAT 3", "ADIDAS ORIGINAL", "IPHONE 13 PRO" };

		// Getting Xpath for Every products up to text at visible level
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card-body']/h5/b"));
		
		
		for (int i = 0; i < products.size(); i++) {
			// Extracting text of Each Product
			String name = products.get(i).getText();
			List<String> itemsNeededList = Arrays.asList(itemsneeded);
			
			if (itemsNeededList.contains(name))
			{
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#toast-container")));
//				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
				wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
				driver.findElements(By.cssSelector(".btn.w-10.rounded")).get(i).click();			
			}
		}
		Thread.sleep(3000);
		//Clicking on cart button
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		
		//Click On Checkout Button
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.cssSelector(".totalRow button"))).build().perform();
		driver.findElement(By.cssSelector(".totalRow button")).click();
		
		//entering cvv Number and card holder name
		driver.findElement(By.xpath("(//input[@class='input txt'])[1]")).sendKeys("143");
		driver.findElement(By.xpath("(//input[@class='input txt'])[2]")).sendKeys("Jay Gupta");
		
		// Selecting Country name
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("Amer");
		driver.findElement(By.xpath("//button[@type='button'][1]")).click();
		driver.findElement(By.cssSelector(".btnn.action__submit.ng-star-inserted")).click();
		
		//Validating with confirmation text
		String confirmationMSG = driver.findElement(By.cssSelector(".hero-primary")).getText();
		org.testng.Assert.assertTrue(confirmationMSG.contentEquals("THANKYOU FOR THE ORDER."));
		
		
		
		
	}
}
