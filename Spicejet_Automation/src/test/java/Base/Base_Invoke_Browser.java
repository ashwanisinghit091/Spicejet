package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;


public class Base_Invoke_Browser {

	
	
public	static Properties pr;
	public static WebDriver Driver;
	@BeforeMethod
	public void invoke_Browser() throws IOException {
		
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
	
	
	
	
}
