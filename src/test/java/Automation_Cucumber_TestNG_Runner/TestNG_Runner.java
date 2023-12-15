package Automation_Cucumber_TestNG_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\Automation_Cucumber",
				glue = "Automation_Cucumber_StepDefination"	,
				monochrome = true,
				plugin = {"pretty", "html:target/cucumberReport.html",
						"json:target/cucumberReport.json",
						"junit:target/cucumberReport.xml"},
				//without selenium goto dry run=true
				dryRun = false)
public class TestNG_Runner extends AbstractTestNGCucumberTests{

}
