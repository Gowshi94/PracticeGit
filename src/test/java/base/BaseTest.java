package base;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;
import utils.DriverFactory;

public class BaseTest {
	protected WebDriver driver;
	@BeforeMethod
	public void setUp() {
		driver=DriverFactory.initDriver();
		Properties prop=ConfigReader.inProperties();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	/*public WebDriver getDriver() {
		return driver;
	}
	
	
	public String captureScreenshot(WebDriver driver,String testName) {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/"+testName+"_"+System.currentTimeMillis()+".jpg";
		try {
			File des=new File(path);
			des.getParentFile().mkdirs();
			FileHandler.copy(src, des);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return path;
	}*/
	

}
