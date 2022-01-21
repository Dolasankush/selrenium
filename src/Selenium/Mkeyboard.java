package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mkeyboard {

	 public static void main(String[] args) throws InterruptedException {
	

   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");


	//Step-1
		WebDriver driver =new ChromeDriver();
		
		//Step-2
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		//Step-3-using 
		driver.navigate().to("https://vctcpune.com/selenium/practice.html#");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();

}
}