package testCases;

import org.openqa.selenium.support.PageFactory;

import common_Functions.CommonFunctions;
import pageObjects.LogOut_Page;

public class LogOut_TestCase extends CommonFunctions{
	public void logout() {
		PageFactory.initElements(driver, LogOut_Page.class);
		LogOut_Page.logout.click();
	}

}
