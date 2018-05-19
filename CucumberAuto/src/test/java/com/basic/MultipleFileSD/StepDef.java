package com.basic.MultipleFileSD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepDef {

	WebDriver d=null;
	
	@Before
	public WebDriver setUp(){
		if(d==null){
		System.out.println("Before in");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sandeep kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return d;
	}
	
	@After
	public void tearDown(){
		System.out.println("After in");
		d.quit();
		d=null;
	}
}
