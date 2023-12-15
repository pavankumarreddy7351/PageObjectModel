package Automation_PageObject_TestCases;

import org.testng.annotations.Test;

import Automation_ObjectManager.PageObjectManager;

public class About_This_PageTest extends PageObjectManager {

	@Test(priority = 1)
	public void testominalPageTest() {
		test.navigate_To_TestimonialsPage();
	}
	@Test(priority = 2)
	public void techTalkPage() {
		test.navigate_To_TechTalk_Page();
	}
	
	@Test(priority = 3)
	public void YoutubePage() {
		test.navigate_To_FreeYouTubeCoursesManual_Page();
		test.navigate_To_FreeYouTubeCoursesAutomation_Page();
		test.navigate_To_FreeYouTubeCoursesSeleniumWebDriver_Page();
		test.navigate_To_FreeYouTubeCoursesTestNG_Page();
	}
}
