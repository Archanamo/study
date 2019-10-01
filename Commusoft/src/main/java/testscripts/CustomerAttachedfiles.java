package testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class CustomerAttachedfiles extends commusoftannotation{
	
	@Test
	public void customerattachedfiles() throws InterruptedException, AWTException {
		

		//Solr serach by job number
		driver.findElement(By.name("q")).sendKeys("1005",Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='/customers/customer_list/1015/jobs/1005/details/view']")).click();
		Thread.sleep(3000);


		//upload file from customer attached files
		driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[7]/a[2]/span[1]")).click();
		driver.findElement(By.linkText("Add new file")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary fake-uploader']")).click();
		Thread.sleep(3000);

		//set the file name in clipboard
		//StringSelection ss=new StringSelection("D:\\pictures\\arc.txt");
		StringSelection ss=new StringSelection("D:\\pictures\\Chrysanthemum.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//Perform native keystrokes for CTRL+V and ENTER keys
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		//View file
		WebElement src11=driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/table/tbody"));
		List<WebElement> trow=src11.findElements(By.tagName("tr"));
		for(WebElement part : trow){
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/table/tbody/tr[1]")).click();
		}

		Thread.sleep(4000);
		//driver.findElementById("page-overlay").click();
		driver.findElements(By.tagName("tr"));
		//driver.findElementByXPath("//div[@ng-click='closePreview()']").click();
	}

}
