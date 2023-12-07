package Automation_DemoWebSite;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Automation_BaseClass.BaseClass;

public class RegisterDemoSite extends BaseClass {
	@Test(priority = 1)
		public void homePage() {
		driver.get("https://vinothqaacademy.com/");
		List<WebElement> urls=driver.findElements(By.tagName("a"));
//		for(WebElement links:urls) {
//			System.out.println(links.getText());
//		}
		List<String> originalList = urls.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
			
			
		}
	@Test(priority = 2)
	public void seleniumPage() {
		WebElement selenium=driver.findElement(By.linkText("Selenium Training"));
		wait.until(ExpectedConditions.elementToBeClickable(selenium));
		driver.findElement(By.linkText("Selenium Training")).click();
		WebElement urls=driver.findElement(By.tagName("a"));
		System.out.println(urls.getText());
	}
	
  @Test(priority = 3)
  public void naviagte_To_DemoWebSite() {
	 
	 System.out.println(driver.getCurrentUrl());
	 WebElement demo=driver.findElement(By.linkText("Demo Sites"));
	 action.moveToElement(demo).build().perform();
	 WebElement auto=driver.findElement(By.linkText("Practice Automation"));
	 action.moveToElement(auto).build().perform();
	 WebElement site=driver.findElement(By.linkText("Demo Site – Registration Form"));
	 wait.until(ExpectedConditions.visibilityOf(site));
	 site.click();
	  
  }
  @Test(priority = 4)
  public void filling_RegiterForm() {
	  driver.findElement(By.id("vfb-5")).sendKeys("pavan");
	  driver.findElement(By.id("vfb-7")).sendKeys("kumar");
	  driver.findElement(By.id("vfb-31-1")).click();
	  driver.findElement(By.id("vfb-13-address")).sendKeys("vfb-13-address");
	  driver.findElement(By.id("vfb-13-address-2")).sendKeys("vfb-13-address-2");
	  driver.findElement(By.id("vfb-13-city")).sendKeys("vfb-13-city");
	  driver.findElement(By.id("vfb-13-state")).sendKeys("vfb-13-state");
	  driver.findElement(By.id("vfb-13-zip")).sendKeys("vfb-13[zip]");
	  WebElement country=driver.findElement(By.id("vfb-13-country"));
	  Select s1=new Select(country);
	  s1.selectByVisibleText("India");
	  driver.findElement(By.id("vfb-14")).sendKeys("vfb-14@gmail.com");
	  driver.findElement(By.id("vfb-18")).sendKeys("11/11/1111");
	  WebElement hour=driver.findElement(By.id("vfb-16-hour"));
	  Select s2=new Select(hour);
	  s2.selectByVisibleText("01");
	  WebElement min=driver.findElement(By.id("vfb-16-min"));
	  Select s3=new Select(min);
	  s3.selectByVisibleText("15");
	  driver.findElement(By.id("vfb-19")).sendKeys("7416410620");
	  driver.findElement(By.id("vfb-20-0")).click();
	  driver.findElement(By.id("vfb-20-4")).click();
	  driver.findElement(By.id("vfb-23")).sendKeys("vfb-23");
	  WebElement code=driver.findElement(By.xpath("//label[contains(text(),'Example:')]"));
	  String[] a=code.getText().split(":");
	  System.out.println(a[1]);
	  driver.findElement(By.id("vfb-3")).sendKeys(a[1].trim());
	  driver.findElement(By.id("vfb-4")).click();
  }
  @Test(priority = 5)
  public void validating_SuccessMessage() {
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div.e-con-inner"))));
	  WebElement message=driver.findElement(By.cssSelector("div.elementor-widget-container"));
	  System.out.println(message.getText());
	  String[] out=message.getText().split(":");
	  System.out.println(out[1].trim());
  }
}
