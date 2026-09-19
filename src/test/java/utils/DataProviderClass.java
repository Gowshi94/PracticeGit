package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="loginData")
	public Object[][] getData() throws Exception{
		return ExcelUtils.getTestData("src/test/resources/ecomm_data.xlsx","Sheet1");
	}

}
