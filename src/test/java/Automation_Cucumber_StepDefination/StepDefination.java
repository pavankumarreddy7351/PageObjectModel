package Automation_Cucumber_StepDefination;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Automation_BaseClass.BaseClass;
import Automation_ObjectManager.PageObjectManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.internal.shadowed.jackson.core.type.TypeReference;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

public class StepDefination extends PageObjectManager {
	public BaseClass base;
	@Before
	public void launchDemoApplication() throws IOException {
		base=launchApplication();
	}

	@Given("navigate to homePage")
	public void navigate_to_home_page() {
		home.homePage_Links();

	}

	@Then("get all links in seleniumPage")
	public void get_all_links_in_selenium_page() {
		selenium.seleniumPageLinks();
	}

	@When("navigate to demoPage")
	public void navigate_to_demo_page() {
		demo.naviagte_To_DemoWebSite();
	}

	@And("register the formPage")
	public void register_the_form_page() {
		register.filling_RegiterForm(testData.getProperty("firstName"), testData.getProperty("lastName"), testData.getProperty("address"), testData.getProperty("streetAddress"), testData.getProperty("city"), testData.getProperty("state"), testData.getProperty("pincode"), testData.getProperty("Country"), testData.getProperty("gmail"), testData.getProperty("date"), testData.getProperty("hour"), testData.getProperty("minute"), testData.getProperty("phone"), testData.getProperty("Query"));
	}

	@Then("get the transactioId")
	public void get_the_transactio_id() {
		success.validating_SuccessMessage();
	}

	@And("move to dynamicaPage")
	public void move_to_dynamica_page() {
		dynamic.naviagte_To_Dynamic_Transaction();
	}

	@Then("navigate to mouseEventPage")
	public void navigate_to_mouse_event_page() {
		mouseEvent.naviagte_To_MouseEvent_Page();
	}

	@And("navigate to alertPage")
	public void navigate_to_alert_page() throws InterruptedException {
		alert.naviagte_To_Alert_Pop_Up_Page();
	}

	@Then("naviagte to multiWindowsPage")
	public void naviagte_to_multi_windows_page() {
		windows.naviagte_To_MultiWindows_Page();
	}

	@And("navigate to iframePage")
	public void navigate_to_iframe_page() throws InterruptedException {
		bar.naviagte_To_ProgressBar_Page();
	}

	@Then("navigate to webTablePage")
	public void navigate_to_web_table_page() throws InterruptedException {
		table.naviagte_To_WebTable_Page();
	}

	@And("navigate to progressBarPage")
	public void navigate_to_progress_bar_page() throws InterruptedException {
		
		iframe.naviagte_To_Iframes_Page();
	}

	@After
	public void closeApplication() {
		driver.close();
	}

}
