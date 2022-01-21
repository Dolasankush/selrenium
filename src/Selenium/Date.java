package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//Step-2
		driver.manage().window().maximize();
		
		//Step-3
		driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");
		
		//Step-4
		driver.findElement(By.id("datepicker")).click();
		
		//Step-5-    18 -Dec-18
		while(true) {
			
			String title =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println("current Title is : " + title);
			
			if (!title.equalsIgnoreCase("December 2018")) {
				
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
				
			}
			else  {
				 break;
			}
		}
		
		int date=31;
		driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+date+"']")).click();
	
		
	}

}



