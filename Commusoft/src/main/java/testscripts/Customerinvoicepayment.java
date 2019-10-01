package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class Customerinvoicepayment extends commusoftannotation {
	
	@Test
public void payment() throws InterruptedException{
	
	
	//Add payment from customer invoice
	driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[7]/a")).click();
	//driver.findElement(By.xpath("//a[@has-permission='Customerinvoicing,readaccess']")).click();
	//driver.findElement(By.linkText("Add new payment")).click();

	/*
	//select particular date from date picker
	driver.findElement(By.xpath("//span[@class='ss-calendar']")).click();
	WebElement datewidget=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div[4]/section/div/div/div/form/fieldset[1]/div[2]/div[1]/div[1]/div/div[2]/div/div/table/tbody"));
	List<WebElement> rows=datewidget.findElements(By.tagName("tr"));
	List<WebElement> columns=datewidget.findElements(By.tagName("td"));
	for(WebElement cel:columns){
		String date=cel.getText();
		if(date.equalsIgnoreCase("28")){
			cel.click();
			break;
		}
	}
	*/
	
	/*
	for(WebElement cell : columns)
	{
		if(cell.getText().equals("15")) 
		{
			cell.findElement(By.linkText("15")).click();
			break;
		}
	}
*/
	WebElement src8=driver.findElement(By.name("paymentMethod"));
	Select dd8=new Select(src8);
	dd8.selectByIndex(1);
	WebElement src9=driver.findElement(By.name("nominalAccount"));
	Select dd9=new Select(src9);
	dd9.selectByVisibleText("Bank");
	driver.findElement(By.name("amount")).clear();
	driver.findElement(By.name("amount")).sendKeys("55.42");
	driver.findElement(By.xpath("//span[text()='Add payment']")).click();

	//Edit payment
	driver.findElement(By.linkText("View payment")).click();
	driver.findElement(By.xpath("//a[@has-permission='Customerpayments,updateaccess']")).click();
	driver.findElement(By.xpath("//*[@id='customerAllocationSpreadsheet']/div[1]/div/div/div/table/tbody/tr[1]/td[8]")).click();
	Actions act1=new Actions(driver);
	act1.doubleClick(driver.findElement(By.xpath("//*[@id='customerAllocationSpreadsheet']/div[1]/div/div/div/table/tbody/tr[1]/td[8]"))).perform();
	driver.findElement(By.xpath("//*[@id='customerAllocationSpreadsheet']/div[6]/textarea")).clear();
	driver.findElement(By.xpath("//*[@id='customerAllocationSpreadsheet']/div[6]/textarea")).sendKeys("65.12",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div[4]/section/div/div/div/form/div[2]/button")).submit();
	//driver.findElementByLinkText("Invoices").click();
	//driver.findElementByXPath("//*[@id='main']/div[2]/div/div[1]/div/h3/span[6]/span[1]/a").click();  //Clicking on breadcrumb for job number
	//driver.findElementByXPath("(//a[@ng-if='jobId'])[1]").click();
	
	/*
	//Assert the actual and expected result for how much amount paid in customer invoice
	String actualamtpaid=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div[4]/section/div/div/div/section[2]/div/div/div[2]/div/div/table/tbody/tr/td[2]/span")).getText();
	Thread.sleep(2000);
	Assert.assertEquals("65.12", actualamtpaid);
	System.out.println("Assertion for amount paid in which customer invoice with no breakdown: Test Passed");	
	*/
}
}