package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class Workaddressjob extends commusoftannotation {
	
	@Test
	public void workaddressjob() throws InterruptedException {
			
		//Add job
				driver.findElement(By.xpath("//button[@id='newJob']")).click();
				driver.findElement(By.xpath("//select[@id='contactid-select']/option[1]")).click();
				driver.findElement(By.xpath("//select[@id='contactid-select']/following::option[2]")).click();
				driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[1]/button")).click();
				Thread.sleep(2000);
				
	}
	

}
