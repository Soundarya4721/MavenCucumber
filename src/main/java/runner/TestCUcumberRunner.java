package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
	features ="/Users/ltatavarthy/EclipsPractice/Maven_Cucumber/src/main/java/feature/contact.feature",//path of feature file
			glue={"stepDefinitions"},//path of step definition file
	      format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//format of reports
	    monochrome = true, //display the console output in a proper readable format
	  	//strict = true, //it will check if any step is not defined in step definition file
	  dryRun = false//to check the mapping is proper between feature file and step def file
	  			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
	
)
public class TestCUcumberRunner {
	

}
