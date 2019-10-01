package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import wrapper.commusoftannotation;

public class AddDiaryEvent extends commusoftannotation {

	public void adddiaryevent() throws InterruptedException
	{
		//diary
		driver.findElement(By.linkText("Diary")).click();
		Thread.sleep(3000);

		//Weekly view
		driver.findElement(By.xpath("//*[@id='cs-calendar']/div[1]/div[2]/div/button[3]")).click();
		driver.findElement(By.xpath("//*[@id='cs-calendar']/div[2]/div/table/tbody/tr/td/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]")).click();

		//For single click from diary
		driver.findElement(By.xpath("//*[@id='cs-calendar']/div[2]/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[4]/td[2]")).click();

		//drag and drop for daily view from diary
		WebElement draggable = driver.findElement(By.xpath("//*[@id='cs-calendar']/div[2]/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[4]/td[2]"));
		WebElement droppable = driver.findElement(By.xpath("//*[@id='cs-calendar']/div[2]/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[6]/td[2]"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).perform();

		//click on job event from diary
		driver.findElement(By.xpath("//*[@id='page-panel-main']/div[1]/a[3]")).click();
		driver.findElement(By.xpath("//*[@id='top-input-in-event-type']")).sendKeys("archana",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='page-panel-main']/div[2]/div/section[1]/section[2]/div/ul/li[1]/label/div/strong")).click();
		WebElement src13=driver.findElement(By.name("description"));
		Select dd13=new Select(src13);
		dd13.selectByIndex(1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='side-panel']/section[1]/div/form/div[2]/div/button")).click();
	}
}
