package com.basic.datadrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		features={"src/test/resources/com/basic/datadrivenFF/"},
		glue={"com/basic/datadrivenSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport1",
				"json:target/json-reports/cucumber-report1.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReport1.html"
		}
		
		)
public class RunDatadrivenTest {

	
	
}
