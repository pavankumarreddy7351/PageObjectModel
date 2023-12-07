package Automation_ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Automation_BaseClass.BaseClass;

public class RegisterPage extends BaseClass{

	By firstName=By.id("vfb-5");
	By lastName=By.id("vfb-7");
	By gender=By.id("vfb-31-1");
	By address=By.id("vfb-13-address");
	By address2=By.id("vfb-13-address-2");
	By city=By.id("vfb-13-city");
	By state=By.id("vfb-13-state");
	By pincode=By.id("vfb-13-zip");
	By countryBox=By.id("vfb-13-country");
	By gmail=By.id("vfb-14");
	By date=By.id("vfb-18");
	By hourBox=By.id("vfb-16-hour");
	By minBox=By.id("vfb-16-min");
	By phone=By.id("vfb-19");
	By cours1=By.id("vfb-20-0");
	By cours2=By.id("vfb-20-4");
	By qurey=By.id("vfb-23");
	By example=By.xpath("//label[contains(text(),'Example:')]");
	By code1=By.id("vfb-3");
	By submit=By.id("vfb-4");
	By india=By.xpath("//option[@value='India']");
	By hourTag=By.id("//option[@value='01']");
	By minTag=By.id("select2-vfb-16-min-container");

	public void filling_RegiterForm() {
		enterText(firstName,"pavan");
		Assert.assertTrue(isDisplayed(firstName),"fistname is not Displayed");
		Assert.assertTrue(isEnabled(firstName),"fistname is not Enabled");
		log("First Name input is working fine",isEnabled(firstName));

		enterText(lastName,"kumar");
		Assert.assertTrue(isDisplayed(lastName),"lastname is not Displayed");
		Assert.assertTrue(isEnabled(lastName),"lastname is not Enabled");
		log("last Name input is working fine",isEnabled(lastName));

		click(gender);
		Assert.assertTrue(isDisplayed(gender),"gender is not Displayed");
		Assert.assertTrue(isEnabled(gender),"gender is not Enabled");
		log("gender is working fine",isEnabled(gender));

		enterText(address,"vfb-13-address");
		Assert.assertTrue(isDisplayed(address),"address is not Displayed");
		Assert.assertTrue(isEnabled(address),"address is not Enabled");
		log("address is working fine",isEnabled(address));

		enterText(address2,"vfb-13-address-2");
		Assert.assertTrue(isDisplayed(address2),"address2 is not Displayed");
		Assert.assertTrue(isEnabled(address2),"address2 is not Enabled");
		log("address2 is working fine",isEnabled(address2));

		enterText(city,"vfb-13-city");
		Assert.assertTrue(isDisplayed(city),"city is not Displayed");
		Assert.assertTrue(isEnabled(city),"city is not Enabled");
		log("city is working fine",isEnabled(city));

		enterText(state,"vfb-13-state");
		Assert.assertTrue(isDisplayed(state),"state is not Displayed");
		Assert.assertTrue(isEnabled(state),"state is not Enabled");
		log("state is working fine",isEnabled(state));

		enterText(pincode,"vfb-13[zip]");
		Assert.assertTrue(isDisplayed(pincode),"pincode is not Displayed");
		Assert.assertTrue(isEnabled(pincode),"pincode is not Enabled");
		log("pincode is working fine",isEnabled(pincode));

		WebElement country=Xpath(countryBox);
		Select s1=new Select(country);

		s1.selectByVisibleText("India");
		Assert.assertTrue(isDisplayed(countryBox),"country is not displayed");
		Assert.assertTrue(isEnabled(countryBox),"country is not Enabled");
		Assert.assertTrue(isSelected(india), "Country Option is not Selected");
		log("countryBox is working fine",isEnabled(countryBox));
		
		enterText(gmail,"vfb-14@gmail.com");
		Assert.assertTrue(isDisplayed(gmail),"gmail is not dispayed");
		Assert.assertTrue(isEnabled(gmail),"gmail is not Enabled");
		log("gmail is working fine",isEnabled(gmail));

		enterText(date,"11/11/1111");
		Assert.assertTrue(isDisplayed(date),"date is not displayed");
		Assert.assertTrue(isEnabled(date),"date is not Enabled");
		log("Date is working fine",isEnabled(date));

		WebElement hour=Xpath(hourBox);
		Select s2=new Select(hour);
		s2.selectByVisibleText("01");
		Assert.assertTrue(isDisplayed(hourBox),"pincode is not displayed");
		Assert.assertTrue(isEnabled(hourBox),"pincode is not Enabled");
		
		log("Hours are working fine",isEnabled(hourBox));
		
		WebElement min=Xpath(minBox);
		Select s3=new Select(min);
		s3.selectByVisibleText("15");
		Assert.assertTrue(isDisplayed(minBox),"pincode is not displayed");
		Assert.assertTrue(isEnabled(minBox),"pincode is not Enabled");
		
		log("Minutes are working fine",isEnabled(minBox));
		
		enterText(phone,"7416410620");
		Assert.assertTrue(isDisplayed(phone),"phone is not displayed");
		Assert.assertTrue(isEnabled(phone),"phone is not Enabled");
		log("Phone Number field is working fine",isEnabled(phone));

		click(cours1);
		Assert.assertTrue(isDisplayed(cours1),"cours1 is not displayed");
		Assert.assertTrue(isEnabled(cours1),"cours1 is not Enabled");
		log("Courses1 is working fine",isEnabled(cours1));

		click(cours2);
		Assert.assertTrue(isDisplayed(cours2),"cours2 is not dispayed");
		Assert.assertTrue(isEnabled(cours2),"cours2 is not Enabled");
		log("Courses2 is working fine",isEnabled(cours2));

		enterText(qurey,"vfb-23");
		Assert.assertTrue(isDisplayed(qurey),"qurey is not displayed");
		Assert.assertTrue(isEnabled(qurey),"qurey is not Enabled");
		log("Query field is working fine",isEnabled(qurey));

		WebElement code=Xpath(example);
		String[] a=code.getText().split(":");
		System.out.println(a[1]);
		enterText(code1,a[1].trim());
		Assert.assertTrue(isDisplayed(code1),"code1 is not displayed");
		Assert.assertTrue(isEnabled(code1),"code1 is not Enabled");
		log("code is working fine",isEnabled(code1));

		
		Assert.assertTrue(isDisplayed(submit),"submit is not displayed");
		Assert.assertTrue(isEnabled(submit),"submit is not Enabled");
		click(submit);
		

	}

}
