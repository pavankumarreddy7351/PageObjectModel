package Automation_CommonMethods;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;

public class Common_Methods {
	public static WebDriver driver;
	public static Actions action;
	public static ChromeOptions options;
	public static WebDriverWait wait;
	public static Properties prop;
	public static ExtentReports extent;

	public static WebElement Xpath(By Xpath) {
		return driver.findElement(Xpath);
	}

	public static void enterText(By Xpath, String text) {
		driver.findElement(Xpath).sendKeys(text);
	}

	public static String getText(By Xpath) {
		return driver.findElement(Xpath).getText();
	}

	public static void click(By Xpath) {
		driver.findElement(Xpath).click();
	}

	public static void clear(By Xpath) {
		driver.findElement(Xpath).clear();
	}

	public static void getAttribute(By Xpath, String getText) {
		driver.findElement(Xpath).getAttribute(getText);
	}

	public static String getURL() {
		return driver.getCurrentUrl();
	}
	public static boolean isDisplayed(By Xpath) {
		return driver.findElement(Xpath).isDisplayed();
	}
	public static boolean isEnabled(By Xpath) {
		return driver.findElement(Xpath).isEnabled();
	}
	public static boolean isSelected(By Xpath) {
		return driver.findElement(Xpath).isSelected();
	}
	public static void actionClick(By Xpath) {
		action = new Actions(driver);
		WebElement element = driver.findElement(Xpath);
		action.moveToElement(element).click().perform();
	}
	public void log(String string, boolean b ) {
		Reporter.log(string, b);
	}

	public static void refresh() {
		driver.navigate().refresh();
	}
}
