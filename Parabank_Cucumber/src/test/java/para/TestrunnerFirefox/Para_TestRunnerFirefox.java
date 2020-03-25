package para.TestrunnerFirefox;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\feature\\Testcase.feature",		
		glue = {"para.StepdefinitionFirefox"}		
		)
public class Para_TestRunnerFirefox
{

}
