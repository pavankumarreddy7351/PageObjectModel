package Automation_PageObject_TestCases;

import static org.junit.Assume.assumeFalse;

import org.testng.annotations.Test;

import Automation_ObjectManager.ObjectManager;

public class DemoWebSite_TestCases extends ObjectManager {
	@Test(alwaysRun = false)
	public void homePage() {
		//home.homePage_Links();
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

}
