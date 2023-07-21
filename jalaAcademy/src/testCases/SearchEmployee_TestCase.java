package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functions.CommonFunctions;
import pageObjects.SearchEmployee_Page;

public class SearchEmployee_TestCase extends CommonFunctions {
	@Test
	public void Search() {
		PageFactory.initElements(driver, SearchEmployee_Page.class);
		SearchEmployee_Page.search.click();
		SearchEmployee_Page.name.sendKeys(properties.getProperty("employeeName"));
		SearchEmployee_Page.searchButton.click();
	}

}
