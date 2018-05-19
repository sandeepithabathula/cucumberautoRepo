package com.basic.multiplescenarioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		features={"src/test/resources/com/basic/MultipleScenarioFF/"},
		glue={"com/basic/multiplescenarioSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport6",
				"json:target/json-reports/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReport6.html"

		}
		
		)
public class RunMyMultipleSDTst {

	
	
}
