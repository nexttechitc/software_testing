package RobertTestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (

		features = {"RobertFeatures"}, // Feature File Folder Name
		glue = {"RobertStepdef"},// StepDeffination Package name
				
		tags= {"@Jahan"}
		)

public class RobertTestRunner extends AbstractTestNGCucumberTests{

}
