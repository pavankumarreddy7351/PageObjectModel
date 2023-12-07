package Automation_ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class successfull_Page extends BaseClass{
	By case1=By.cssSelector("div.e-con-inner");
	By case2=By.cssSelector("div.elementor-widget-container");
	
	
	
	public void validating_SuccessMessage() {
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(case1)));
		  WebElement message=driver.findElement(case2);
		  System.out.println(message.getText());
		  String[] out=message.getText().split(":");
		  System.out.println(out[1].trim());
	  }

}
