package CucumberTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/CreateAzureVirtualServer", 
	glue= {"Def_CreateAzureVirtualServerWindows"}
		
		)
public class CT_CreateAzureVirtualServerWindows {

}
