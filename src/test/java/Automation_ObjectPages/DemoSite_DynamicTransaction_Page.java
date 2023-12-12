package Automation_ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class DemoSite_DynamicTransaction_Page extends BaseClass {
	By demo1 = By.linkText("Demo Sites");
	By auto1 = By.linkText("Practice Automation");
	By dynamic = By.linkText("Demo Site – Dynamic Transaction");
	By trans=By.cssSelector(".elementor-widget-container");

	public void naviagte_To_Dynamic_Transaction() {

		System.out.println(getURL());
		WebElement demo = Xpath(demo1);
		action.moveToElement(demo).build().perform();
		WebElement auto = Xpath(auto1);
		action.moveToElement(auto).build().perform();

		WebElement dynamicTrans = Xpath(dynamic);
		wait.until(ExpectedConditions.visibilityOf(dynamicTrans));
		dynamicTrans.click();
		WebElement code=Xpath(trans);
		String[] text=code.getText().split(":");
		System.out.println("Transaction No: "+text[1].trim());
	}

}
