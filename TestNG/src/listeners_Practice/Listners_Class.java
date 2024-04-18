package listeners_Practice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners_Class implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("I am Priting after test get success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I am Priting after test get failed"+"Failed method name is:-"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I am Priting after test get skipped");
		
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
		
		
	}
}
