package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage {
	WebDriver driver;
	
	
	public ProductsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public static WebElement productA;
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	public static WebElement productB;
	
	public void addProducts() {
		productA.click();
		productB.click();
	}
	

}
