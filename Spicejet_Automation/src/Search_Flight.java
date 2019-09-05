package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Base_Invoke_Browser;
import Spicejet_Pages.Wlcome_Page;




public class Search_Flight extends Base_Invoke_Browser {

	
	
	
	@Test
	
	public void Book_Ticket() throws InterruptedException {
		
	Wlcome_Page wp=new Wlcome_Page(Driver);
	Thread.sleep(4000);
System.out.println(	wp.Return().size());
for(int j=0;j<wp.Return().size();j++) {
	if(wp.Return().get(j).getText().equalsIgnoreCase("Round Trip")) {
		
		wp.Return().get(j).click();
	}
	
	
}

WebElement we=wp.from();
	we.click();
	int size=wp.From_Option(we).size();
		for(int i=0;i<size;i++) {
		
			we.sendKeys(Keys.ARROW_DOWN);
			//System.out.println(wp.From_Option(we).get(i).getText());
			if(wp.From_Option(we).get(i).getText().equalsIgnoreCase(pr.getProperty("From"))) {
				
				wp.From_Option(we).get(i).sendKeys(Keys.ENTER);
				break;
			}
		}
		
		Thread.sleep(3000);
		WebElement we1=wp.To();
		we1.sendKeys("Chennai");
		
		WebElement we2=wp.calender();
		int size3=wp.Depart_Date(we2).size();
		for(int k=0;k<size3;k++) {
		
	String Departure_Date=wp.Depart_Date(we2).get(k).getText();
	System.out.println(Departure_Date);
	if(Departure_Date.equalsIgnoreCase("20")) {
		wp.Depart_Date(we2).get(k).click();
		break;
	}
		
	
	}
		
		Thread.sleep(4000);
	wp.Retrun_Date_Box().click();
	
	WebElement we3=wp.calender();
//WebElement we4=	we3.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));

for(int x=0;x<100;x++) {

Thread.sleep(3000);

		String month=wp.Date(we3).get(0).getText();
		
		String year=wp.Date(we3).get(1).getText();
	
		String Calenderdate=month+year;
		System.out.println(Calenderdate);
		if(Calenderdate.equalsIgnoreCase("January2020")) {

			
			int size4=wp.Depart_Date(we3).size();
			for(int k=0;k<size4;k++) {
			
		String Departure_Date=wp.Depart_Date(we3).get(k).getText();
		if(Departure_Date.equalsIgnoreCase("24")) {
			wp.Depart_Date(we3).get(k).click();
			break;
		}
			
			
		}
			
			break;
		}
		
wp.Next(we3);
		we3.findElement(By.xpath("//a[@title='Next']")).click();		
	
	}

Thread.sleep(2000);
wp.Passenger().click();
WebElement we4=wp.Passenger_option();

Thread.sleep(2000);
for(int y=0;y<4;y++) {
	
wp.Add(we4).click();
	}
	wp.ok(we4).click();
	
	
	WebElement we5= Driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency"));
	Select s=new Select(we5);
	s.selectByValue("INR");
	
	wp.search().click();
	
	}

	
	
	}

	
	






