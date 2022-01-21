package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//Step-2
		driver.manage().window().maximize();
		
		//Step-3
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(4000);
		
		//Step-4
		//Locators use is tag name-
		//driver.findElement(By.cssSelector("input[type=text]")).sendKeys("abc@gmail.com");
		//input[@name='email']
		
		//step-5
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		Thread.sleep(4000);
		
		//Step-6
		//Scroll down window
		
		  JavascriptExecutor js=(JavascriptExecutor) driver;
		  
		  js.executeScript("window.scrollBy(0,300)"); Thread.sleep(2000);
		 
	
		//Step-7
		driver.findElement(By.linkText("About")).click();
		
		//Step-8
		Thread.sleep(4000);
		driver.close();
		
		
		
	
	}

}

