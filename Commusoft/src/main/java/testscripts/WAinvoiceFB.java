package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class WAinvoiceFB extends commusoftannotation {
	@Test
	public void wainvoicefb() throws InterruptedException {
	
		/*
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("1154",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/section/div[2]/div[2]/section[3]/table/tbody/tr/td[1]/a")).click();
		Thread.sleep(3000);
		*/		
		
		
		//click on invoice tab
		driver.findElement(By.xpath("//a[@ui-sref='loggedin.customer_list.view.job.invoices({ id: selectedId, type: customerMode, jobId: $state.params.jobId  })']")).click();
		
		//Add customer invoice with full breakdown
		driver.findElement(By.linkText("Add new invoice")).click();
		driver.findElement(By.linkText("Copy from job")).click();
		Thread.sleep(4000);
		
		//Chosen work address invoice from invoice drop down field
		driver.findElement(By.xpath("//span[@class='select2-arrow']")).click();
		//driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/fieldset[1]/div[2]/div[2]/div[2]/div[1]/div/div/select")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("workaddress");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(Keys.RETURN);
		
		WebElement src4=driver.findElement(By.name("invoiceCategoryId"));
		Select dd4=new Select(src4);
		dd4.selectByVisibleText("category1");
		driver.findElement(By.xpath("(//input[@ng-model='invoiceBreakdown'])[3]")).click();
		Thread.sleep(2000);
		
	        //This will scroll the web page till end.
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2000)");
	        //js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr/td[2]")).click();
		Actions act=new Actions(driver);
		act.doubleClick(driver.findElement(By.xpath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr/td[2]"))).perform();
		//driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys("item1");
		//driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).click();
		WebElement it=driver.findElement(By.xpath("//*[@id='select2-drop']/div/input"));
		it.sendKeys("item1");
				//it.click();
				it.sendKeys(Keys.ENTER);
			
		/*		
		WebElement ssdd=driver.findElement(By.xpath("//*[@id='select2-drop']/ul/li"));
		Select ssdd1=new Select(ssdd);
		ssdd1.selectByIndex(0);
		Thread.sleep(2000);
		*/
				
		//driver.findElement(By.xpath("//*[@id='select2-drop']/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='full_breakdown']/div[1]/div/div/div/table/thead/tr/th[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[3]/button/span[1]")).click();
		Thread.sleep(2000);
	}

}
