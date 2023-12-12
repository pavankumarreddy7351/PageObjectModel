package Automation_ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class ProgressBar_Page extends BaseClass{
	By demo1 = By.linkText("Demo Sites");
	By auto1 = By.linkText("Practice Automation");
	By progressBar=By.linkText("Demo Site – Progress Bar");
	By start =By.id("start");
	By content=By.id("content");
	
	public void naviagte_To_ProgressBar_Page() {

		System.out.println(getURL());
		WebElement demo = Xpath(demo1);
		action.moveToElement(demo).build().perform();
		WebElement auto = Xpath(auto1);
		action.moveToElement(auto).build().perform();
		WebElement progress = Xpath(progressBar);
		wait.until(ExpectedConditions.visibilityOf(progress));
		click(progressBar);
		click(start);
		WebElement contents=Xpath(content);
		wait.until(ExpectedConditions.visibilityOf(contents));
		getText(content);
		System.out.println(Xpath(content).getText());
		
	}
}
