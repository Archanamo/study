package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {

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

/*
//Create customer
driver.findElementByXPath("//a[@id='customertypecustomer']").click();
WebElement src=driver.findElementById("customertype_contacts_settingsTitlesid");
Select dd=new Select(src);
dd.selectByVisibleText("Mrs");
driver.findElementByName("customertype[contacts][surname]").sendKeys("Archana");
driver.findElementByName("customertype[addressline1]").sendKeys("3rd Cross street");
driver.findElementByXPath("//*[@id='main']/div[2]/div/section/div/div/section/form/div/button").click();
Thread.sleep(5000);

//Edit customer
driver.findElementByXPath("//*[@id='editcustomer']/span").click();
//driver.findElementByXPath("//a[@id='editcustomer']").click();
driver.findElementByName("customerDetails.surname").sendKeys(" Mohan");
driver.findElementByName("customerMobileNumber").sendKeys("3445345");
driver.findElementByName("customerEmail").sendKeys("archana@commusoft.co.uk");
driver.findElementByXPath("//button[@class='btn btn-primary loading_btn save_btn']").click();
Thread.sleep(4000);
*/

/*
//Solr search by customer particular customer name
driver.findElement(By.name("q")).sendKeys("archana",Keys.ENTER);
Thread.sleep(2000);
//Count the list of serach by customer
WebElement particularlink=driver.findElement(By.xpath("//*[@id='top-table']/table/tbody/tr[3]/td[1]/span/a"));
List<WebElement> alllink=driver.findElements(By.xpath("//tr[@ng-repeat='customer in results.properties.list']"));
System.out.println(alllink.size());
for(int i=0;i<=alllink.size();i++)
{
	System.out.println(alllink.get(i).getText()+ " ----- "+alllink.get(i).isDisplayed());  //Print all link name and return 'true or false'
	//particularlink.click();	
}	

particularlink.click();	
System.out.println("click on thrird link: " +particularlink.getText() +" : " +particularlink.isDisplayed());  //print third link from search customer list
*/

/*
//View all property
driver.findElementByLinkText("View all properties").click();
Thread.sleep(3000);
driver.findElementByXPath("//a[@id='Name']").click();

/*
//Add contact
driver.findElementById("contactsTab").click();
//driver.findElementByXPath("//a[@id='contactsTab']").click();
driver.findElementByLinkText("Add new contact").click();
driver.findElementById("contact_surname").sendKeys("Anitha");
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div/button").click();
Thread.sleep(2000);

//Edit Contact
driver.findElementByXPath("//a[@has-permission='Customercontacts,updateaccess']").click();
driver.findElementByName("contactName").sendKeys("update");
driver.findElementByXPath("//button[@ng-click='editContact($event, editContactForm.$valid)']").click();
Thread.sleep(4000);
*/

/*
//Add customer service reminder
driver.findElementByXPath("//*[@id='remindersTab']/span").click();
driver.findElementByLinkText("Add new service reminder").click();
WebElement src1=driver.findElementById("servicereminder_propertyservicereminderid");
Select dd1=new Select(src1);
dd1.selectByIndex(1);
Thread.sleep(3000); */

/*List<WebElement> alloptions=dd1.getOptions();
int servicetypecount=alloptions.size();
System.out.println(servicetypecount);
dd1.selectByIndex(servicetypecount-1); */
/*
WebElement src2=driver.findElementByName("servicereminder[contactid]");
Select dd2=new Select(src2);
dd2.selectByValue("23");
//dd2.selectByIndex(0);
Thread.sleep(2000);
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/section/form/div/button/span[1]").click();
Thread.sleep(3000); 


//Edit customer service reminder
driver.findElementByXPath("//a[@has-permission='Servicereminders,updateaccess']").click();
driver.findElementByXPath("//*[@id='saveEditServiceReminder']/span[1]").click();
Thread.sleep(3000); 

//Add work address from customer tab
driver.findElementByXPath("//*[@id='workAddressTab']/span").click();
driver.findElementByXPath("//a[@has-permission='Customersandworkaddresses,writeaccess']").click();
	//Add landlord
driver.findElementById("createlandlord").click();
Thread.sleep(3000);
driver.findElementById("landlord_name").sendKeys("Test Landlord");
driver.findElementById("landlord_addressline1").sendKeys("kk nagar");
driver.findElementByXPath("//*[@id='landlordbutton']/span[1]").click();
Thread.sleep(3000);
driver.findElementById("workaddress_contacts_surname").sendKeys("WA for Archana");
driver.findElementById("workaddress_addressline1").sendKeys("work addreesline1");
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/section/form/div/button/span[1]").click();
Thread.sleep(5000);

//Edit workaddress
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section[2]/div[1]/a/span").click();
Thread.sleep(2000);
driver.findElementByName("customerDetails.surname").clear();
driver.findElementByName("customerDetails.surname").sendKeys("update workaddress");
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/div/div/div/form/div[2]/button").click();
Thread.sleep(5000); */

/*
//View customer from workkaddress  tab
driver.findElementByLinkText("View customer").click();
//driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/div[1]/div/section[1]/div[1]/a[2]").click();
Thread.sleep(2000);
 */

/*
//Delete customer
driver.findElement(By.xpath("//span[text()='Quick links']")).click();
driver.findElement(By.linkText("Delete")).click();
//driver.findElement(By.xpath("//*[@id='cannot-delete-modal-customer']/div[3]/button")).click();
//String wnd=driver.getWindowHandle();
//driver.switchTo().window(wnd);
driver.switchTo().alert();
driver.findElement(By.xpath("//*[@id='cannot-delete-modal-customer']/div[3]/button")).click();
//driver.switchTo().alert().dismiss();

driver.findElement(By.linkText("View")).click();
driver.findElement(By.xpath("//span[text()='Quick links']")).click();
driver.findElement(By.linkText("Delete")).click();
driver.switchTo().alert().sendKeys("Delete");
 driver.switchTo().alert().accept();
 Thread.sleep(2000);
/*
//go to Property tab from contacts tab
driver.findElementByXPath("//*[@id='propertyTab']/span").click();
Thread.sleep(4000); 

//Add job
driver.findElementByXPath("//*[@id='newJob']/span").click();
driver.findElementByXPath("//select[@id='contactid-select']/option[1]").click();
driver.findElementByXPath("//select[@id='contactid-select']/following::option[2]").click();
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[1]/button").click();
Thread.sleep(2000);

//edit job
driver.findElementByLinkText("Edit").click();
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/fieldset[1]/div[3]/div/div[3]/div/textarea").sendKeys("Test notes");
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div/button").click();
Thread.sleep(2000); 
*/

/*
//Solr serach by job number
driver.findElementByName("q").sendKeys("1005",Keys.ENTER);
driver.findElementByXPath("//a[@href='/customers/customer_list/1015/jobs/1005/details/view']").click();
Thread.sleep(3000);
*/

/*
//Add notes from hjob tab
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[5]/a[1]/span").click();
driver.findElementByLinkText("Send new sms").click();
Thread.sleep(2000);
WebElement to=driver.findElementById("communication_smsmessage_contacttelephoneid");
Select ddto=new Select(to);
ddto.selectByIndex(1);

//Switch to frame
WebElement ifrmae=driver.findElement(By.cssSelector("#communication_smsmessage_message_ifr"));
driver.switchTo().frame(ifrmae);
WebElement msg=driver.findElement(By.cssSelector("#tinymce"));
msg.sendKeys("Testing for sms message");
Thread.sleep(2000);
driver.switchTo().defaultContent();
//driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div/button").click();
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div/button/span[1]").click();

*/

 /*
//Add customer invoice for No breakdown
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[8]/a/span").click();
driver.findElementByLinkText("Add new invoice").click();
driver.findElementByLinkText("Copy from job").click();
Thread.sleep(4000);
WebElement src3=driver.findElementByName("invoiceCategoryId");
Select dd3=new Select(src3);
dd3.selectByVisibleText("category1");
//dd3.selectByIndex(0);
driver.findElementByXPath("//input[@name='total_price']").sendKeys("123.45");
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[3]/button/span[1]").click();
Thread.sleep(5000);

//Edit customer invoice for no breakdown
driver.findElementByXPath("//a[@has-permission='Customerinvoicing,readaccess']").click();
driver.findElementByXPath("//a[@has-permission='Customerinvoicing,updateaccess']").click();
driver.findElementByXPath("//input[@name='total_price']").clear();
driver.findElementByXPath("//input[@name='total_price']").sendKeys("342.89");
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div[4]/section/div/div/form/div[3]/button/span[1]").click();
Thread.sleep(5000); 

/*

//Add payment from customer invoice
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[7]/a").click();
driver.findElementByXPath("//a[@has-permission='Customerinvoicing,readaccess']").click();
driver.findElementByLinkText("Add new payment").click();

//select particular date from date picker
driver.findElementByXPath("//span[@class='ss-calendar']").click();
WebElement datewidget=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/div[4]/section/div/div/div/form/fieldset[1]/div[2]/div[1]/div[1]/div/div[2]/div/div/table/tbody"));
//List<WebElement> rows=datewidget.findElements(By.tagName("tr"));
List<WebElement> columns=datewidget.findElements(By.tagName("td"));
for(WebElement cell : columns){
	if(cell.getText().equals("15")) {
		cell.findElement(By.linkText("15")).click();
		break;
	}
}

WebElement src8=driver.findElementByName("paymentMethod");
Select dd8=new Select(src8);
dd8.selectByIndex(1);
WebElement src9=driver.findElementByName("nominalAccount");
Select dd9=new Select(src9);
dd9.selectByVisibleText("Bank");
driver.findElementByName("amount").clear();
driver.findElementByName("amount").sendKeys("55.42");
driver.findElementByXPath("//span[text()='Add payment']").click();

//Edit payment
driver.findElementByLinkText("View payment").click();
driver.findElementByXPath("//a[@has-permission='Customerpayments,updateaccess']").click();
driver.findElementByXPath("//*[@id='customerAllocationSpreadsheet']/div[1]/div/div/div/table/tbody/tr[1]/td[8]").click();
Actions act1=new Actions(driver);
act1.doubleClick(driver.findElementByXPath("//*[@id='customerAllocationSpreadsheet']/div[1]/div/div/div/table/tbody/tr[1]/td[8]")).perform();
driver.findElementByXPath("//*[@id='customerAllocationSpreadsheet']/div[6]/textarea").clear();
driver.findElementByXPath("//*[@id='customerAllocationSpreadsheet']/div[6]/textarea").sendKeys("65.12",Keys.ENTER);
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div[4]/section/div/div/div/form/div[2]/button").submit();
//driver.findElementByLinkText("Invoices").click();
//driver.findElementByXPath("//*[@id='main']/div[2]/div/div[1]/div/h3/span[6]/span[1]/a").click();  //Clicking on breadcrumb for job number
//driver.findElementByXPath("(//a[@ng-if='jobId'])[1]").click();
*/


/*
//Add customer invoice for full breakdown
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[1]/div/h3/span[6]/span[2]/span[1]/a").click();
Thread.sleep(3000);
//driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[8]/a/span").click();
driver.findElementByLinkText("Add new invoice").click();
driver.findElementByLinkText("Copy from job").click();
Thread.sleep(4000);
WebElement src4=driver.findElementByName("invoiceCategoryId");
Select dd4=new Select(src4);
dd4.selectByVisibleText("category1");
driver.findElementByXPath("(//input[@ng-model='invoiceBreakdown'])[3]").click();
Thread.sleep(2000);
driver.findElementByXPath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr/td[2]").click();
Actions act=new Actions(driver);
act.doubleClick(driver.findElementByXPath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr/td[2]")).perform();
driver.findElementByXPath("//*[@id='select2-drop']/div/input").sendKeys("item1",Keys.ENTER);
Thread.sleep(2000);
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div[3]/button/span[1]").click();
Thread.sleep(2000);
*/

/*testing
//driver.findElementByXPath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr[1]/td[4]").click();
Thread.sleep(3000);
Actions act1=new Actions(driver);
act1.doubleClick(driver.findElementByXPath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr[1]/td[4]")).perform();
Thread.sleep(3000);
//driver.findElementByXPath("//*[@id='full_breakdown']/div[1]/div/div/div/table/tbody/tr[1]/td[4]").sendKeys(Keys.TAB);

driver.findElementByXPath("//textarea[@class='handsontableInput']").clear();
driver.findElementByXPath("//textarea[@class='handsontableInput']").sendKeys("5",Keys.TAB);
driver.findElementByXPath("//textarea[@class='handsontableInput']").clear();
driver.findElementByXPath("//textarea[@class='handsontableInput']").sendKeys("145.26",Keys.TAB);
*/

/*
//Diary
driver.findElementByLinkText("Diary").click();
WebElement diarywidget=driver.findElementByXPath("//*[@id='cs-calendar']/div[2]/div/table/tbody/tr/td/div[2]/div/div[1]/table/tbody");
List<WebElement> testrow=diarywidget.findElements(By.xpath("//*[@id='cs-calendar']/div[2]/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[3]"));
List<WebElement> testcol=diarywidget.findElements(By.xpath("//*[@id='cs-calendar']/div[2]/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[3]/td[2]"));

//List<WebElement> row1=diarywidget.findElements(By.tagName("tr"));
//List<WebElement> columns1=diarywidget.findElements(By.tagName("td"));
for(WebElement cell1 : testcol){
	
	
	*/
	

/*
//Add job part
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[3]/a/span[1]").click();
Thread.sleep(1500);
driver.findElementByXPath("//a[@has-permission='Jobparts,writeaccess']").click();
Thread.sleep(2000);
driver.findElementByXPath("//span[text()='Please select a part']").click();
Thread.sleep(2000);
driver.findElementByXPath("//*[@id='select2-drop']/div/input").sendKeys("pa");
Thread.sleep(4000);
driver.findElementByXPath("//*[@id='select2-drop']/div/input").sendKeys(Keys.ENTER);
driver.findElementById("part_quantity").sendKeys("5",Keys.ENTER);
Thread.sleep(2000);
WebElement src8=driver.findElementByXPath("//*[@id='part_partstatus']");
Select dd8=new Select(src8);
dd8.selectByVisibleText("On order");
Thread.sleep(2000);
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/span[1]/div/section/div/div/form/div/button/span[1]").click();
Thread.sleep(4000);


//Edit Job Part

driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[3]/a").click();
driver.findElementByXPath("//*[@id='actions-dropdown']/ng-include/span").click();
driver.findElementByXPath("//a[@has-permission='Jobparts,updateaccess']").click();
Thread.sleep(2000);
driver.findElementByXPath("//input[@ng-model='saleprice']").clear();
Thread.sleep(2000);
driver.findElementByXPath("//*[@id='page-panel-main']/section/div/div[4]/input").sendKeys("253.69");
driver.findElementById("save-panel-btn").click();
Thread.sleep(3000);


//Add Office task
driver.findElementByXPath("//*[@id='main']/div[2]/div/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/a/span").click();
//driver.findElementByLinkText("Office Task").click();
driver.findElementByXPath("//input[@class='mention-input__input']").sendKeys("Officetask is created @");
Thread.sleep(2000);
driver.findElementByXPath("//span[@class='mention-input__suggestions__item__display']/following::li[2]").click();
driver.findElementByLinkText("Save").click();
driver.findElementByLinkText("Edit").click();
driver.findElementByXPath("//input[@class='mention-input__input']").sendKeys("updated @");
Thread.sleep(2000);
driver.findElementByXPath("//span[@class='mention-input__suggestions__item__display']/following::li[3]").click();
driver.findElementByLinkText("Save").click();
Thread.sleep(2000);
//driver.findElementByXPath("//span[@class='flex-1']").isDisplayed();
//System.out.println(driver.findElementByXPath("//span[@class='mention-input__suggestions__item__display']/following::li[2]"));
driver.findElementByLinkText("Complete");
Thread.sleep(3000);
//driver.findElementByXPath("//span[@class='flex-2']").isDisplayed();
//System.out.println(driver.findElementByXPath("//span[@class='mention-input__suggestions__item__display']/following::li[3]"));
driver.findElementByLinkText("Reopen").click();
Thread.sleep(3000);
driver.findElementByLinkText("Delete").click();
Thread.sleep(3000);

*/

	}	

	
	}


