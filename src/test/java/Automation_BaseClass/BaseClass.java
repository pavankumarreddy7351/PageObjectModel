package Automation_BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import Automation_CommonMethods.Common_Methods;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.internal.shadowed.jackson.core.type.TypeReference;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

public class BaseClass extends Common_Methods{
	
	@BeforeSuite
	public BaseClass launchApplication() throws IOException {
		prop = new Properties();
		File proFile = new File(
				System.getProperty("user.dir") + "\\src\\test\\java\\Properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(proFile);
		prop.load(fis);
		testData = new Properties();
		File testDataFile = new File(
				System.getProperty("user.dir") + "\\src\\test\\java\\Automation_TestData\\TestData.properties");
		FileInputStream testDataFileFIS = new FileInputStream(testDataFile);
		testData.load(testDataFileFIS);
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		action =new Actions(driver);
		
		wait = new WebDriverWait(driver, 10);
		driver.get(prop.getProperty("URL"));
		return null;

	}

	public List<HashMap<String, String>> getJsonDataToMap(String path) throws IOException {

		// read json data to string
		String jsonConnect = FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8);

		// String to HashMap jackson databind

		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonConnect,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return data;
	}

	public String getScreenShot(String testCaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";

	}

	@AfterSuite
	public void closeApplication() {
		driver.quit();
	}

}
