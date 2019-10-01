package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public abstract class GenericWrapper implements Wrappers{
	RemoteWebDriver driver;
int i=1;
	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
			driver = new ChromeDriver();			
		}else {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");		
			driver = new FirefoxDriver();			
		}			
		driver.get(url);		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("The Browser "+browser+" is launched");
	}

}
