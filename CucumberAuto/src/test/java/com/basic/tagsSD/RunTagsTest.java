package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome=true,
		//dryRun=true,
		//tags = {"@Important"},  //all scenario executed if this is tag for feature file
		//tags={"@Smoke"},//only ta with smoke
		//tags={"@Smoke","@Regression"},//AND Condition
		  tags={"@Smoke,@Regression"},//OR Condition
		features={"src/test/resources/com/basic/tagsFF/"},
		glue={"com/basic/tagsSD/"},
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport8",
				"json:target/json-reports/cucumber-report8.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReport8.html"
		}
		
		)
public class RunTagsTest {

	
	
}
