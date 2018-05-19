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

public class DemoSD {

	WebDriver d;
	
	@Given("^User need to be on demo site page$")
	public void user_need_to_be_on_demo_site_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get("http://demo.automationtesting.in/Register.html");
		
	}
	@When("^User enter first name$")
	public void user_enter_first_name()throws Exception{
		d.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("sandy");
		Thread.sleep(2000);
		
	}
	@When("^User enters last name$")
	public void user_enters_last_name()throws Exception{
		d.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("sakku");
		Thread.sleep(2000);
		
	}

	
}
