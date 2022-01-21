package Selenium;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
	//Step-1
			WebDriver driver =new ChromeDriver();
			
			//Step-2
			driver.manage().window().maximize();
			
			//Step-3-using 
			driver.get("https://vctcpune.com/selenium/practice.html#");
			
			//Step-4
			String parent=driver.getWindowHandle();
			System.out.println("Parent Id is : "+ parent);
			
			//Step-5
			//scroll Down
			JavascriptExecutor je=(JavascriptExecutor) driver;
			
			je.executeScript("window.scrollBy(0,700)");
			Thread.sleep(2000);
			
			//Step-6
			driver.findElement(By.id("opentab")).click();
			
			Set<String>alla_tb = driver.getWindowHandles();
			
			for (String id:alla_tb) {
				
			 System.out.println(id);
				
			if(!parent.equalsIgnoreCase(id)) {
				
				driver.switchTo().window(id);
				String title =driver.getTitle();
				System.out.println("Title of the page is :" + title);
				Thread.sleep(2000);
				driver.close();
			}
		}
	           driver.switchTo().window(parent);
	           
	           String url=driver.getCurrentUrl();
	           System.out.println(url);
	           Thread.sleep(2000);
	           je.executeScript("window.scrollBy(0,-700)");
	   		
	           
	           Thread.sleep(4000);
	           
	}
			
	
}	


