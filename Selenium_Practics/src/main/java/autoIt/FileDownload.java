package autoIt;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileDownload {

	public static void main(String[] args) throws Throwable {
		String downloadPath = System.getProperty("user.dir");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_setting.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.cssSelector("#pickfiles")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E:/Udemy/Selenium_Practics/Autoit.exe");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#processTaskTextBtn")));
		driver.findElement(By.cssSelector("#processTaskTextBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
		driver.findElement(By.cssSelector("#pickfiles")).click();

		Thread.sleep(2000);
		File file = new File(downloadPath + "/AutoItPDF.docx");
		Assert.assertTrue(file.exists());
		if (file.exists()) {
			System.out.println("Item Present");
		}
		if (file.delete()) {
			System.out.println("Item Deleted");
		}
	}

}
