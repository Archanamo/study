package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanyContact {

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
		
		
	}

}
