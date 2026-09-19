package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pageobjects.CartPage;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;
import utils.DataProviderClass;

public class AddToCartTest extends BaseTest {
	@Test(dataProvider = "loginData",dataProviderClass = DataProviderClass.class)
	public void addProductTest(String uname,String pword) {
		LoginPage lp=new LoginPage(driver);
		lp.login(uname,pword);
		
		ProductsPage products=new ProductsPage(driver);
		products.addProducts();
		
		CartPage cart=new CartPage(driver);
		cart.goToCart();
	}

}
