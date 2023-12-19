package Automation_ObjectPages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class SeleniumTrainingPage extends BaseClass{
	By seleniumTrain=By.linkText("Selenium Online Training");
	By tageName=By.tagName("a");
	public void seleniumPageLinks() {
		WebElement selenium=Xpath(seleniumTrain);
		wait.until(ExpectedConditions.elementToBeClickable(selenium));
		click(seleniumTrain);
		List<WebElement> urls=driver.findElements(tageName);
//		for(WebElement links:urls) {
//			System.out.println(links.getText());
//		}
		List<String> originalList = urls.stream().map(s -> s.getText()).collect(Collectors.toList());
		System.out.println(originalList);
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
	}

}
