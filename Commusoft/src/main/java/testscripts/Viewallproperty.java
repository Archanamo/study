package testscripts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Viewallproperty {

	@Test
	public void allproperty() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//@SuppressWarnings("unused")
		ChromeDriver driver = new ChromeDriver();
		
		//View all property
		driver.findElement(By.linkText("View all properties")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='Name']")).click();

	}

}
