package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFile",glue="stepDefinations",format={"pretty","html:target/CucumberReports"})
public class CRMTestRunner 
{
	
}
