package spicejet;

import org.testng.annotations.Test;

import Base.Base_Invoke_Browser;
import Spicejet_Pages.Wlcome_Page;

public class Search_Flight extends Base_Invoke_Browser{

	
	
	@Test
	public static void SearchFlight() throws InterruptedException {
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
	
	
	

}
