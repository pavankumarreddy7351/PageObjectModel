package Automation_ObjectPages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Automation_BaseClass.BaseClass;

public class HomePage extends BaseClass{
	By tageName=By.tagName("a");
	
	public void homePage_Links() {
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
