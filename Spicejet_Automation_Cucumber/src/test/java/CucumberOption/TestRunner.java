package CucumberOption;





import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features_Files" ,glue="StepDefinations")

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
	

}
