package testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class CompanyJob extends commusoftannotation{
	
	@Test
	public void companyjob() throws InterruptedException
	{
		//Created job via company
		driver.findElement(By.xpath("//button[@id='newJob']")).click();
		driver.findElement(By.name("job[settingsjobdescriptionid]")).click();
		driver.findElement(By.xpath("//select[@id='contactid-select']/following::option[2]")).click();
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[1]/button")).click();
	
		
		//Verified company job description
		Boolean vcompnayjob=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/section/div[2]/div/div/div[1]/div/div[1]/div[3]/span[2]")).isDisplayed();
		System.out.println("Verified company Job description: " +vcompnayjob);
		
		
		//edit job
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//button[@ng-click='editJob($event, editJobForm.$valid)']")).click();	
		Thread.sleep(2000);
		
		//Redirect to Customer home page 
		//driver.findElement(By.xpath("//a[text()='Customers']")).click();
		driver.findElement(By.xpath("//*[@id='main-nav']/ul/li[1]/a")).click();
	}

}
