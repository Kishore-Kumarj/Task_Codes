package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateEmployee_Page {
	
	public static Select s;
	
	@FindBy(xpath = "(//a[@href='#'])[2]")
	public static WebElement employee;
	
	@FindBy(xpath = "//a[@href='/Employee/Create']")
	public static WebElement create;
	
	@FindBy(id = "FirstName")
	public static WebElement firstName;
	
	@FindBy(id = "LastName")
	public static WebElement lastName;
	
	@FindBy(id = "EmailId")
	public static WebElement email;
	
	@FindBy(id = "MobileNo")
	public static WebElement mobileNum;
	
	@FindBy(id = "DOB")
	public static WebElement dob;
	
	@FindBy(id = "rdbMale")
	public static WebElement gender;
	
	@FindBy(id = "Address")
	public static WebElement address;
	
	@FindBy(id = "CountryId")
	public static WebElement country;
//	public static WebElement country=driver.findElement(By.id("CountryId"));
	public static Select selectCountry() {
		return s= new Select(country);
	}
	
	@FindBy(id = "CityId")
	public static WebElement city;
//	public static WebElement city=driver.findElement(By.id("CityId"));
	public static Select selectCity() {
		return s = new Select(city);
	}
	
	@FindBy(id = "chkSkill_1")
	public static WebElement skills;
	
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement saveButton;
	
	

}
