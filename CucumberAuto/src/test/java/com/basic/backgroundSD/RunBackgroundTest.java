package com.basic.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		features={"src/test/resources/com/basic/backgroundFF/"},
		glue={"com/basic/backgroundSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/json-report/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReport.html"
				
		}
		
		)
public class RunBackgroundTest {

	
	
}
