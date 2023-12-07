package Automation_ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class Navigate_To_DemoPage extends BaseClass{
	
	By demo1=By.linkText("Demo Sites");
	By auto1=By.linkText("Practice Automation");
	By site1=By.linkText("Demo Site – Registration Form");
	
	
	public void naviagte_To_DemoWebSite() {
		 
		 System.out.println(getURL()); 
		 WebElement demo=Xpath(demo1);
		 action.moveToElement(demo).build().perform();
		 WebElement auto=Xpath(auto1);
		 action.moveToElement(auto).build().perform();
		 WebElement site=Xpath(site1);
		 wait.until(ExpectedConditions.visibilityOf(site));
		 site.click();
		  
	  }

}
