package Automation_ObjectPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class MultiWindows_Pages extends BaseClass {
	By demo1 = By.linkText("Demo Sites");
	By auto1 = By.linkText("Practice Automation");
	By window = By.linkText("Demo Site – Multiple Windows");
	By newWindow = By.name("newbrowserwindow123");
	By messageWindow = By.name("123newmessagewindow321");
	By text = By.tagName("head");
	By browserTab = By.name("145newbrowsertab234");

	public void naviagte_To_MultiWindows_Page() {

		System.out.println(getURL());
		WebElement demo = Xpath(demo1);
		action.moveToElement(demo).build().perform();
		WebElement auto = Xpath(auto1);
		action.moveToElement(auto).build().perform();
		WebElement windows = Xpath(window);
		wait.until(ExpectedConditions.visibilityOf(windows));
		click(window);

		click(newWindow);
		Set<String> handle = getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentWindowId = it.next();
		String childWindow = it.next();
		driver.switchTo().window(childWindow);
		System.out.println(getURL());
		driver.close();
		driver.switchTo().window(parentWindowId);

		click(messageWindow);
		Set<String> handle2 = getWindowHandles();
		Iterator<String> it2 = handle2.iterator();
		String parentWindowId2 = it2.next();
		String childWindow2 = it2.next();
		driver.switchTo().window(childWindow2);
		//System.out.println(getURL());
		driver.close();
		driver.switchTo().window(parentWindowId2);

		click(browserTab);
		Set<String> handle3 = getWindowHandles();
		Iterator<String> it3 = handle3.iterator();
		String parentWindowId3 = it3.next();
		String childWindow3 = it3.next();
		driver.switchTo().window(childWindow3);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowId3);

	}

}
