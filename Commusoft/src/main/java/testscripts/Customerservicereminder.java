package testscripts;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class Customerservicereminder extends commusoftannotation {

	@Test
	public void servicereminder() throws InterruptedException {
		
		
		//Add customer service reminder
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='remindersTab']")).click();
		driver.findElement(By.linkText("Add new service reminder")).click();
		WebElement src1=driver.findElement(By.id("servicereminder_propertyservicereminderid"));
		Select dd1=new Select(src1);
		dd1.selectByIndex(1);
		Thread.sleep(3000); 

		/*List<WebElement> alloptions=dd1.getOptions();
		int servicetypecount=alloptions.size();
		System.out.println(servicetypecount);
		dd1.selectByIndex(servicetypecount-1); */
		
		//WebElement src2=driver.findElement(By.name("servicereminder[contactid]"));
		Select dd2ctc=new Select(driver.findElement(By.id("servicereminder_contactid")));
		//dd2.selectByValue("23");
		dd2ctc.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/section/form/div/button/span[1]")).click();
		Thread.sleep(3000); 


		//Edit customer service reminder
		driver.findElement(By.xpath("//a[@has-permission='Servicereminders,updateaccess']")).click();
		driver.findElement(By.xpath("//*[@id='saveEditServiceReminder']/span[1]")).click();
		Thread.sleep(3000); 

		//Assert the actual and expected result for customer service remindername
		String actualsreminder=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/section[1]/table/tbody/tr[1]/td[2]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("Manuall", actualsreminder);
		System.out.println("Assertion for customer service reminder in which added: Test Passed");

	}

}
