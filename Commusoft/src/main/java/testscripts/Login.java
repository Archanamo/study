package testscripts;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login extends func {

	@Test
	public void login() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.id("logintype_clientid")).sendKeys("16865");
		driver.findElement(By.id("logintype_username")).sendKeys("archana");
		driver.findElement(By.id("logintype_password")).sendKeys("archana123");
		driver.findElement(By.xpath("//*[@id='successful-login']/span[1]")).click();; 
	}

}
