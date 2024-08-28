package CalendarDateSelection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import screenShot.Webelement_ScreenShot;

public class DatePicker {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		driver.get("https://dev.bimastreet.com/");
		driver.findElement(By.cssSelector("li[id='health'] a")).click();
		driver.findElement(By.cssSelector("input[id='Son ']")).click();
		driver.findElement(By.cssSelector("input[id='Daughter ']")).click();
		
		String adYear = "1994";
		String adMonth = "December 1994";
		String adDate = "22";
		String adreqDate = "22-12-1994";
		
		// Selecting Adult DOB(Year)
		driver.findElement(By.cssSelector("input[id='1st Adult DOB']")).click();
		driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-switchViewIcon.css-sldnni")).click();
		driver.findElement(By.xpath("//button[text()='"+adYear+"']")).click();
		
		// Selecting Adult DOB(Month)
		
		int ad=1;
		while(!driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label.css-1v994a0")).getText().equalsIgnoreCase(adMonth) && ad<10)
		{
			driver.findElement(By.cssSelector(".MuiPickersArrowSwitcher-leftArrowIcon")).click();
			ad++;
		}
		
		while(!driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label.css-1v994a0")).getText().equalsIgnoreCase(adMonth))
		{
			driver.findElement(By.cssSelector(".MuiPickersArrowSwitcher-rightArrowIcon")).click();
		}
			
		driver.findElement(By.xpath("//button[text()='"+adDate+"']")).click();
		driver.findElement(By.xpath("//p[text()='Select age of your family members']")).click();
		
	/*	// Selecting Gender
		driver.findElement(By.cssSelector("#Gender")).click();
		Actions ac = new Actions(driver);
		//ac.sendKeys(Keys.DOWN).build().perform();
		ac.sendKeys(Keys.ENTER).build().perform();   */
		
		// Selecting Child-1 DOB
		String c1Year = "2012";
		String c1Month = "December 2012";
		String c1Date = "1";
		driver.findElement(By.id("Child 1 Date of birth (DOB)")).click();
		driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-switchViewIcon")).click();
		driver.findElement(By.xpath("//button[text()='"+c1Year+"']")).click();
		int c1=1;
		
		while(!driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label")).getText().equalsIgnoreCase(c1Month) && c1<10)
		{
			driver.findElement(By.cssSelector(".MuiPickersArrowSwitcher-leftArrowIcon")).click();
			c1++;
		}
		
		while(!driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label")).getText().equalsIgnoreCase(c1Month))
		{
			driver.findElement(By.cssSelector(".MuiPickersArrowSwitcher-rightArrowIcon")).click();
		}
		
		driver.findElement(By.xpath("//button[text()='"+c1Date+"']")).click();
		driver.findElement(By.xpath("//p[text()='Select age of your family members']")).click();
		
		// Selecting 2Children BOD
		String c2Year = "2013";
		String c2Month = "November 2013";
		String c2Date = "11";
		driver.findElement(By.id("Child 2 Date of birth (DOB)")).click();
		
		driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-switchViewIcon")).click();
		driver.findElement(By.xpath("//button[text()='"+c2Year+"']")).click();
		int c2=1;
		
		while(!driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label")).getText().equalsIgnoreCase(c2Month) && c2<10)
		{
			driver.findElement(By.cssSelector(".MuiPickersArrowSwitcher-leftArrowIcon")).click();
			c2++;
		}
		
		while(!driver.findElement(By.cssSelector(".MuiPickersCalendarHeader-label")).getText().equalsIgnoreCase(c2Month))
		{
			driver.findElement(By.cssSelector(".MuiPickersArrowSwitcher-rightArrowIcon")).click();
		}
		
		driver.findElement(By.xpath("//button[text()='"+c2Date+"']")).click();
		
		
		//Clicking on Continue button
		driver.findElement(By.xpath("//p[text()='Select age of your family members']")).click();
		driver.findElement(By.cssSelector("#Continue")).click();
	//Rohit
	}
}