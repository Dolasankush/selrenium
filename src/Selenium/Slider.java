package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
		
		//Step-2
		driver.manage().window().maximize();
		
		//Step-3-using 
		driver.get("https://jqueryui.com/slider/");
		
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
	     WebElement slider=driver.findElement(By.id("slider"));
		
		//Step-8-Actions Class Object creation
		Actions act=new Actions(driver);
		
		//Step-9-Sliding  on horizontal scale
		act.clickAndHold(slider).moveByOffset(200, 0).release().perform();
		Thread.sleep(4000);
		
		//Step-10- Moving back to original position
		act.clickAndHold(slider).moveByOffset(-200, 0).release().perform();
		
//		
//		///Step-10
		Thread.sleep(9000);
		driver.close();
				
	
}	

}
