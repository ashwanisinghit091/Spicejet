package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public



class WeekDay {

	
		
		static int k;
		static String dayname;

			
			public static WebDriver weekDayName(WebDriver Driver,String Date1) throws InterruptedException {
				
			//System.out.println(Driver.findElement(By.className("ui-datepicker-title")).getText());
			for(int i=0;i<12;i++) {
			String Month=Driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//div/a/following-sibling::div")).getText();
			
			//int size=Driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).size();
			if(Month.equalsIgnoreCase("November 2019")) {
				//for(int a=0;a<size;a++) {
				
		//	String Date=	Driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).get(a).getText();
			//	List<WebElement> w=Driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
				//div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/tbody/tr[1]/td/a
				
				//System.out.println(Driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody/tr[1]/td/a")).size());
				
		////	int size1=	Driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//tbody/tr[1]/td/a")).size();
	//	int k=7-size1;
			
			List<WebElement> w=Driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table[@class='ui-datepicker-calendar']/tbody/tr"));
			
			//div[@class='ui-datepicker-group ui-datepicker-group-first']//table[@class='ui-datepicker-calendar']/tbody/tr//td/a
			
			
			for(int j=0;j<5;j++) {
			
			
				
		//	int size4=	w.get(j).findElements(By.xpath("//td/a")).size();
				//System.out.println(size4);
					for(int y=0;y<5;y++) {
						WebElement w4=w.get(j);
					String Date=	w4.findElements(By.tagName("td")).get(y).getText();
					
				if(Date.equalsIgnoreCase("14")) {
					//w4.findElements(By.xpath("//td[@data-handler='selectDay']")).get(14).click();
					k=y+1;
					if(k==1) {dayname="Sunday";}
					if(k==2) {dayname="Monday";}
					if(k==3) {dayname="Tuesday";}
					if(k==4) {dayname="Wednesday";}
					if(k==5) {dayname="Thursday";}
					if(k==6) {dayname="Friday";}
					if(k==7) {dayname="Saturday";}
					
					break;
				}
				
				}
				
			
		
			}
			
		
			break;
			
				
				}
		 
			Thread.sleep(3000);
			Driver.findElement(By.xpath("//span[text()='Next']")).click();

			}
			return Driver;

			}
			
			}
			
			
			

		

//	}
	
	

