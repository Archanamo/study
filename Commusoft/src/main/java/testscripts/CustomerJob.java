package testscripts;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class CustomerJob extends commusoftannotation{

	@Test
	public void customerjob() throws InterruptedException 
	{
		//Add job
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id='newJob']")).click();
		driver.findElement(By.xpath("//span[text()='Add new job']")).click();
		driver.findElement(By.xpath("//select[@id='contactid-select']/option[1]")).click();
		driver.findElement(By.xpath("//select[@id='contactid-select']/following::option[2]")).click();
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[1]/button")).click();
		//Thread.sleep(2000);

		//edit job
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//button[@ng-click='editJob($event, editJobForm.$valid)']")).click();

		//Verified company job description
		Boolean vcustomerjob=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/section/div[2]/div/div/div[1]/div/div[1]/div[1]/span[2]")).isDisplayed();
		System.out.println("Verified customer Job number: " +vcustomerjob);
	}

}
 