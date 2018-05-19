package com.basic.FirstFeatureFile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {

	WebDriver d;
	
	@Given("^user login to the facebook page$")
	public void when_user_login_to_the_facebook_page(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
	}
	
	@When("^User need to enter first name$")
	public void user_need_to_enter_first_name()throws Exception{
		d.findElement(By.id("u_0_j")).sendKeys("sandy");
		Thread.sleep(1000);
	}
	
	@Then("^user need to enter user surname$")
	public void user_need_to_enter_user_surname(){
		d.findElement(By.id("u_0_l")).sendKeys("selenium babu");
		d.close();
	}

}
