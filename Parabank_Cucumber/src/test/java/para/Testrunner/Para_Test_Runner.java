package para.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\feature\\Testcase.feature",		
		glue = {"para.Stepdefinition"}		
		)

public class Para_Test_Runner 
{

}
