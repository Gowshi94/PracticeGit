package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	WebDriverWait wait;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
	}
	@FindBy(className ="shopping_cart_link")
	public static WebElement cart;
	
	public void goToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(cart)).click();
	}

}
