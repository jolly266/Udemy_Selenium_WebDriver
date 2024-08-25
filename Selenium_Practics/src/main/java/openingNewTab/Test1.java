package openingNewTab;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://183.82.103.245/nareshit/index.php");
		
		driver.findElement(By.xpath("(//input[@class='loginText'])[1]")).sendKeys("nareshit");
		driver.findElement(By.xpath("(//input[@class='loginText'])[2]")).sendKeys("nareshit");
		driver.findElement(By.xpath("(//input[@class='button'])[1]")).click();
	
		
		List<WebElement> topMenuText = driver.findElements(By.xpath("//div[@id='top-menu']/ul/li/a/span"));
		
		
		System.out.println("Text Present on TopMenu :- "+topMenuText.size());
		
		
		for(int i=0;i<topMenuText.size();i++)
		{
			String allText = topMenuText.get(i).getText();
			System.out.println(i+1+" "+allText);
		}
		
		
		/*
		for(WebElement eachtext:topMenuText)
		{
			System.out.println(eachtext.getText());
		}
		
		
		List<WebElement> topMenuLinks1 = topMenu.findElements(By.tagName("a"));
		System.out.println("Links Present on TopMenu :- "+topMenuLinks1.size());
		//Iterating All Links
		for(WebElement eachLink:topMenuLinks1)
		{
			String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			eachLink.sendKeys(tab);
		}
		
		
		Set<String> winID = driver.getWindowHandles();
		for(String id:winID)
		{
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
		}
		*/
		
		/*
		List<WebElement> alltitle = driver.findElements(By.xpath("//table[@class='data-table']/thead/tr/td/a"));
		System.out.println(alltitle.size());
		
		for(WebElement each:alltitle)
		{
			System.out.println(each.getText());
		}
		
		
	List<WebElement> jobTitle = driver.findElements(By.xpath("//table[@class='data-table']/thead/tr/td/a"));
	System.out.println(jobTitle.size());
	
	for(WebElement title:jobTitle)
	{
		System.out.println(title.getText());
	}
	*/	
	}
}
