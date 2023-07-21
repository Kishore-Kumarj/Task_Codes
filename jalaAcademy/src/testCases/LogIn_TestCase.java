package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functions.CommonFunctions;
import pageObjects.LogIn_Page;

public class LogIn_TestCase extends CommonFunctions{
	@Test
	public void login_Test() {
		PageFactory.initElements(driver, LogIn_Page.class);
		LogIn_Page.username.sendKeys(properties.getProperty("username"));
		LogIn_Page.password.sendKeys(properties.getProperty("password"));
		LogIn_Page.button.click();
	}
}
