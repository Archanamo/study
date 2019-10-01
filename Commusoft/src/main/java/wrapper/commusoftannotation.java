package wrapper;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class commusoftannotation {
	//public String baseurl="https://dev.commusoft.co.uk/";
	public static WebDriver driver;
	 
	@BeforeTest
	public void browser(){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\selenium\\Commusoft\\drivers\\geckodriver_64bit.exe");	
		//driver =new FirefoxDriver();
		 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://dev.commusoft.co.uk/");
			driver.manage().window().maximize();

			//driver.findElement(By.id("logintype_clientid")).sendKeys("16865");
			driver.findElement(By.xpath("//*[@id='logintype_clientid']")).sendKeys("16865");
			driver.findElement(By.id("logintype_username")).sendKeys("archana");
			driver.findElement(By.id("logintype_password")).sendKeys("archana123");
			driver.findElement(By.xpath("//*[@id='successful-login']/span[1]")).click();  
	}
	
	/*
	@AfterTest
	public void close(){
		driver.close();
	} 
	  
	@BeforeMethod()
	  public void login() {
		driver.findElement(By.id("logintype_clientid")).sendKeys("16865");
		driver.findElement(By.id("logintype_username")).sendKeys("archana");
		driver.findElement(By.id("logintype_password")).sendKeys("archana123");
		driver.findElement(By.xpath("//*[@id='successful-login']/span[1]")).click();
	  }
	 */ 
	
	/*
	 @AfterTest
	  //logout for commusoft
	  public void afterMethod() {
			driver.findElement(By.xpath("//*[@id='drop5']")).click();
			driver.findElement(By.linkText("Logout")).click();  
	  } */
	
}
