package com.basic.MultipleFileSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleFeatureStepDef {

	WebDriver d;
	
	public  MultipleFeatureStepDef(StepDef step) {
		d = step.setUp();
	}
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		d.get("https://www.facebook.com/");
	}
	@When("^User enters user \"([^\"]*)\" first name$")
	public void user_enters_user_first_name(String userName) throws InterruptedException {
		d.findElement(By.name("firstname")).sendKeys(userName);
		Thread.sleep(1000);
	}
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void user_checks_user_first_name_is_present(String name) throws InterruptedException {
		String userNameActual = d.findElement(By.name("firstname")).getText();
		//Assert.assertEquals(name, userNameActual);
		System.out.println(userNameActual);
		Thread.sleep(1000);	
    }
	

}
