package com.basic.MultipleFileSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MultipleFeatureStepDef1 {

	WebDriver d;
	
	public  MultipleFeatureStepDef1(StepDef step) {
		d = step.setUp();
	}
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws InterruptedException{
		d.findElement(By.id("u_0_l")).sendKeys(surName);
		Thread.sleep(1000);
	}	
	@Then("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws InterruptedException{
		String mobileActual = d.findElement(By.xpath("//*[@id='u_0_p']")).getText();
		/*Assert.assertEquals("", mobileActual);*/
		System.out.println(mobileActual);
		Thread.sleep(1000);
		d.close();
	}
}
