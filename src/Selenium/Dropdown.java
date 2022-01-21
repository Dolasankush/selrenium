package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		
		   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//Step-2
		driver.manage().window().maximize();
		
		//Step-3
		driver.get("https://vctcpune.com/selenium/practice.html#");
		
		//Step-4 scrolling
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		  
		  js.executeScript("window.scrollBy(0,400)");
		  Thread.sleep(4000);
		  
		  
		  //Handle Radio Button
		 String text= driver.findElement(By.xpath("//label[contains(@for,'radio1')]")).getText();
		 System.out.println("Text on radiobutton : "+ text);
		 
		  driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		  Thread.sleep(2000);
		  
		  //Handling Dropdown
		  //5) By using the select class
		  
		  //a) Locate the web element
		WebElement  dropdown =driver.findElement(By.id("dropdown-class-example"));
		 
		 //b) Create the object of select class -(Parameter-webelement)
		 Select sel=new Select(dropdown);
		 
		 //c) Select the require value
		 //sel.selectByIndex(2);
		 
		 if (sel.isMultiple())  {
			 
			 sel.selectByVisibleText("Option2");
			 sel.selectByVisibleText("Option3");
		 }
		 else {
			 System.out.println("Dropdown is single select value");
			 sel.selectByValue("option3");
		 }
		 
		 
		 Thread.sleep(4000);
		 
		 //step-6
		 driver.close();
		 

	}
	}


	