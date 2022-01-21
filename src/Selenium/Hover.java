package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/menu/#");
	
	//Actions Class
	Actions act=new Actions(driver);
	
	WebElement hover=driver.findElement(By.linkText("Main Item 2"));
	
	act.moveToElement(hover).perform();
	
	WebElement link2=driver.findElement(By.xpath("//*[text()='Main Item 1']//following::a[2]"));
	
	link2.click();
	Thread.sleep(5000);
	driver.close();
		
}	
	
}
