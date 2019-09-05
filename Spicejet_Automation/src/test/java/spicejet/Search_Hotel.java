package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Base_Invoke_Browser;

public class Search_Hotel extends Base_Invoke_Browser{

	
	
	
	
	
	@Test
	public void SearchHotel() throws InterruptedException {
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
	System.out.println(we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(0).getText());
	String Month= we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(0).getText();
	System.out.println(Month);
	String Year= we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(1).getText();
	System.out.println(Year);
	if(Month.equalsIgnoreCase("OCTOBER") && Year.equalsIgnoreCase("2019")) {
	int  size=Driver.findElements(By.xpath("//div[1]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).size();
		System.out.println("abc");
		for(int j=0;j<size;j++) {
		System.out.println(size);
	String s=	Driver.findElements(By.xpath("//div[1]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).get(j).getText();
		System.out.println(s);
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
		System.out.println(we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(0).getText());
		String Month= we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(0).getText();
		System.out.println(Month);
		String Year= we.findElements(By.xpath("//div/div/div[@class='ui-datepicker-title']/span")).get(1).getText();
		System.out.println(Year);
		if(Month.equalsIgnoreCase("OCTOBER") && Year.equalsIgnoreCase("2019")) {
			int  size1=Driver.findElements(By.xpath("//div[1]/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")).size();
			System.out.println("abc");
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
}
