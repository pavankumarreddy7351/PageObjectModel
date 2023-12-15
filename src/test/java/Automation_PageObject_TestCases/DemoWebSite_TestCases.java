package Automation_PageObject_TestCases;

import static org.junit.Assume.assumeFalse;

import org.testng.annotations.Test;

import Automation.PageObjectModal.Utilites.DataDrivenTesting_AccessExcel;
import Automation_ObjectManager.PageObjectManager;

public class DemoWebSite_TestCases extends PageObjectManager {
	@Test(priority = 13)
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

	@Test(dataProviderClass = DataDrivenTesting_AccessExcel.class, dataProvider = "testdata", priority = 4, enabled = true)
	public void TestData(String firstName, String lastName, String address, String streetAddress,
			String city, String state, String pincode, String Country, String gmail, String date, String hour,
			String minute, String phone, String Query) {
		register.filling_RegiterForm(firstName, lastName, address, streetAddress, city, state, pincode, Country, gmail, date, hour, minute, phone, Query);
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
