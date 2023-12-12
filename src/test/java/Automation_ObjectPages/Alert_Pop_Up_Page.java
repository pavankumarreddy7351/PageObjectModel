package Automation_ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class Alert_Pop_Up_Page extends BaseClass {
	By demo1 = By.linkText("Demo Sites");
	By auto1 = By.linkText("Practice Automation");
	By popUp = By.linkText("Demo Site – Alert and Popup");
	By alertButton = By.cssSelector("button[name='alertbox']");
	By confirm = By.name("confirmalertbox");
	By prompt = By.name("promptalertbox1234");

	public void naviagte_To_Alert_Pop_Up_Page() throws InterruptedException {

		System.out.println(getURL());
		WebElement demo = Xpath(demo1);
		action.moveToElement(demo).build().perform();
		WebElement auto = Xpath(auto1);
		action.moveToElement(auto).build().perform();
		WebElement popEvent = Xpath(popUp);
		wait.until(ExpectedConditions.visibilityOf(popEvent));
		click(popUp);
		Thread.sleep(1000);
		
		click(alertButton);
		switchToAlert();
		Thread.sleep(1000);
		alertAccept();
		
		Thread.sleep(1000);
		click(confirm);
		Thread.sleep(1000);
		switchToAlert();
		Thread.sleep(1000);
		alertDismiss();
		Thread.sleep(1000);
		click(confirm);
		Thread.sleep(1000);
		switchToAlert();
		Thread.sleep(1000);
		alertAccept();
		Thread.sleep(1000);
		click(prompt);
		Thread.sleep(1000);
		switchToAlert();
		Thread.sleep(1000);
		alertSendKeys("Yes");
		Thread.sleep(1000);
		alertAccept();
		refresh();

	}

}
