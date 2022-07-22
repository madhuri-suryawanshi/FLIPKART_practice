package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
			
		plugin="pretty",
		features="src/test/resources/BusinessLOGIC",
		tags="@SmokeTest",
		glue="cucumbermap",
		monochrome=true
		
	)
	

	
	
	
public class RunTest 
{

}
