package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class WAinvoiceBC extends commusoftannotation {

	@Test
	public void wainvoicebc() throws InterruptedException {
		
				driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[8]/a/span[1]")).click();
		
				//Add customer invoice with breakdown by category
				driver.findElement(By.linkText("Add new invoice")).click();
				driver.findElement(By.linkText("Copy from job")).click();
				Thread.sleep(4000);
				
				//Chosen work address invoice from invoice drop down field
				driver.findElement(By.id("select2-drop-mask")).click();
				driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("Landlord");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(Keys.ENTER);
				
				WebElement src4=driver.findElement(By.name("invoiceCategoryId"));
				Select dd4=new Select(src4);
				dd4.selectByVisibleText("category1");
				driver.findElement(By.xpath("(//input[@ng-model='invoiceBreakdown'])[3]")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("(//input[@ng-model='invoiceBreakdown'])[2]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='category_breakdown']/div[1]/div/div/div/table/tbody/tr/td[2]")).click();
				Actions act=new Actions(driver);
				Thread.sleep(2000);
				act.doubleClick(driver.findElement(By.xpath("//*[@id='category_breakdown']/div[1]/div/div/div/table/tbody/tr/td[2]"))).perform();
				driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("Labour",Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='category_breakdown']/div[7]/textarea")).sendKeys("100.25",Keys.ENTER);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[3]/button")).click();
				Thread.sleep(2000);
	}
}
