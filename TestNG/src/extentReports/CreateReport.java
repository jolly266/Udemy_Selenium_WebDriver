package extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class CreateReport {

	ExtentReports extent;

	@BeforeTest
	public void config() {

		String path = System.getProperty("user.dir") + "\\report\\inndex.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Sanity Testing");
		// reporter.config().setDocumentTitle("Test Result");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Jay Krishna");
	}

	@Test
	public void demo() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bollyflix.cash/");
		//String expected = "BollyFlix | Official Site, Bolly Flix, 300MB Movies, 9xMovies, BollyFlix.Net, BollyFlix.com";
		String expected = "Yahoo";
		String actual = driver.getTitle();
		ExtentTest test = extent.createTest("First Test");
		if (expected.equalsIgnoreCase(actual)) {
			test.pass("Result Matched");
			extent.flush();
		}
		else
		{
		test.fail("Result Miss Matched");
		extent.flush();
		}
	}
}
