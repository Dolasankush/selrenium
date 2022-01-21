package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");


	//Step-1
	WebDriver driver =new ChromeDriver();
	
	//Step-2
	driver.manage().window().maximize();
	
	//Step-3
	driver.get("https://www.facebook.com/");
	
	//Step-4
	String tiitle= driver.getTitle();
	System.out.println("Title of page is : "+ tiitle);
	
	//Step-5-Verification of title
	if (tiitle.contains("Facebook"))
	{
		System.out.println("Title matched- TC Passed");
	}
	
	else {
		
		System.out.println("Title Not- matched- TC Failed");
	}
	

}}
