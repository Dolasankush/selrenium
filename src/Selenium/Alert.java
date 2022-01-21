package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
		
		//Step-2
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
	    
	    //Step-6
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    
	    //step-7
	    driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	    
	
}

}
