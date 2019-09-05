package Spicejet_Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

;





public class Wlcome_Page {
WebDriver Driver;
	public Wlcome_Page(WebDriver Driver){
		
		this.Driver= Driver;
	}
	
	
	By Return=By.xpath("//div[@id='travelOptions']/table[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td");
	
	By From=By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	By From_Option=By.xpath("//div[@class='dropdownDiv']/ul/li/a");
	By To=By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
	By calender= By.xpath("//div[@id='ui-datepicker-div']");
	By Depart_Date=By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a");
	By Month =By.xpath("//div/div[@class='ui-datepicker-title']/span[1]");
	By Retrun_Date_Box=By.id("ctl00_mainContent_view_date2");
	By Next=By.xpath("//a[@title='Next']");
	By Date =By.xpath("//div/div[@class='ui-datepicker-title']/span");
	By Passenger=By.cssSelector("div#divpaxinfo");
	By Passenger_option=By.xpath("//div[@id='divpaxOptions']");
	By Add=By.xpath("//div[@class='ad-row-right']//span[@id='hrefIncAdt']");
	By ok=By.xpath("//div[@class='ad-row align-center']/input[@id='btnclosepaxoption']");
	By search=By.cssSelector("input#ctl00_mainContent_btn_FindFlights");
	By Multicity=By.xpath("//*[text()='Multicity']");
	By Multicity_message=By.cssSelector(".MultiCityContent");
	By Multimode_Alert=By.cssSelector("#MultiCityModelAlert");
	By Origin_Station=By.name("ctl00_mainContent_ddl_originStation1_CTXT");
	By Destination_Station=By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
	By View_Date=By.cssSelector("#ctl00_mainContent_view_date1");
	By Months=By.className("ui-datepicker-title");
	By Dates=By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a");
	
By Origin2=By.cssSelector("#ctl00_mainContent_ddl_originStation2_CTXT");

By Destination2=By.id("ctl00_mainContent_ddl_destinationStation2_CTXT");	

By View_Date2=By.id("ctl00_mainContent_view_date3");





public WebElement View_Date2() {
	
	return Driver.findElement(View_Date2);
}



public WebElement Destination2() {
	
	return Driver.findElement(Destination2);
}

public WebElement Origin2() {
	
	return Driver.findElement(Origin2);
}

public List<WebElement> Dates() {
		
		return Driver.findElements(Dates);
	}
	
	
	
public WebElement Months() {
		
		return Driver.findElement(Months);
	}
	
	
public WebElement View_Date() {
		
		return Driver.findElement(View_Date);
	}
	
	
public WebElement Destination_Station() {
		
		return Driver.findElement(Destination_Station);
	}
	
	
public WebElement Origin_Station() {
		
		return Driver.findElement(Origin_Station);
	}
	
	
public WebElement Multimode_Alert() {
		
		return Driver.findElement(Multimode_Alert);
	}
	
	
	
	
public WebElement Multicity_message() {
		
		return Driver.findElement(Multicity_message);
	}
	
	
	
	
public WebElement Multicity() {
		
		return Driver.findElement(Multicity);
	}
	
	
public WebElement search() {
		
		return Driver.findElement(search);
	}
	
	
	
	
	
	
public WebElement Passenger_option() {
		
		return Driver.findElement(Passenger_option);
	}
	
	
	
	
	
public WebElement ok(WebElement we4) {
		
		return we4.findElement(ok);
	}
	
	public WebElement Add(WebElement we4) {
		
		return we4.findElement(Add);
	}
	
	
	
public List<WebElement> Date(WebElement we3) {
		
		return we3.findElements(Date);
	}
	
	
public WebElement Passenger() {
	
	return Driver.findElement(Passenger);
}

public WebElement Next(WebElement we3) {
		
		return we3.findElement(Next);
	}
	public List<WebElement> Month(WebElement we3) {
		
		return we3.findElements(Month);
	}
	
public List<WebElement> Return() {
		
		return Driver.findElements(Return);
	}
	
	
public WebElement from() {
		
		return Driver.findElement(From);
	}
	
public List<WebElement> From_Option(WebElement we) {
	
	return we.findElements(From_Option);
}

public WebElement To( ) {
	
	return Driver.findElement(To);
}
public WebElement calender( ) {
	
	return Driver.findElement(calender);
}

public List<WebElement> Depart_Date(WebElement we2) {
	
	return we2.findElements(Depart_Date);
}
	
public WebElement Retrun_Date_Box( ) {
	
	return Driver.findElement(Retrun_Date_Box);
}
}
