package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramm_login {

	public class Instagram_LoginPage {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	        
			  driver.manage().window().maximize();
			  
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  
			  driver.get("https://www.instagram.com/");
			  
			  
			  boolean b=driver.findElement(By.xpath("//input[@name='username']")).isEnabled();
			  System.out.println(b);

			
			
		}
		
	}
	
	
}
