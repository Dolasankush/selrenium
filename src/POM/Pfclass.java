package POM;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pfclass {
public WebDriver driver;
	

	@BeforeClass
	public void initalization() {
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");

		
		  driver=new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}
	
	@Test
	public void login() {
		
		LoginPage1 lp=new LoginPage1(driver);
		lp.login();
				
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
	}
	
	
	
}



