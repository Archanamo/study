package com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class commonfn {
	public RemoteWebDriver driver;
	
  @BeforeMethod
  public void f() {
	  /*
	//login for commusoft
		driver.findElementById("logintype_clientid").sendKeys("16865");
		driver.findElementById("logintype_username").sendKeys("archana");
		driver.findElementById("logintype_password").sendKeys("archana123");
		driver.findElementByXPath("//*[@id='successful-login']/span[1]").click();; 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  	driver = new ChromeDriver();
		driver.get("https://dev.commusoft.co.uk/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  //Close the browser
	  driver.quit(); */
	

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://dev.commusoft.co.uk/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	//Login for commusoft
	driver.findElementById("logintype_clientid").sendKeys("16865");
	driver.findElementById("logintype_username").sendKeys("archana");
	driver.findElementById("logintype_password").sendKeys("archana123");
	driver.findElementByXPath("//*[@id='successful-login']/span[1]").click();

	  
	  
  }

}
