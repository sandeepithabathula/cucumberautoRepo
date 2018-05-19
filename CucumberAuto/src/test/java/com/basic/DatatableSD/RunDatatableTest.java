package com.basic.DatatableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		features={"src/test/resources/com/basic/DatatableFF/"},
		glue={"com/basic/DatatableSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport2",
				"json:target/json-reports/cucumber-report2.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReport2.html"

		}
		
		)
public class RunDatatableTest {

	
	
}
