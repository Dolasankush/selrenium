package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

// import com.sun.tools.javac.util.Assert;

public class Testng2 {
 		WebDriver driver;
		
		@BeforeSuite
		public void initBrowser() {
			System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
			
			//Step-1
			 driver =new ChromeDriver();
			
			//Step-2
			driver.manage().window().maximize();
			
		}
		
		@BeforeClass
		public void navigatePage() {
			driver.get("https://www.google.com/");
		}
		
		@BeforeMethod
		public void beforeMethods(){
			System.out.println("Before method is running");
		}

		@Test()
		public void verifyTitleOfPage()  {
			String title=driver.getTitle();
			
			if(!title.equalsIgnoreCase("Googleeeee")) {
				
				Assert.fail("tc failed");
			}
			else 
				System.out.println("Title Matched");
		}
		@Test
		public void verifyurl()  {
			String title=driver.getCurrentUrl();
			
			if(!title.equalsIgnoreCase("https://www.google.com/")) {
				
				Assert.fail("tc failed");
			}
			else 
				System.out.println("Title Matched");
		}
			@AfterSuite
			public void close() {
				driver.close();
				
			}
		}
		






 
