package Testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readproperty {
	public static Properties prop;
	public static void readProperty() throws IOException {
		
		String path="C:\\Users\\DELL\\eclipse-workspace\\Selenuim\\src\\Testng\\Property.properties";
		 prop=new Properties();
		
		FileInputStream fis=new FileInputStream(path);
		
		prop.load(fis);
		
		String adminEmail=prop.getProperty("email");
		String adminPass=prop.getProperty("pass");
		
		System.out.println("Value of Key is " + adminEmail);
		System.out.println("value of Key is " + adminPass);
		
		
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		readProperty();
		
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");

		
		  WebDriver driver=new ChromeDriver();
	      Thread.sleep(3000);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("email"));
			driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("pass"));
			Thread.sleep(3000);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.id("welcome")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
		   
			Thread.sleep(8000);
			driver.close();
		
	}

}


