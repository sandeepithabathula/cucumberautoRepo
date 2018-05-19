package com.basic.MultipleFileSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		features={"src/test/resources/com/basic/SingleFuturesandmultipleStepdefFF/"},
		glue={"com/basic/MultipleFileSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport5",
				"json:target/json-reports/cucumber-report5.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReport5.html"

		}
		
		)
public class RunMultipleStepDefTest {

	
	
}
