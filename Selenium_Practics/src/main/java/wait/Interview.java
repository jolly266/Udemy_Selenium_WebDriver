package wait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interview {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev.bimastreet.com/");
		
		//Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product-section']/ul/li[2]/a")));
		 
		driver.findElement(By.xpath("//p[text()='Health Insurance']")).click();
		
		////div[@class='product-section']/ul/li[2]/a
		
		// Selecting checkbox for son
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

		// Clicking on Adult DOB
		driver.findElement(By.cssSelector(".MuiInputBase-root.MuiOutlinedInput-root")).click();

		// clicking for year selection
		driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-labelContainer")).click();

		String adultDay = "1";
		int currentAdultMonth = 8;
		String adultMonth = "January 1980";
		String adultYear = "1980";

		driver.findElement(By.xpath("//button[text()='" + adultYear + "']")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-dplwbx-MuiPickersCalendarHeader-label']"))
					.getText().equalsIgnoreCase(adultMonth))
		{
			driver.findElement(By.xpath("//button[@title='Previous month']")).click();
		}
	
		/*
			if (!driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-dplwbx-MuiPickersCalendarHeader-label']"))
					.getText().equalsIgnoreCase(adultMonth)) {
				for (int i = 0; i < currentAdultMonth - 1; i++) {
				driver.findElement(By.xpath("//button[@title='Previous month']")).click();
			}
		}
		 */
		
		driver.findElement(By.xpath("//button[text()='"+adultDay+"']")).click();

		// selecting of Gender
		driver.findElement(By.cssSelector("[aria-haspopup='listbox']")).click();
		Actions ac = new Actions(driver);
		// ac.sendKeys(Keys.ARROW_DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();

		// selecting son DOB
		driver.findElement(By.cssSelector("[id='Child 1 Date of birth (DOB)']")).click();
		driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-labelContainer")).click();
		
		String sonDay = "1";
		int currentsonMonth = 8;
		String sonMonth = "December 2015";
		String sonYear = "2015";

		driver.findElement(By.xpath("//button[text()='"+sonYear+"']")).click();
		
		int k=1;
		while(!driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-dplwbx-MuiPickersCalendarHeader-label']"))
				.getText().equalsIgnoreCase(sonMonth)&& k<=11)
		{
			driver.findElement(By.xpath("//button[@title='Previous month']")).click();
			k++;
		}
		
		while(!driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-dplwbx-MuiPickersCalendarHeader-label']"))
				.getText().equalsIgnoreCase(sonMonth))
		{
			driver.findElement(By.xpath("//button[@title='Next month']")).click();	
		}
		/*
		if (!driver.findElement(By.xpath("//div[@class='MuiPickersCalendarHeader-label css-dplwbx-MuiPickersCalendarHeader-label']"))
				.getText().equalsIgnoreCase(sonMonth)) {
		
		for (int i = 0; i < currentsonMonth - 1; i++) {
			
				driver.findElement(By.xpath("//button[@title='Previous month']")).click();
			}
		}
		*/
		driver.findElement(By.xpath("//button[text()='"+sonDay+"']")).click();
				
		//Clicking on Continew Button
		driver.findElement(By.cssSelector("#Continue")).click();
		
		//Entering Mobile Number
		String MobileNumber = "1234567890";
		driver.findElement(By.cssSelector("#Mobile")).sendKeys(MobileNumber);
		
		//Entring PinCode
		String pinCode = "110018";
		driver.findElement(By.cssSelector("#Pincode")).sendKeys(pinCode);

	}
}
