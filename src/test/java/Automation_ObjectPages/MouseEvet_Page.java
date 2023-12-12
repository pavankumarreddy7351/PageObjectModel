package Automation_ObjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Automation_BaseClass.BaseClass;

public class MouseEvet_Page extends BaseClass {
	By demo1 = By.linkText("Demo Sites");
	By auto1 = By.linkText("Practice Automation");
	By mouse = By.linkText("Demo Site – Mouse Event");
	By text = By.id("textbox");
	By doubleClick = By.id("dblclick");
	By right = By.id("rightclick");
	By drag = By.id("draggableElement");
	By drop = By.id("droppableElement");

	public void naviagte_To_MouseEvent_Page() {

		System.out.println(getURL());
		WebElement demo = Xpath(demo1);
		action.moveToElement(demo).build().perform();
		WebElement auto = Xpath(auto1);
		action.moveToElement(auto).build().perform();
		WebElement mouseEvent = Xpath(mouse);
		wait.until(ExpectedConditions.visibilityOf(mouseEvent));
		click(mouse);
		enterText(text, "MouseEvent");
		WebElement a = Xpath(doubleClick);
		action.doubleClick(a).build().perform();
		WebElement rightClick = Xpath(right);
		action.contextClick(rightClick).build().perform();
		WebElement dragElement = Xpath(drag);
		WebElement dropElement = Xpath(drop);
		action.dragAndDrop(dragElement, dropElement);

	}

}
