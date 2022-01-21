package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousedrop {
	
public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	//Step-2
	driver.manage().window().maximize();
	
	//Step-3-using 
	driver.get("https://jqueryui.com/droppable/");
	
	//Step-4
	//scroll Down
	JavascriptExecutor je=(JavascriptExecutor) driver;
	
	je.executeScript("window.scrollBy(0,300)");
	
	//Step-5
	//Identifying frame 
	WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
	
	//Step-6
	//Switching to frame
	driver.switchTo().frame(iframe);
	
	//Step-7
 WebElement drag=driver.findElement(By.id("draggable"));
 WebElement drop=driver.findElement(By.id("droppable"));
 
	
	//Step-8-Actions Class Object creation
	Actions act=new Actions(driver);
	
	//Step-9-Drag & Drop Action
	act.dragAndDrop(drag, drop).perform();
	
	///Step-10
	Thread.sleep(9000);
	driver.close();
}
}
