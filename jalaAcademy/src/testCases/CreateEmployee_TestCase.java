package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functions.CommonFunctions;
import pageObjects.CreateEmployee_Page;

public class CreateEmployee_TestCase extends CommonFunctions {
	@Test
	public void employee() {
		PageFactory.initElements(driver, CreateEmployee_Page.class);
		CreateEmployee_Page.employee.click();
		CreateEmployee_Page.create.click();
		CreateEmployee_Page.firstName.sendKeys(properties.getProperty("FirstName"));
		CreateEmployee_Page.lastName.sendKeys(properties.getProperty("LastName"));
		CreateEmployee_Page.email.sendKeys(properties.getProperty("email"));
		CreateEmployee_Page.mobileNum.sendKeys(properties.getProperty("mobileNumber"));
		CreateEmployee_Page.dob.sendKeys(properties.getProperty("dob"));
		CreateEmployee_Page.gender.click();
		CreateEmployee_Page.address.sendKeys(properties.getProperty("address"));
		CreateEmployee_Page.country.click();
		CreateEmployee_Page.selectCountry().selectByVisibleText("USA");
		CreateEmployee_Page.city.click();
		CreateEmployee_Page.selectCity().selectByVisibleText("Texas");
		CreateEmployee_Page.skills.click();
		CreateEmployee_Page.saveButton.click();
	}
}