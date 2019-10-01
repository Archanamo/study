package testscripts;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class func {
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	public WebDriver driver=null;
	public String baseurl="https://dev.commusoft.co.uk/";
	 
	@BeforeTest
	public void browser(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(baseurl);
			driver.manage().window().maximize();
	}
	
	
		@BeforeMethod
		  public void login1() {
			driver.findElement(By.id("logintype_clientid")).sendKeys("16865");
			driver.findElement(By.id("logintype_username")).sendKeys("archana");
			driver.findElement(By.id("logintype_password")).sendKeys("archana123");
			driver.findElement(By.xpath("//*[@id='successful-login']/span[1]")).click();; 
		  }
	
	  @AfterMethod
	  //logout for commusoft
	  public void afterMethod() {
			driver.findElement(By.xpath("//*[@id='drop5']")).click();
			driver.findElement(By.linkText("Logout")).click();
	  } 
	  
		@AfterTest
		public void close(){
			driver.close();
		} 
	
	  
}