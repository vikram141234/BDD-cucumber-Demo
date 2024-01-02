package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {".\\src\\test\\java\\featureFiles\\login.feature"},
		glue = {"stepDefinitions"},
		monochrome = true,
		plugin = {"pretty","html:vtigerExecutionReport.html"},
		dryRun = false    //true will not launch the browser but it will generate the 
		                 //stepDefinitions for feature file loaded
		
	  )


public class RunnerIO extends AbstractTestNGCucumberTests{

}
