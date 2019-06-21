package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\Users\\vimal\\eclipse-workspace\\BDDFramework\\src\\main\\java\\Feature\\Login.feature", 
		glue = "StepDefinition", 
		plugin = {"pretty", "html:output" },
		monochrome = true, 
		dryRun = false

)

public class Runner {

}
