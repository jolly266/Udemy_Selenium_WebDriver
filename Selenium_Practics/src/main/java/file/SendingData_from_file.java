package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingData_from_file {

	public static void main(String[] args) throws IOException, Throwable {

		FileReader fr = new FileReader("E:/Udemy/Selenium_Practics/File/SendingDataFromFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";

		while ((str = br.readLine()) != null) {
			String login[] = str.split(";");

			System.out.println(login[0]);
			System.out.println(login[1]);

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.get("http://primusbank.qedgetech.com/");
			driver.findElement(By.cssSelector("#txtuId")).sendKeys(login[0]);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#txtPword")).sendKeys(login[1]);
			driver.findElement(By.cssSelector("#login")).click();
			driver.quit();
		}	
		br.close();
	}
}
