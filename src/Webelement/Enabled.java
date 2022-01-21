package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement button=driver.findElement(By.name("login"));
		boolean result=button.isEnabled();
		if (result) {
		System.out.println("element is present");	
		}
		else {
		System.out.println("element not present");	
		}
		
		
	}	

	}



