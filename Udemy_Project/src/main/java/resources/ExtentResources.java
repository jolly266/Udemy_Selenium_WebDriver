package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentResources {

	public static ExtentReports getReporterObject() {
		
		String Path = System.getProperty("user.dir")+"//Reports//Index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(Path);
		reporter.config().setDocumentTitle("Test Result");
		reporter.config().setReportName("WebAutomation Result");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Jay Gupta");
		return extent;
	}	
}
