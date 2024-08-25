package CalendarDateSelection;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarDate_NormalWay {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		String year = "2029";
	 	String month = "5";
	 	//String month = "July";
	 	//int month = 5;
		String date = "15";
		String[] expectedCalList = {month,date,year};
				
		driver.findElement(By.cssSelector(".react-date-picker__calendar-button__icon")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		//Selecting Year
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		
		//Selecting Month when input in int(as String)
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		
		//Selecting Month when input in int
		//driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(month-1).click();
		
		//Selecting Month when input in String
		//driver.findElement(By.xpath("//abbr[text()='"+month+"']")).click();
		
		//Selecting Date
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		//Assertion
		List<WebElement> calEle = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<calEle.size();i++)
		{
			
		System.out.println(calEle.get(i).getAttribute("value"));	
		Assert.assertEquals(calEle.get(i).getAttribute("value"), expectedCalList[i]);
		}
		
	}

}
