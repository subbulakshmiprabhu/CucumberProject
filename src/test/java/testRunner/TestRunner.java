package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		features = {"./src/test/resources/featurefiles/orangehrm_11Am.feature","./src/test/resources/featurefiles/fbLogin.feature"},
		glue = "stepDefinition",
		publish = true,
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:target/ouput.html", "junit:target/output.xml", "json:target/output.json"},
		//tags =("@smoke and @sanity") 
		tags = ("not @sanity")
		
		)




public class TestRunner {

}
