package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


     public class Parameterr {
	
     WebDriver driver;
	
    @Test
    @Parameters("browser")
      public void browserTest(String var) {
		
		if(var.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");
			
			//Step-1
			 driver =new ChromeDriver();
			 driver.get("https://www.google.co.in/");
			 driver.manage().window().maximize();
		}
		else if (var.equalsIgnoreCase("Firefox")) {
			 System.setProperty("webdriver.gecko.driver","D:\\VELOCITY\\geckodriver.exe");
//			//"C:/Users/LENOVO/Desktop/Slenium Jar/geckodriver.exe"
//			//Step-1
			 driver =new FirefoxDriver();
			 driver.get("https://www.mozilla.org/en-US/firefox/new/");
			 driver.manage().window().maximize();
//		
		
	}}
	
	 
	public void f() {
		System.out.println("@Test running of ");
		String title =driver.getTitle();
		System.out.println("title of page is " + title);
		
	}

	
	  @Test 
	  public void f1() { 
     System.out.println("f1 is running"); }
	  
	  @Test 
	  public void f2() {
     System.out.println("@Test running"); }
	 
	}
 
