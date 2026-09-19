package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id ="user-name")
	public static WebElement user;
	@FindBy(id="password")
	public static WebElement pass;
	@FindBy(id="login-button")
	public static WebElement logIn;
	
	public void login(String uname, String pword) {
		user.sendKeys(uname);
		pass.sendKeys(pword);
		logIn.click();
		
		
	}

}
