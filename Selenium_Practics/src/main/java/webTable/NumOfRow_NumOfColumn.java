package webTable;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumOfRow_NumOfColumn {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://money.rediff.com/index.html");
		
		WebElement tableEle = driver.findElement(By.xpath("//div[@class='hmbseindicestable show']"));
		List<WebElement> totalRows = tableEle.findElements(By.tagName("ul"));
		int rowCount = totalRows.size()-1;
		System.out.println("Total Rows in Table:- "+rowCount);
		
		//Counting Column
		for(int i=1;i<rowCount;i++)
		{
		List<WebElement> totalColumn = totalRows.get(i).findElements(By.tagName("li"));
		System.out.println("Row Count in "+i+" Column is  "+totalColumn.size());
		
		}

	}

}
