package testscripts;

import java.util.List;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class CustomerJobParts extends commusoftannotation{

	@Test
	public void customerjobparts() throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		
		//Add job part
		
		driver.findElement(By.xpath("//span[text()='Parts']")).click();
		//driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[3]/a/span[1]")).click();
		driver.findElement(By.xpath("//span[text()='Add new part']")).click();
		driver.findElement(By.xpath("//span[text()='Please select a part']")).click();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("pa");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("part_quantity")).sendKeys("5",Keys.ENTER);
		
		/*
		List<WebElement> partlist=driver.findElements(By.xpath("(//ul[@class='select2-results'])[2]"));
				System.out.println(partlist.size());
				driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(Keys.ENTER);
		*/
		
		WebElement src8=driver.findElement(By.xpath("//*[@id='part_partstatus']"));
		Select dd8=new Select(src8);
		dd8.selectByVisibleText("Requested");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Save part']")).click();
	
		/*
		//Edit Job Part
		driver.findElement(By.xpath("//span[@class='preview-file-link actions-toggle ng-scope ss-plus']")).click();
		driver.findElement(By.linkText("Edit part")).click();
		driver.findElement(By.xpath("//input[@ng-model='costprice']")).clear();
		driver.findElement(By.xpath("//*[@id='page-panel-main']/section/div/div[4]/input")).sendKeys("200");
		driver.findElement(By.xpath("//input[@ng-model='saleprice']")).clear();
		driver.findElement(By.xpath("//*[@id='page-panel-main']/section/div/div[6]/input")).sendKeys("253.69");
	  //driver.findElement(By.id("save-panel-btn")).click();
		driver.findElement(By.xpath("(//button[@id='save-panel-btn'])[2]")).click();
		Thread.sleep(2000);
		 
		
		//Assert the actual and expected result for Customer job parts
		String actualcpart=driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/table/tbody/tr[1]/td[5]/span[2]")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("part 1", actualcpart);
		System.out.println("Assertion for job parts in which added via customer: Test Passed");	
		*/
	}

}
