package testscripts;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class CustomerInvoice extends commusoftannotation {

	@Test
	public void customerinvoice() throws InterruptedException {
		Thread.sleep(4000);
		//Add customer invoice for No breakdown
		driver.findElement(By.xpath("//span[text()='Invoices']")).click();
		//driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[8]/a/span[1]")).click();
		driver.findElement(By.linkText("Add new invoice")).click();
		driver.findElement(By.linkText("Copy from job")).click();
		Thread.sleep(4000);
		WebElement src3=driver.findElement(By.name("invoiceCategoryId"));
		Select dd3=new Select(src3);
		dd3.selectByVisibleText("category1");
		//dd3.selectByIndex(0);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='total_price']")).sendKeys("123.45");
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[3]/button/span[1]")).click();
		Thread.sleep(5000);
		
		
		//Edit customer invoice for no breakdown
		driver.findElement(By.xpath("//a[@has-permission='Customerinvoicing,readaccess']")).click();
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div[3]/section/div/div/section[2]/div/div/div[1]/a")).click();
		driver.findElement(By.xpath("//input[@name='total_price']")).clear();
		driver.findElement(By.xpath("//input[@name='total_price']")).sendKeys("342.89");
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div[4]/section/div/div/form/div[3]/button/span[1]")).click();
		Thread.sleep(5000);
		
		/*
		//Assert the actual and expected result for customer invoice with no breakdown grand total
		String actualgrandtotal=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div[3]/section/div/div/section[2]/div/div/div[3]/div/div/table/tbody/tr[4]/td[6]/span")).getText();
		Thread.sleep(2000);
		Assert.assertEquals("411.47", actualgrandtotal);
		System.out.println("Assertion for grand total in wchich added customer invoice with no breakdown: Test Passed");	
		*/
		
		/*
		//Add another customer invoice for full breakdown
		//driver.findElement(By.linkText("Invoices")).click();
	//	driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[1]/div/h3/span[6]/span[2]/span[1]/a")).click();
		Thread.sleep(3000);
		//driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[8]/a/span").click();
		driver.findElement(By.linkText("Add new invoice")).click();
		driver.findElement(By.linkText("Copy from job")).click();
		Thread.sleep(4000);
		WebElement src4=driver.findElement(By.name("invoiceCategoryId"));
		Select dd4=new Select(src4);
		dd4.selectByVisibleText("category1");
		driver.findElement(By.xpath("(//input[@ng-model='invoiceBreakdown'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr/td[2]")).click();
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr/td[2]"))).perform();
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("item1",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[3]/button/span[1]")).click();
		Thread.sleep(2000);
		
*/
		
		
	}

}
