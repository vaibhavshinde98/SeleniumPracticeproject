package TestngListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;   //UI of report
	public ExtentReports extent;   //populate common info on the report
	public ExtentTest test;  //crating test case entries in the repprt and upadate status pf tje test method
	
	public void onStart(ITestContext context) {
		sparkReporter= new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automatin Report");  //title of report
		sparkReporter.config().setReportName("Functional Testing"); //name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("computer Name","localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester name", "vaibhav");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("browser name", "Chrome,Firefox,Edge");
		
		
		
	}
	public void onTestSuccess(ITestResult result) {
		test= extent.createTest(result.getName()); // create new entry in report
		test.log(Status.PASS, "Test Case Passed is: "+ result.getName()); // upadate status p/f/s
		
	}
	
	public void onTestFailure(ITestResult result) {
		test= extent.createTest(result.getName());
		test.log(Status.FAIL, "Test are Failed is : "+ result.getName());
		test.log(Status.FAIL, "Test case Failed cause is: "+ result.getThrowable());
		
	}
	public void onTestSkipped(ITestResult result) {
		test= extent.createTest(result.getName());
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
