package Automation_PageObject_TestCases;

import static org.junit.Assume.assumeFalse;

import org.testng.annotations.Test;

import Automation_ObjectManager.ObjectManager;

public class DemoWebSite_TestCases extends ObjectManager {
	@Test(alwaysRun = false)
	public void homePage() {
		home.homePage_Links();
	}

	@Test(priority = 2)
	public void seleniumPage_Links() {
		selenium.seleniumPageLinks();
	}

	@Test(priority = 3)
	public void navigateToDemoPage() {
		demo.naviagte_To_DemoWebSite();
	}

	@Test(priority = 4)
	public void registerPage() {
		register.filling_RegiterForm();
	}

	@Test(priority = 5)
	public void successfullPage() {
		success.validating_SuccessMessage();
	}

	@Test(priority = 6)
	public void dynamicPage() {
		dynamic.naviagte_To_Dynamic_Transaction();
	}
	@Test(priority = 7)
	public void mouseEventPage() {
		mouseEvent.naviagte_To_MouseEvent_Page();
	}
	@Test(priority = 8)
	public void alertPage() throws InterruptedException {
		alert.naviagte_To_Alert_Pop_Up_Page();
	}
	@Test(priority = 9)
	public void multiWindowsPage() {
		windows.naviagte_To_MultiWindows_Page();
	}
	@Test(priority = 12)
	public void iframePage() throws InterruptedException{
		iframe.naviagte_To_Iframes_Page();
	}
	@Test(priority = 10)
	public void webTablePage() throws InterruptedException {
		table.naviagte_To_WebTable_Page();
	}
	@Test(priority = 11)
	public void progressBarPage() {
		bar.naviagte_To_ProgressBar_Page();
	}
}
