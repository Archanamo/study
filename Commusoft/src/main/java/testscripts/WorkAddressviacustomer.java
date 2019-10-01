package testscripts;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class WorkAddressviacustomer extends commusoftannotation {

	@Test
	public void workaddressviacustomer() throws InterruptedException {
		
		
		//Add work address from customer tab
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='workAddressTab']")).click();
		driver.findElement(By.xpath("//a[@has-permission='Customersandworkaddresses,writeaccess']")).click();
		
		//Add landlord
		driver.findElement(By.id("createlandlord")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("landlord_name")).sendKeys("Test Landlord");
		driver.findElement(By.id("landlord_addressline1")).sendKeys("kk nagar");
		driver.findElement(By.xpath("//*[@id='landlordbutton']/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("workaddress_contacts_surname")).sendKeys("WA for Archana");
		driver.findElement(By.id("workaddress_addressline1")).sendKeys("work addreesline1");
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/section/form/div/button/span[1]")).click();
		Thread.sleep(5000);

		//Edit workaddress
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section[2]/div[1]/a/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("customerDetails.surname")).clear();
		driver.findElement(By.name("customerDetails.surname")).sendKeys("update workaddress");
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/div/div/div/form/div[2]/button")).click();
		Thread.sleep(5000);
		
		//Assert the actual and expected result for landloed via work address 
		String actuallandlord=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section[2]/div[2]/div/div/div[1]/div/div[1]/div[2]/span[2]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("test Test Landlord Occupier", actuallandlord);
		System.out.println("Assertion for landlord in which added via workaddress: Test Passed");	
		
		//Assert the actual and expected result for work address via customer
		String actualwaname=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section[2]/div[2]/div/div/div[1]/div/div[1]/div[3]/span[2]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("test update workaddress", actualwaname);
		System.out.println("Assertion for work address in which added via customer: Test Passed");	
		
		
	}

}
