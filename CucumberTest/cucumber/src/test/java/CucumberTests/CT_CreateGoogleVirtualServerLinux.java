package CucumberTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/CreateGoogleVirtualServer", 
	glue= {"Def_CreateGoogleVirtualServerLinux"}
		
		)
public class CT_CreateGoogleVirtualServerLinux {

}
