package CalendarDateSelection;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateSelectionFromCal {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		String day = "10";
		String month = "9";
			
		
		driver.findElement(By.cssSelector(".ui-datepicker-trigger")).click();
		driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		
		
		
		if(driver.findElement(By.xpath("//td[@data-handler='selectDay']")).getAttribute("data-month").equalsIgnoreCase(month))
		{
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		}
	}

}
