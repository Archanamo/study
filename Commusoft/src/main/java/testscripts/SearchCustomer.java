package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class SearchCustomer extends commusoftannotation {

	@Test
	public void searchcustomer() throws InterruptedException
	{
		//Solr search by customer particular customer name
		driver.findElement(By.name("q")).sendKeys("Lithisha Sri",Keys.ENTER);
		
		/*
		//Verify the element for search customer name
		System.out.println("Verify search customer name:");	
		Boolean vsearchcustomername=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[1]/div[2]/span[2]")).isDisplayed();
		System.out.println("Verified search customer surname appeared in list view: " +vsearchcustomername);
		*/ 
		
		/*
		//Assert the actual and expected result for search customer name
		String actualscname=driver.findElement(By.xpath("//*[@id='top-table']/table/tbody/tr[1]/td[1]/span/a")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("Mrs Lithisha Sri", actualscname);
		System.out.println("Assertion for customer name in which saerch by customer name: Test Passed");	
		
		*/
		//Count the list of serach by customer
		WebElement particularlink=driver.findElement(By.xpath("//*[@id='top-table']/table/tbody/tr[1]/td[1]/span/a"));
		List<WebElement> alllink=driver.findElements(By.xpath("//tr[@ng-repeat='customer in results.properties.list']"));
		System.out.println("Count of all search related by cusomter: " +alllink.size());
		Thread.sleep(3000);
		particularlink.click();	
		//System.out.println("click on first link: " +particularlink.isDisplayed());  //print first link from search customer list
	}
}
