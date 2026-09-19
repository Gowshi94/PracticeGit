package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import utils.DataProviderClass;
import base.BaseTest;

public class LoginTest extends BaseTest {
	@Test(dataProvider = "loginData",dataProviderClass = DataProviderClass.class)
	public void verifylogin(String uname,String pword) {
		LoginPage lp=new LoginPage(driver);
		lp.login(uname, pword);
		

	}

		
	}


