package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
	//ChromeDriver d=new ChromeDriver();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	
	
	
	
}
}
