package testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class AddCompany extends commusoftannotation{

	@Test
	public void addcompany() throws InterruptedException
	{
		//Create company
		driver.findElement(By.id("customertypecompany")).click();
		driver.findElement(By.id("company_contacts_companyname")).sendKeys("STAR SYSTEM INDIA PRIVATE LIMITED");
		driver.findElement(By.id("company_addressline1")).sendKeys("west street");
		driver.findElement(By.id("company_contacts_contactsemail_emailaddress")).sendKeys("archana@commusoft.co.uk");
		driver.findElement(By.xpath("//span[text()='Add Company']")).click();
		
		/*
		//Verified added element 
		Boolean vcompanyname=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[1]/div[3]/span[2]")).isDisplayed();
		System.out.println("Verified company name: " +vcompanyname);
		*/
		
		//Assert the actual and expected result for company name
		String actualcompname=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[1]/div[3]/span[2]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("STAR SYSTEM INDIA PRIVATE LIMITED", actualcompname);
		System.out.println("Assertion for company name in which added: Test Passed");	
	}

}
