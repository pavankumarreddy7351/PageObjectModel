package Automation_ObjectPages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class WebTable_Page extends BaseClass{
	By demo1 = By.linkText("Demo Sites");
	By auto1 = By.linkText("Practice Automation");
	By webTable=By.linkText("Demo Site – WebTable");
	By table=By.cssSelector("(//table)[1]");
	
	public void naviagte_To_WebTable_Page() throws InterruptedException {
		WebElement demo = Xpath(demo1);
		action.moveToElement(demo).build().perform();
		WebElement auto = Xpath(auto1);
		action.moveToElement(auto).build().perform();
		click(webTable);
		Thread.sleep(2000);
		 // Assuming the table has rows represented by <tr> and cells by <td>
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[1]/div/div/div/div/div/table"));

        // Extract data using streams
        List<String> rowData = rows.stream()
                .map(row -> row.findElements(By.tagName("td")))
                .flatMap(cells -> cells.stream())
                .map(WebElement::getText)
                .collect(Collectors.toList());

        // Print the extracted data
        rowData.forEach(System.out::println);
        Thread.sleep(1000);
        refresh();

		
	}

}
