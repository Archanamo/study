package testscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SolrSearch {

	
	public void solrsearch() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//@SuppressWarnings("unused")
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev.commusoft.co.uk/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//login for commusoft
		driver.findElement(By.id("logintype_clientid")).sendKeys("16865");
		driver.findElement(By.id("logintype_username")).sendKeys("archana");
		driver.findElement(By.id("logintype_password")).sendKeys("archana123");
		driver.findElement(By.xpath("//*[@id='successful-login']/span[1]")).click();
		

		//Solr search by customer particular customer name
		driver.findElement(By.name("q")).sendKeys("mohan",Keys.ENTER);
		Thread.sleep(2000);
		//Count the list of serach by customer
		WebElement particularlink=driver.findElement(By.xpath("//*[@id='top-table']/table/tbody/tr[3]/td[1]/span/a"));
		List<WebElement> alllink=driver.findElements(By.xpath("//tr[@ng-repeat='customer in results.properties.list']"));
		System.out.println(alllink.size());
		
		/*
		for(int i=0;i<=alllink.size();i++)
		{
			System.out.println(alllink.get(i).getText()+ " ----- "+alllink.get(i).isDisplayed());  //Print all link name and return 'true or false'
			//particularlink.click();	
		}	*/
		
		particularlink.click();	
		System.out.println("click on thrird link: " +particularlink.getText());  //print third link from search customer list
		
		
		//Solr serach by job number
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("1005",Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='/customers/customer_list/1015/jobs/1005/details/view']")).click();
		Thread.sleep(3000);

	}

}
