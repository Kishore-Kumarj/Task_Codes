package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common_Functions.CommonFunctions;

public class LogOut_Page extends CommonFunctions {
	@FindBy(linkText = "Logout")
	public static WebElement logout;
}