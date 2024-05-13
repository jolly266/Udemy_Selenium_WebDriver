package extentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class createreport2 {

	ExtentReports extent;

	@BeforeTest
	public void config() {

		String path = System.getProperty("user.dir") + "\\Report\\HTML Report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Regression Testing");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester Name", "Jay Gupta");

	}

	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//String expected = "Google";
		String expected = "Yahoo";
		String Actual = driver.getTitle();
		ExtentTest test =	extent.createTest("Title Verification");
		
		if (expected.equalsIgnoreCase(Actual)) {
			test.pass("Title Matched");
			extent.flush();
		}
		else {
			test.fail("Title Missmattched");
			extent.flush();
		}
	}
}
