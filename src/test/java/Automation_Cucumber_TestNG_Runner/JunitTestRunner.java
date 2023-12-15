package Automation_Cucumber_TestNG_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\Automation_Cucumber\\NexGen_EndToEnd.feature", glue = "Automation_Cucumber_StepDefination", monochrome = true, plugin = {
		"pretty", "html:target/cucumberJunitReport.html", "json:target/cucumberJunitReport.json",
		"junit:target/cucumberJuintReport.xml" }, dryRun = true

)

public class JunitTestRunner {

}
