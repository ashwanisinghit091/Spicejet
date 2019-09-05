package StepDefinations;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import Spicejet_Pages.Wlcome_Page;
import Utility.WeekDay;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefination {
	public	static Properties pr;
	public static WebDriver Driver;
	

@Given("^User is on Landing Page$")
public void user_in_on_Landing_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	
	pr=new Properties();
	FileInputStream fs=new FileInputStream("D:\\workspace11\\Spicejet_Automation\\Files\\Info.properties");
	pr.load(fs);
	String Browser_Name=pr.getProperty("Browser");
	
	if(Browser_Name.equalsIgnoreCase("chrome")) {
		
		Driver=new ChromeDriver();
		Driver.get("https://www.spicejet.com");
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
	}
	
	
if(Browser_Name.equalsIgnoreCase("IExplorer")) {
System.setProperty("webdriver.InternetExplorer.driver", "D:\\IEDriverServer.exe");
	 Driver=new InternetExplorerDriver();
		Driver.get("https://www.spicejet.com");
		Driver.manage().window().maximize();
	}


if(Browser_Name.equalsIgnoreCase("Firefox")) {
System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
 Driver=new FirefoxDriver();
Driver.get("https://www.spicejet.com");
Driver.manage().window().maximize();
}
	
	
	




}

@When("^Enter Details and search Hotel$")
public void enter_Details_and_search_Hotel() throws Throwable {
	Driver.findElement(By.xpath("//li[@class='myspice_trip']/a")).click();
	Driver.findElement(By.xpath("//div/input[@id='ctl00_mainContent_txtOriginStation1_MST']")).sendKeys("shirdi");
	Thread.sleep(2000);
	Driver.findElement(By.xpath("//div/input[@id='ctl00_mainContent_txtOriginStation1_MST']")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	Driver.findElement(By.xpath("//div/input[@id='ctl00_mainContent_txtOriginStation1_MST']")).sendKeys(Keys.ENTER);
	
	Driver.findElement(By.xpath("//div/input[@name='ctl00$mainContent$txt_Fromdate_MST']/following-sibling::button")).click();
	
	Thread.sleep(3000);
	WebElement we= Driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
	for(int i=0;i<12;i++) {
	
	String Month= we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(0).getText();
	
	String Year= we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(1).getText();

	if(Month.equalsIgnoreCase("OCTOBER") && Year.equalsIgnoreCase("2019")) {
	int  size=Driver.findElements(By.xpath("//div[1]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).size();
	
		for(int j=0;j<size;j++) {
		
	String s=	Driver.findElements(By.xpath("//div[1]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).get(j).getText();
		
	if(s.equalsIgnoreCase("10")) {
			Driver.findElements(By.xpath("//div[1]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).get(j).click();
		break;
		}
	
		}
		break;
	}
	
	
	Driver.findElement(By.xpath("//div/div/a[@title='Next']")).click();
	}
	
	Thread.sleep(4000);
	Driver.findElement(By.xpath("//div/input[@name='ctl00$mainContent$txt_Todate_MST']/following-sibling::button")).click();
	
	for(int i=0;i<12;i++) {
		
		String Month= we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(0).getText();
	
		String Year= we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(1).getText();
		
		if(Month.equalsIgnoreCase("OCTOBER") && Year.equalsIgnoreCase("2019")) {
			int  size1=Driver.findElements(By.xpath("//div[1]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).size();
			
			for(int k=0;k<size1;k++) {
				
				String s=	Driver.findElements(By.xpath("//div[1]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).get(k).getText();
					if(s.equalsIgnoreCase("19")) {
						Driver.findElements(By.xpath("//div[2]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).get(k).click();
					}
					}
			break;
		}
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//div/div/a[@title='Next']")).click();
		}
	
Select s=new Select(Driver.findElement(By.id("ddl_Adult_MST")));
s.selectByValue("5");
	
	Driver.findElement(By.xpath("//div[@id='Div14']")).click();
   
}

@Then("^Hotels as per Details mention appears$")
public void hotels_as_per_Details_mention_appears() throws Throwable {
	Set<String> it=Driver.getWindowHandles();
	Iterator<String> itt=it.iterator();
itt.next();
String child=itt.next();

	
	Driver.switchTo().window(child);
 String CurrentUrl= Driver.getCurrentUrl();
 System.out.println(CurrentUrl);
 if(CurrentUrl.equalsIgnoreCase("https://vacations.spicejet.com/HotelLists?val=Shirdi/8543796975376836518/20191010/20191109/5/0/0")) {
	 
	 System.out.println("Successfull");
 }
}



	
	
	
	
	
}

