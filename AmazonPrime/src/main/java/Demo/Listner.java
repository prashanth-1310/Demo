package Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listner implements ITestListener {
	ExtentReports er;
	
	//It will monitor the listner class example when it is starting ending
	ExtentTest test;
	
	

	public void onTestStart(ITestResult result) {
		String name = result.getName();
		
		//Particular test case monitor
		test = er.createTest(name);
	
	}

	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		
		//To provide success result
		test.log(Status.PASS,name+"----pass");
		
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		// To provide the Failure result
		test.log(Status.FAIL,name+"----fail");
	}

	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		
		//To provide Skipped result
		test.log(Status.SKIP,name+"----skipped");
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter esr = new ExtentSparkReporter(".\\ExtentReport\\"+02+".html");
		
		//To provide Title to the Report
		esr.config().setDocumentTitle("Final Vtiger Report");
		
		//To provide Theme or Colour
		esr.config().setTheme(Theme.STANDARD);
		
		//Tp provide Reporters Name
		esr.config().setReportName("Prashanth");
		
		//Extra Relevant Information about Report
		er = new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("Operating System", "Window");
		er.setSystemInfo("Language", "Java");
		
	}

	public void onFinish(ITestContext context) {
		
		//It is Going to Consolidate the Report
		er.flush();
	
	}
	

}
