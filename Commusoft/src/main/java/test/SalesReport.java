package test;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SalesReport  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//@SuppressWarnings("unused")
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://stage.commusoft.co.uk/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//Login for commusoft
		driver.findElementById("logintype_clientid").sendKeys("16485");
		driver.findElementById("logintype_username").sendKeys("archana");
		driver.findElementById("logintype_password").sendKeys("archana123");
		driver.findElementByXPath("//*[@id='successful-login']/span[1]").click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Reporting")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#side-bar")).click();
		//driver.findElement(By.xpath("//*[@id='side-bar']")).click();
		driver.findElement(By.linkText("Sales")).click();
		driver.findElement(By.xpath("//a[@class='ng-scope ng-binding']")).click();
		//driver.findElement(By.xpath("//*[@id='sortables-secondTier']/li[1]/span/a")).click();
		Thread.sleep(4000);
		
		
		WebElement satable=driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/div/table"));
		List<WebElement> row1=satable.findElements(By.tagName("tr"));
		System.out.println("row count:" +row1.size());
		 List<WebElement> column1 = driver.findElements(By.xpath("//*[@id='smart-table-wrapper']/div/table/tbody/tr/td[8]"));
		System.out.println("column count:" +column1.size());
		
		
		int sum=0;
	
		
		 
		
		for(WebElement el:column1)
		{
			int b=Integer.parseInt(el.getText());
			
			sum=sum+b;
		//sum=sum+Integer.parseInt(el.getText());
		}
		System.out.println("Total:"+sum); 
		
		
	/*
		//driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/div/table/tbody/tr[1]/td[8]/span"))
		List<WebElement> icol=driver.findElements(By.xpath("//*[@id='smart-table-wrapper']/div/table/thead/tr/th[1]"));
		System.out.println("No of columns" +icol.size());
		
		List<WebElement> irow=driver.findElements(By.xpath("//*[@id='smart-table-wrapper']/div/table/tbody/tr[1]/td[3]"));
		System.out.println("No of columns" +irow.size());		
		for(int i=0;i<irow.size()-1;i++)
		{
			
		}
		*/
		
		
		/* It works fine
		//To fetch specific column as 'Net' values. (works fine)
		WebElement satable=driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/div/table"));
		 List<WebElement> column8 = driver.findElements(By.xpath("//*[@id='smart-table-wrapper']/div/table/tbody/tr/td[8]"));
		  System.out.println("NUMBER OF ROWS IN THIS TABLE = "+ column8 .size());
		  int row_num=1;
		  for (WebElement netelement : column8 ) 
		  {
		        System.out.println("row # " + row_num + ", col #8 net=" +netelement.getText());
		   row_num++;
		  }
		 
		
		//To fetch specific column as 'Total' values
		//WebElement salestable=driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/div/table"));
		 List<WebElement> column11 = driver.findElements(By.xpath("//*[@id='smart-table-wrapper']/div/table/tbody/tr/td[11]"));
		  System.out.println("Column count "+ column11 .size());
		//  int row_num=1;
		  for (WebElement totalelement : column11 ) 
		  {
		        System.out.println("row # " + row_num + ", col #11 total=" +totalelement.getText());
		   row_num++;
		  }
		  
		  
		//To fetch specific column as 'Amount paid or allocated' values
			//WebElement salestable1=driver.findElement(By.xpath("//*[@id='smart-table-wrapper']/div/table"));
			 List<WebElement> column12 = driver.findElements(By.xpath("//*[@id='smart-table-wrapper']/div/table/tbody/tr/td[12]"));
			  System.out.println("Column count "+ column12 .size());
			 // int row_num1=1;
			  for (WebElement amountelement : column12 ) 
			  {
			        System.out.println("row # " + row_num + ", col #12 Amount paid=" +amountelement.getText());
			   row_num++;
			  }
		*/
		
	} 
	
}
