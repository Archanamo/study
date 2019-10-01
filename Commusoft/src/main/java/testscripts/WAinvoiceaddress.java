package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class WAinvoiceaddress extends commusoftannotation{

	@Test
	public void wainvoiceaddress() throws InterruptedException {
		
		
		//Enablked for work address invoice address
		driver.findElement(By.xpath("//*[@id='quickLinks']/span[1]")).click();
		driver.findElement(By.linkText("Invoice addresses")).click();
		driver.findElement(By.xpath("//*[@id='enableWorkaddress']")).click();
		WebElement wad=	driver.findElement(By.xpath("//*[@id='enableInvoiceAddress_enableworkaddress']"));
		Select waiad=new Select(wad);
		waiad.selectByVisibleText("Enabled");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/div/div/section/div/form/div/button/span[1]")).click();
		
		
		//Enabled Landlord invoice address
		driver.findElement(By.id("enableLandlord")).click();
		WebElement walad=driver.findElement(By.id("enableInvoiceAddress_enablelandlord"));
		Select laiad=new Select(walad);
		laiad.selectByVisibleText("Enabled");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/div/div/section/div/form/div/button/span[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id='search-input']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='search-input']")).sendKeys("workaddress",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='top-table']/table/tbody/tr[1]/td[1]/span/a")).click();
		Thread.sleep(4000);
			
	}
}

