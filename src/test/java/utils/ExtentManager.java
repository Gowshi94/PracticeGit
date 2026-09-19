package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extent;
	public static ExtentReports getInstance() {
		if(extent==null) {
			ExtentSparkReporter reporter=new ExtentSparkReporter("report/ExtentReport.html");
			reporter.config().setReportName("Automation Results");
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			
		}
		return extent;
		
	}

}
