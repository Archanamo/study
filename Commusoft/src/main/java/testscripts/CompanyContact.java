package testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class CompanyContact extends commusoftannotation {
	
	@Test
	public void companycontact() throws InterruptedException
	{
		//Go to Contacts tab
		driver.findElement(By.id("contactsTab")).click();
				
		//Create contact via company
		driver.findElement(By.xpath("//a[text()='Add new contact']")).click();
		driver.findElement(By.id("contact_surname")).sendKeys("Sasvin");
		driver.findElement(By.xpath("//span[text()='Add contact']")).click();
		
		/*
		//Verify the element for company contact details 
		Boolean vcompnaycontact=driver.findElement(By.xpath("//*[@id='sortables']/tbody/tr/td[2]")).isDisplayed();
		System.out.println("Verified company contact name: " +vcompnaycontact);
		*/
		
		//Assert the actual and expected result for company contact name
		String actualcompcontact=driver.findElement(By.xpath("//*[@id='sortables']/tbody/tr/td[2]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("test Sasvin", actualcompcontact);
		System.out.println("Assertion for company contact name in which added: Test Passed");	
		
		
		//Redirect from contact tab to property tab 
		driver.findElement(By.xpath("//span[text()='Property']")).click();
	}

}
