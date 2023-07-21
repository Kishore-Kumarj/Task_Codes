package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functions.CommonFunctions;
import pageObjects.LogOut_Page;

public class LogOut_TestCase extends CommonFunctions{
	@Test
	public void logout() {
		PageFactory.initElements(driver, LogOut_Page.class);
		LogOut_Page.logout.click();
	}

}
