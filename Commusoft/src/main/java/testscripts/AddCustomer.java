package testscripts;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import org.testng.Assert;
import wrapper.commusoftannotation;

public class AddCustomer extends commusoftannotation {

	@Test
	public void addcustomer() throws InterruptedException {
		
		//Create customer
		Thread.sleep(3000);
		//driver.findElement(By.id("customertypecustomer")).click();
		driver.findElement(By.xpath("//a[@id='customertypecustomer']")).click();
		WebElement src=driver.findElement(By.id("customertype_contacts_settingsTitlesid"));
		Select dd=new Select(src);
		dd.selectByVisibleText("Mrs");
		
		driver.findElement(By.name("customertype[contacts][surname]")).sendKeys("Lithisha");
		driver.findElement(By.name("customertype[addressline1]")).sendKeys("31st Cross street");
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/section/div/div/section/form/div/button")).click();
		Thread.sleep(3000);
		
		
		//Verified added element for customer details
		System.out.println("Verify added customer details");	
		Boolean vcustomername=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[1]/div[2]/span[2]")).isDisplayed();
		System.out.println("Verified customer surname: " +vcustomername);
		
		
		//Edit customer
		driver.findElement(By.xpath("//*[@id='editcustomer']/span")).click();
		//driver.findElementByXPath("//a[@id='editcustomer']").click();
		driver.findElement(By.name("customerDetails.surname")).sendKeys(" Sri ");
		driver.findElement(By.name("customerMobileNumber")).sendKeys("3445345");
		driver.findElement(By.name("customerEmail")).sendKeys("archana@commusoft.co.uk");
		driver.findElement(By.xpath("//button[@class='btn btn-primary loading_btn save_btn']")).click();
		Thread.sleep(4000);
		
		
		//Verified updated customer details
		System.out.println("Verify updated customer details");	
		Boolean vupdatesurname=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[1]/div[2]/span[2]")).isDisplayed();
		System.out.println("Verified updated surname: " +vupdatesurname);
		Boolean vcustmobileno=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[2]/div[2]/span[2]/ul/li[1]")).isDisplayed();
		System.out.println("Verified updated mobileno: " +vcustmobileno);
		Boolean vcustemail=driver.findElement(By.xpath("(//span[@class='ng-binding'])[10]")).isDisplayed();
		System.out.println("Verified updated email: " +vcustemail); 
		
		
		/*
		//Assert the actual and expected result for customer name
		String actualcname=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[1]/div[2]/span[2]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("Mrs  Lithisha Sri", actualcname);
		System.out.println("Assertion for customer in which updated: Test Passed");		
		*/
	}

}
