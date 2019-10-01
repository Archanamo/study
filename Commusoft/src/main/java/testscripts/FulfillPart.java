package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class FulfillPart extends commusoftannotation{
	@Test
	public void fulfillpart() throws InterruptedException
    {
		//Solr serach by job number
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("1005",Keys.ENTER);
		
		driver.findElement(By.linkText("1005")).click();	
		//driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/section/div[2]/div[2]/section[3]/table/tbody/tr/td[1]/a")).click();
		Thread.sleep(3000);	
		
		
		//parts tab
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[3]/a/span[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Requested']")).click();
		
		//driver.findElement(By.xpath("//*[@id='actions-dropdown']/ng-include/span")).click();
		
		driver.findElement(By.xpath("//span[@class='preview-file-link actions-toggle ng-scope ss-plus']")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//*[@id='actions-dropdown']/ng-include/div/span[1]/span[1]/a")).click();
		driver.findElement(By.xpath("//a[text()='Fulfill part']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='allocation']")).clear();
		driver.findElement(By.xpath("//input[@name='allocation']")).sendKeys("2");
		//driver.findElement(By.xpath("//input[@name='allocation']")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id='page-panel-main']/section/div[2]/div/div[4]/div[1]/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id='page-panel-main']/section/div[2]/div/div[4]/div[1]/div[1]/input")).sendKeys("3");
		Thread.sleep(3000);
		driver.findElement(By.id("save-panel-btn")).click();
		//driver.findElement(By.xpath("//*[@id='save-panel-btn']")).click();
		Thread.sleep(4000);
	
		//on order via fulfill part
		driver.findElement(By.xpath("//span[text()='Please select a supplier']")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("arch");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(Keys.ENTER);
		Actions actnm=new Actions(driver);
		actnm.doubleClick(driver.findElement(By.xpath("//*[@id='job_part_new_purchase_order']/div[1]/div/div/div/table/tbody/tr/td[6]"))).perform();
		driver.findElement(By.xpath("//*[@id='job_part_new_purchase_order']/div[1]/div/div/div/table/tbody/tr/td[6]")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[3]/a/span[1]")).click();
    
    
    /*
    //Assertion for part status as 'Available'
    String getpartstatus=driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/div/table/tbody/tr[1]/td[8]/span")).getText();
    Thread.sleep(3000);
    Assert.assertEquals("Available", getpartstatus);
    System.out.println("Assertion for part status as available: Test Passed");
    
    //Assertion for part status as 'Onorder'
    String getpartstatusonorder=driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/div/table/tbody/tr[2]/td[8]/span")).getText();
    Thread.sleep(3000);
    Assert.assertEquals("On Order", getpartstatusonorder);
    System.out.println("Assertion for part status as onorder: Test Passed");
    */
    }
	
}
