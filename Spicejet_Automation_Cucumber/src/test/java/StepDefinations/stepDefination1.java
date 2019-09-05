package StepDefinations;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Spicejet_Pages.Wlcome_Page;
import Utility.WeekDay;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination1 {
	public	static Properties pr;
	public static WebDriver Driver;

@Given("^User is on Landing Page1$")
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
	

@When("^User enter detail and search flight$")
public void user_enter_detail_and_search_flight() throws Throwable {
 
	Wlcome_Page wp=new Wlcome_Page(Driver);
	wp.Multicity().click();

wp.Multimode_Alert().click();
Thread.sleep(3000);
wp.Origin_Station().click();





wp.Origin_Station().sendKeys(pr.getProperty("From1"));
wp.Destination_Station().click();
wp.Destination_Station().sendKeys(pr.getProperty("To1"));	
wp.View_Date().click();


WeekDay.weekDayName(Driver,pr.getProperty("Date1"));

for(int i=0;i<12;i++) {
String Month=wp.Months().getText();

int size=wp.Dates().size();

if(Month.equalsIgnoreCase(pr.getProperty("Month_year"))) {
	for(int a=0;a<size;a++) {
	
String Date=	wp.Dates().get(a).getText();




	if(Date.equalsIgnoreCase(pr.getProperty("Date1"))) {
		wp.Dates().get(a).click();
		
		break;
	}
	
	}
break; 
	
}


}


wp.Origin2().click();
wp.Origin2().sendKeys(pr.getProperty("From2"));

wp.Destination2().click();
wp.Destination2().sendKeys(pr.getProperty("To2"));

wp.View_Date2().click();


for(int i=0;i<12;i++) {
	String Month=wp.Months().getText();
	
	int size=wp.Dates().size();
	
	if(Month.equalsIgnoreCase(pr.getProperty("Month_year"))) {
		for(int a=0;a<size;a++) {
		
	String Date=	wp.Dates().get(a).getText();
	
	

	
		if(Date.equalsIgnoreCase("29")) {
			wp.Dates().get(a).click();
		
			break;
		}
		
		}
	break; 
		
	}
	

	}

wp.search().click();
}



@Then("^Filghts should appear as per details$")
public void Filghts_should_appear_as_per_details() throws Throwable {
	 String CurrentUrl= Driver.getCurrentUrl();
	 System.out.println(CurrentUrl);
	 if(CurrentUrl.contains("https://book.spicejet.com/Select.aspx")) {
		 
		 System.out.println("Successfull");
	 }
	 

}




	
}