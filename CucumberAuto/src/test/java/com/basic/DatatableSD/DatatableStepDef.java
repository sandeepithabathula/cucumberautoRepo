package com.basic.DatatableSD;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DatatableStepDef {

	WebDriver d=null;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	@And("^User enters user \"([^\"]*)\" surname$")
	public void user_enters_user_surname(String surName) throws InterruptedException{
		d.findElement(By.id("u_0_l")).sendKeys(surName);
		Thread.sleep(1000);
	}	
	@But("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() throws InterruptedException{
		String mobileActual = d.findElement(By.xpath("//*[@id='u_0_p']")).getText();
		/*Assert.assertEquals("", mobileActual);*/
		System.out.println(mobileActual);
		Thread.sleep(1000);
	}
	@Then("^close browser$")
	 public void close_browser(){
		d.quit();
		
	}
	@When("^Enter following data$")
	public void enter_following_data(DataTable table) throws InterruptedException{
		List<List<String>> data = table.raw();
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1);
		String values3 = data.get(0).get(2);
		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		String values6 = data.get(1).get(2);
		d.findElement(By.name("firstname")).sendKeys(values4);
		d.findElement(By.id("u_0_l")).sendKeys(values5);
		Thread.sleep(2000);
		
	}
	

}
