package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_Functions.CommonFunctions;

public class More_Page extends CommonFunctions {

	@FindBy(xpath = ("(//a[@href='#'])[3]"))
	public static WebElement more;

	@FindBy(xpath = ("//a[@href='/Home/Tabs']"))
	public static WebElement multipleTabs;

	@FindBy(id = "textbox1")
	public static WebElement textBox1;

	@FindBy(xpath = ("//a[@href='#tab_2']"))
	public static WebElement unLearning;

	@FindBy(id = "textbox3")
	public static WebElement textBox3;

	@FindBy(xpath = ("//a[@href='#tab_3']"))
	public static WebElement ways;

	@FindBy(id = "textbox5")
	public static WebElement textBox5;

	@FindBy(xpath = ("//a[@href='/Home/Menu']"))
	public static WebElement menu;

	public static void menus() {
		driver.findElement(By.xpath("//a[@href='#tab_1'][text()='Single Menus']")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//a[@id='b1']/../../li"));
		System.out.println("Single Menus Contents : \n");
		for (WebElement name : menu) {
			System.out.println(name.getText());
		}

		driver.findElement(By.xpath("//a[@href='#tab_2'][text()='Sub Menus']")).click();
		List<WebElement> SubMenu = driver.findElements(By.xpath("//li[@class='dropdown']"));
		System.out.println("\n Sub Menus Contents : \n");
		for (WebElement menu1 : SubMenu) {
			menu1.click();
			System.out.println(menu1.getText());

		}
	}

	@FindBy(xpath = "//a[@href='/Home/AutoComplete']")
	public static WebElement autoComplete;

	@FindBy(xpath = "//a[text()='Multiple Values']")
	public static WebElement nextTab;

	@FindBy(xpath = "//a[@href='/Home/Collapse']")
	public static WebElement collapsible;

	public static void collapse() {
		List<WebElement> title = driver.findElements(By.xpath("(//div[@id='accordion'][@class='panel-group'])[1]/div"));
		System.out.println("\n Single Collapse Contents : \n");
		for (WebElement singleCol : title) {
			System.out.println(singleCol.getText());
			singleCol.click();
			List<WebElement> content = driver
					.findElements(By.xpath("(//div[@id='accordion'][@class='panel-group'])[1]/div/div/div/p"));
			for (WebElement text : content) {
				System.out.println(text.getText());
			}
		}

		driver.findElement(By.xpath("//a[text()='Multiple Collapse']")).click();
		List<WebElement> title1 = driver.findElements(By.xpath("(//div[@id='accordion'])[2]/div"));
		System.out.println("\n Multiple Collapse Contents : \n");
		for (WebElement multiCol : title1) {
			System.out.println(multiCol.getText());
			multiCol.click();
			List<WebElement> content = driver.findElements(By.xpath("(//div[@id='accordion'])[2]/div/div/div/p"));
			for (WebElement text : content) {
				System.out.println(text.getText());
			}
		}

	}

	@FindBy(xpath = "//a[@href='/Home/UploadImage']")
	public static WebElement images;

	@FindBy(id = "file")
	public static WebElement file;

	@FindBy(xpath = "//button[text()='Upload']")
	public static WebElement upload;

	public static void notification() {
		WebElement error = driver.findElement(By.xpath("//button[@class='toast-close-button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(error));
		error.click();
	}

	@FindBy(xpath = "//a[@href='/Home/Slider']")
	public static WebElement slider;

	public static void move() {
		WebElement pointer = driver.findElement(By.xpath("(//div[@role='slider'])[1]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(pointer, 450, 100).build().perform();
		WebElement value = driver.findElement(By.id("ex6SliderVal"));
		System.out.println("The Current Value is : " + value.getText() + "\n");
	}

	@FindBy(xpath = "//a[@href='/Home/Tooltip']")
	public static WebElement tooltip;

	public static void tipButton() {
		WebElement button = driver.findElement(By.id("btnTooltip"));
		System.out.println("Before clicking :" + button.getAttribute("data-original-title"));
		button.click();
		System.out.println("After clicking :" + button.getAttribute("data-original-title"));
	}

	@FindBy(xpath = "//a[@href='/Home/Popup']")
	public static WebElement popup;

	public static void popup1() {
		driver.findElement(By.id("btn-one")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		System.out.println("popup1 Title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
	}

	public static void popup2() {
		driver.findElement(By.id("btn-two")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		System.out.println("popup2 Title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
	}

	public static void popup3() {
		driver.findElement(By.id("btn-three")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		System.out.println("popup3 Title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
	}

	public static void popupDuplicate() {
		driver.findElement(By.id("btn-four")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		System.out.println("popupDuplicate Title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
	}

	public static void duplicateTab() {
		driver.findElement(By.id("btn-four")).click();
		String parent = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		System.out.println("DuplicateTab Title : " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
	}

	public static void inWindow() {
		driver.findElement(By.id("btn-six")).click();
		String old = driver.getWindowHandle();
		driver.switchTo().window(old);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	}

	public static void alertBox() {
		driver.findElement(By.id("alertBox")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void confirmBox() {
		driver.findElement(By.id("confirmBox")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void promptBox() {
		driver.findElement(By.id("promptBtn")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Tony Stark");
		alert.accept();
	}

	@FindBy(xpath = "//a[@href='/Home/Links']")
	public static WebElement links;

	public static void workingLinks() {
		driver.findElement(By.xpath("//a[@href='#tab_1'][text()='Working Links']")).click();
		List<WebElement> urls = driver
				.findElements(By.xpath("(//div[@class='col-md-12 row text-center m-t-md'])[1]/a"));
		for (WebElement url : urls) {
			System.out.println(url.getText() + " : " + url.getAttribute("href"));
		}
	}

	@FindBy(xpath = "//a[@href='/Home/CssProperty']")
	public static WebElement cssProperties;

	public static void cssValues() {
		driver.findElement(By.xpath("//a[@href='#tab_1']")).click();
		List<WebElement> link = driver.findElements(By.xpath("//div[@id='tab_1']/div/a"));
		for (WebElement webElement : link) {
			System.out.println(webElement.getText() + webElement.getAttribute("style"));
		}

		driver.findElement(By.xpath("//a[@href='#tab_4'][text()='Alerts']")).click();
		List<WebElement> alert = driver.findElements(By.xpath("//div[@id='tab_4']/div"));
		for (WebElement webElement : alert) {
			System.out.println(webElement.getText() + "====> Color ====>" + webElement.getCssValue("color"));
		}
	}

}
