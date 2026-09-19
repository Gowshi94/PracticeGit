package utils;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;

public class ExtentListener extends BaseTest implements ITestListener{
	ExtentReports extent=ExtentManager.getInstance();
	ExtentTest test;
	
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<>();
	
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		
	}
	/*public void onTestSuccess(ITestResult result) {
		extentTest.get().pass("Test Passes");
		String path=captureScreenshot(driver,result.getMethod().getMethodName());
		try {
			extentTest.get().addScreenCaptureFromPath(path,"Passed Screenshot");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}*/
	/*public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		Object obj=result.getInstance();
		BaseTest base=(BaseTest)obj;
		WebDriver driver=base.getDriver();
		String path=base.captureScreenshot(driver,result.getMethod().getMethodName());
		try {
			extentTest.get().addScreenCaptureFromPath(path,"Failure Screenshot");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}*/
	public void onTestSkipped(ITestResult result) {
		extentTest.get().skip("Test Skipped");
	}
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
	

}
