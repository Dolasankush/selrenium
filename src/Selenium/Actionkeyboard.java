package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionkeyboard {

public static void main(String[] args) throws InterruptedException {
			
			
	   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
			
			//Step-1
			WebDriver driver =new ChromeDriver();
			
			//Step-2
			driver.manage().window().maximize();
			
			//Step-3-using 
			driver.get("https://vctcpune.com/selenium/practice.html#");
			
			//Step-4 
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			  
			  js.executeScript("window.scrollBy(0,400)");
			  Thread.sleep(4000);
			  
			 //Step-5
			  WebElement  dropdown =driver.findElement(By.id("dropdown-class-example"));
			  
			  //Step-6-Handling drop down using actions class
			  //step-a
			  Actions as=new Actions (driver);
			  
			  as.click(dropdown).perform();
			  Thread.sleep(3000);
			  
			  as.sendKeys(Keys.ARROW_DOWN)
			  .sendKeys(Keys.ARROW_DOWN).build().perform();  

		}

	}
			

