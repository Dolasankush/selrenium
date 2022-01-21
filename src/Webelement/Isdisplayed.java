package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.orangehrm.com/");
	
	WebElement button=driver.findElement(By.xpath("//a[text()='Contact Sales']"));
	boolean result=button.isDisplayed();
	if (result) {
	System.out.println("element is present");	
	}
	else {
	System.out.println("element not present");	
	}
	
	
}	

}
