package testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import wrapper.commusoftannotation;

public class ViewCustomerfromWA extends commusoftannotation {
	@Test
	public void viewcustomerfromwa() throws InterruptedException {
		
		//View customer from workkaddress  tab
			driver.findElement(By.linkText("View customer")).click();
			Thread.sleep(2000);
	}

}
