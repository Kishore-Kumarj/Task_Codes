package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn_Page {
	@FindBy(id = "UserName")
	public static WebElement username;
	@FindBy(id = "Password")
	public static WebElement password;
	@FindBy(id = "btnLogin")
	public static WebElement button;

}
