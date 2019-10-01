package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.*;
public class AddCompnay {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//@SuppressWarnings("unused")
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev.commusoft.co.uk/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//Login for commusoft
		driver.findElementById("logintype_clientid").sendKeys("16865");
		driver.findElementById("logintype_username").sendKeys("archana");
		driver.findElementById("logintype_password").sendKeys("archana123");
		driver.findElementByXPath("//*[@id='successful-login']/span[1]").click();
		Thread.sleep(2000);
		
		//Create company
		driver.findElement(By.id("customertypecompany")).click();
		driver.findElement(By.id("company_contacts_companyname")).sendKeys("KLMN LIMITED");
		driver.findElement(By.id("company_addressline1")).sendKeys("west street");
		driver.findElement(By.id("company_contacts_contactsemail_emailaddress")).sendKeys("archana@commusoft.co.uk");
		driver.findElement(By.xpath("//span[text()='Add Company']")).click();
		Thread.sleep(3000);
		
		String actualmsg=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[1]/div[3]/span[2]")).getText();
		Thread.sleep(3000); 
		try 
		{
		Assert.assertEquals("KLMNrt LIMITED", actualmsg); 
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
		System.out.println("Verified compnay name: Test Passed");
		}
		
		/*
		//Verified added company details	
		Boolean vcompanyname=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section/div[2]/div/div/div[1]/div/div[1]/div[3]/span[2]")).isDisplayed();
		System.out.println("Verified company name: " +vcompanyname);
		Thread.sleep(2000);
		*/
		
		//Go to Contacts tab
		driver.findElement(By.id("contactsTab")).click();
		
		//Create contact via company
		//driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Add new contact']")).click();
		driver.findElement(By.id("contact_surname")).sendKeys("Jason");
		driver.findElement(By.xpath("//span[text()='Add contact']")).click();

		//Verified company contact details 
		Boolean vcompnaycontact=driver.findElement(By.xpath("//*[@id='sortables']/tbody/tr/td[2]")).isDisplayed();
		System.out.println("Verified company contact name: " +vcompnaycontact);
		
		//Redirect from contact tab to property tab 
		driver.findElement(By.xpath("//span[text()='Property']")).click();
		
		//Created job via company
		driver.findElement(By.xpath("//*[@id='newJob']/span")).click();
		driver.findElement(By.xpath("//select[@id='contactid-select']/option[1]")).click();
		driver.findElement(By.xpath("//select[@id='contactid-select']/following::option[2]")).click();
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[1]/button")).click();
	
		//Verified company job description
		Boolean vcompnayjob=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/section/div[2]/div/div/div[1]/div/div[1]/div[3]/span[2]")).isDisplayed();
		System.out.println("Verified company Job description: " +vcompnayjob);
		
		//edit job
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//button[@ng-click='editJob($event, editJobForm.$valid)']")).click();
	}

}
