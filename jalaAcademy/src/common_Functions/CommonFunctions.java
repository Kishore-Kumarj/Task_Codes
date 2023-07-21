package common_Functions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static Properties properties;
	public static WebDriver driver;
	public String configPath = "C:\\Users\\kishore\\Eclipse Related Files\\jalaAcademy\\Resources\\config.properties";
	
	public Properties loadProperty() throws IOException {
		FileInputStream input = new FileInputStream(configPath);
		properties = new Properties();
		properties.load(input);
		return properties;
	}
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadProperty();
		String browser = properties.getProperty("Browser");
		String url= properties.getProperty("url");
		
		if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\Driver\\msedgedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

}
