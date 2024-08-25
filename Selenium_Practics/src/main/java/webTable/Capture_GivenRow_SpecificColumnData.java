package webTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_GivenRow_SpecificColumnData {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://money.rediff.com/index.html");
		System.out.println(driver.findElement(By.xpath("//div[@class='hmbseindicestable show']/ul[3]/li[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@class='hmbseindicestable show']/ul[3]/li[3]")).getText());

	}

}
