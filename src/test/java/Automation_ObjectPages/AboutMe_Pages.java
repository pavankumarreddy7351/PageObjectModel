package Automation_ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Automation_BaseClass.BaseClass;

public class AboutMe_Pages extends BaseClass{
	By about=By.xpath("(//a[contains(text(),'About Me')])[2]");
	By test=By.linkText("Testimonials");
	By test1=By.linkText("TechTalk");
	By test2=By.linkText("LinkedIn Profile");
	By tuto=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Tutorials')]");
	By python=By.linkText("Python for Automation");
	By tube=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Free YouTube Courses')]");
	By qA=By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'QA and AI Technology')]");
	By manual=By.linkText("Manual Testing");
	By auto=By.linkText("Java For Automation");
	By selenium=By.linkText("Selenium Webdriver");
	By testNg=By.linkText("TestNG");
	
	
	public void navigate_To_TestimonialsPage() {
		WebElement aboutMe=Xpath(about);
		action.moveToElement(aboutMe).build().perform();
		WebElement testimonials=Xpath(test);
		action.moveToElement(testimonials).build().perform();
		click(test);
		System.out.println(getURL());
	}
	public void navigate_To_TechTalk_Page() {
		WebElement aboutMe=Xpath(about);
		action.moveToElement(aboutMe).build().perform();
		WebElement testimonials=Xpath(test1);
		action.moveToElement(testimonials).build().perform();
		click(test1);
		System.out.println(getURL());
	}

	public void navigate_To_PythonForAutomation_Page() {
		WebElement aboutMe=Xpath(tuto);
		action.moveToElement(aboutMe).build().perform();
		WebElement testimonials=Xpath(python);
		action.moveToElement(testimonials).build().perform();
		click(python);
		System.out.println(getURL());
	}
	public void navigate_To_FreeYouTubeCoursesManual_Page() {
		WebElement aboutMe=Xpath(tube);
		action.moveToElement(aboutMe).build().perform();
		WebElement testimonials=Xpath(qA);
		action.moveToElement(testimonials).build().perform();
		WebElement maunalTest=Xpath(manual);
		action.moveToElement(maunalTest).build().perform();
		click(manual);
		System.out.println(getURL());
	}
	public void navigate_To_FreeYouTubeCoursesAutomation_Page() {
		WebElement aboutMe=Xpath(tube);
		action.moveToElement(aboutMe).build().perform();
		WebElement testimonials=Xpath(qA);
		action.moveToElement(testimonials).build().perform();
		WebElement maunalTest=Xpath(auto);
		action.moveToElement(maunalTest).build().perform();
		click(auto);
		System.out.println(getURL());
	}
	public void navigate_To_FreeYouTubeCoursesSeleniumWebDriver_Page() {
		WebElement aboutMe=Xpath(tube);
		action.moveToElement(aboutMe).build().perform();
		WebElement testimonials=Xpath(qA);
		action.moveToElement(testimonials).build().perform();
		WebElement maunalTest=Xpath(selenium);
		action.moveToElement(maunalTest).build().perform();
		click(selenium);
		System.out.println(getURL());
	}
	public void navigate_To_FreeYouTubeCoursesTestNG_Page() {
		WebElement aboutMe=Xpath(tube);
		action.moveToElement(aboutMe).build().perform();
		WebElement testimonials=Xpath(qA);
		action.moveToElement(testimonials).build().perform();
		WebElement maunalTest=Xpath(testNg);
		action.moveToElement(maunalTest).build().perform();
		click(testNg);
		System.out.println(getURL());
	}
	

}
