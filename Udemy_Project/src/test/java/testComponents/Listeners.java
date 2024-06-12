package testComponents;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import resources.ExtentResources;

public class Listeners extends BaseClass implements ITestListener {

	ExtentTest test;
	ExtentReports extent = ExtentResources.getReporterObject();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();// Thread Safe
	
	@Override
	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);//Set Unique threadID for error Validation Test
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		extentTest.get().log(Status.PASS, "Test Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		
		try {
		driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String filePath = null;
		try {
		filePath = getScreenShot(result.getMethod().getMethodName(),driver);
		}catch (IOException e1) {
			e1.printStackTrace();
		}
		extentTest.get().addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		
	}

	@Override
	public void onStart(ITestContext context) {

	
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}
