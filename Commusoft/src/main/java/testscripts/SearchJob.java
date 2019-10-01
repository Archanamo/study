package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class SearchJob extends commusoftannotation{

	@Test
	public void searchjob() throws InterruptedException
	{
		//Solr serach by job number
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("1005",Keys.ENTER);
		
		
		//Assert the actual and expected result for search by job number
		String actualsjobno=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/section/div[2]/div[2]/section[3]/table/tbody/tr/td[1]/a")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("1005", actualsjobno);
		System.out.println("Assertion for search by job number : Test Passed");	
		
		
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/section/div[2]/div[2]/section[3]/table/tbody/tr/td[1]/a")).click();
		Thread.sleep(3000);
				
	}
}
