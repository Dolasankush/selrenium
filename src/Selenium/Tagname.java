package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {
public static void main(String[] args) throws InterruptedException {
		
	   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//Step-2
		driver.manage().window().maximize();
		
		//Step-3
		driver.get("https://en-gb.facebook.com/");
		
		//Step-4
		//Locators use is tag name-
		driver.findElement(By.partialLinkText("password?")).click();
		
		//upload photo
		Thread.sleep(4000);
		driver.close();
		
		
		
	
	}

}






