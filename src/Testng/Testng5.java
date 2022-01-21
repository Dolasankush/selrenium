package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testng5 {
	public static WebDriver driver;

	@BeforeTest
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");

		// Step-1
		driver =new ChromeDriver();

		// Step-2 
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	
	  @Test(priority=1) 
	  public void login() throws InterruptedException {
	  
	 
	  //Enter the Username
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	 Thread.sleep(1000); //Enter the Password
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(
	  "admin12333"); Thread.sleep(1000); //Login Button click
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	  Thread.sleep(1000); Assert.assertTrue(true);
	  
	  
	  }
	  @Test(priority=2) 
	  public void homepage() throws InterruptedException {
	  
		  System.out.println("Hi second test case");
	 Thread.sleep(1000); 
	 Assert.assertTrue(true);
	  
	  
	  }

	}



