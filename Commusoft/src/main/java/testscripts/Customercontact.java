package testscripts;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class Customercontact extends commusoftannotation {

	@Test
	public void customercontact() throws InterruptedException {
	
		//Add contact
		driver.findElement(By.xpath("//a[@id='contactsTab']")).click();
		driver.findElement(By.linkText("Add new contact")).click();
		driver.findElement(By.id("contact_surname")).sendKeys("Sasvitha");
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div/button")).click();
		Thread.sleep(2000);
		
		/*
		//Verified added contact via customer
		System.out.println("Verified added contact via customer tab:");
		Boolean vcustcontactname=driver.findElement(By.xpath("//td[@class='ng-binding']")).isDisplayed();
		System.out.println("Verified contact name: " +vcustcontactname);
		*/
		
		//Assert the actual and expected result for customer contact name
		String actualccontact=driver.findElement(By.xpath("//*[@id='sortables']/tbody/tr[2]/td[2]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("test Sasvitha", actualccontact);
		System.out.println("Assertion for customer contact name in which added : Test Passed");	
		
		/*
		//Edit Contact
		driver.findElement(By.xpath("//a[@has-permission='Customercontacts,updateaccess']")).click();
		driver.findElement(By.name("contactName")).sendKeys("update");
		driver.findElement(By.xpath("//button[@ng-click='editContact($event, editContactForm.$valid)']")).click();
		
		//Verified updated contact via customer
		Boolean vcustupcontactname=driver.findElement(By.xpath("//td[@class='ng-binding']")).isDisplayed();
		System.out.println("Verify updated customer contact name: " +vcustupcontactname);
		*/
	}

}
