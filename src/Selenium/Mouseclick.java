package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseclick {
	public static void main(String[] args) throws InterruptedException {
		

		   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");


			//Step-1
				WebDriver driver =new ChromeDriver();
				
				//Step-2
				driver.manage().window().maximize();
				driver.get("https://demoqa.com/buttons");
				
				
				  //Step-4- Double click using actions class
				  //step-a
				  Actions as=new Actions (driver);
				  
				 WebElement  button=driver.findElement(By.xpath("//button[text()='Click Me']"));
				  
				 as.click(button).perform();
				 
             String meassage=driver.findElement(By.xpath("//button[text()='Click Me']")).getText();
				  
				  System.out.println(meassage);		
				  
	 }
}




