package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchEmployee_Page {
		
	@FindBy(xpath = "//a[@href='/Employee/Search']")
	public static WebElement search;

	@FindBy(id = "Name")
	public static WebElement name;

	@FindBy(id = "btnSearch")
	public static WebElement searchButton;
	
}
