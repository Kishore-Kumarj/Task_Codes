package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import common_Functions.CommonFunctions;
import pageObjects.More_Page;

public class More_TestCase extends CommonFunctions {
	@Test
	public void more() {
		PageFactory.initElements(driver, More_Page.class);

		More_Page.more.click();
		More_Page.multipleTabs.click();
		More_Page.textBox1.sendKeys("Thank You");
		More_Page.unLearning.click();
		More_Page.textBox3.sendKeys("Thank You");
		More_Page.ways.click();
		More_Page.textBox5.sendKeys("Thank You");
		More_Page.menu.click();
		More_Page.menus();
		More_Page.autoComplete.click();
		More_Page.nextTab.click();
		More_Page.collapsible.click();
		More_Page.collapse();
		More_Page.images.click();
		More_Page.file.sendKeys(properties.getProperty("image"));
		More_Page.upload.click();
		More_Page.notification();
		More_Page.slider.click();
		More_Page.move();
		More_Page.tooltip.click();
		More_Page.tipButton();
		More_Page.popup.click();
		More_Page.popup1();
		More_Page.popup2();
		More_Page.popup3();
		More_Page.popupDuplicate();
		More_Page.duplicateTab();
		More_Page.inWindow();
		More_Page.alertBox();
		More_Page.confirmBox();
		More_Page.promptBox();
		More_Page.links.click();
		More_Page.workingLinks();
		More_Page.cssProperties.click();
		More_Page.cssValues();
	}

}
