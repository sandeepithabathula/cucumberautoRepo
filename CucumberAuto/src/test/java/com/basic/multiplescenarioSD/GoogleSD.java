package com.basic.multiplescenarioSD;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSD {

	WebDriver d=null;
	
	@Given("^User need to be on google page$")
	public void user_need_to_be_on_google_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.google.com");
		
	}
	@When("^User enters seach string$")
	public void user_enters_seach_string()throws Exception{
		d.findElement(By.id("lst-ib")).sendKeys("selenium");
		Thread.sleep(2000);
		
	}

	
}
