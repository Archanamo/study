package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Customerjobsms extends func{
	
	@Test(groups={"smoke"})
	public void customerjobsms() throws InterruptedException{
		
	//Solr serach by job number
	driver.findElement(By.name("q")).sendKeys("1005",Keys.ENTER);
	driver.findElement(By.xpath("//a[@href='/customers/customer_list/1015/jobs/1005/details/view']")).click();
	Thread.sleep(3000);


	//Add notes from hjob tab
	driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[5]/a[1]/span")).click();
	driver.findElement(By.linkText("Send new sms")).click();
	Thread.sleep(2000);
	WebElement to=driver.findElement(By.id("communication_smsmessage_contacttelephoneid"));
	Select ddto=new Select(to);
	ddto.selectByIndex(1);

	//Switch to frame
	WebElement ifrmae=driver.findElement(By.cssSelector("#communication_smsmessage_message_ifr"));
	driver.switchTo().frame(ifrmae);
	WebElement msg=driver.findElement(By.cssSelector("#tinymce"));
	msg.sendKeys("Testing for sms message");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div/button/span[1]")).click();
}
}