package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Faceclass {
	public WebDriver driver;
	@BeforeClass
	public void initalization() {
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");
           driver=new ChromeDriver();
           
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://en-gb.facebook.com/");
	    
	}
	
	@Test
	public void login() {
		
		facebook f=new facebook(driver);
		f.login();
	}
	@Test
       public void search() {
		Login l=new Login(driver);
		l.search();		

		
	}

	
//	@AfterClass
//	public void tearDown() {
//		
//		driver.close();
//	}

}
