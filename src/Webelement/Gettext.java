package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		
		WebElement text=driver.findElement(By.xpath("//a[text()='Contact Sales']"));
        String s=driver.getTitle();
		if (s.equals("expected text")) {
		System.out.println("verified");	
		}
		else {
		System.out.println("not verified");	
		}
		
		
	}	
}
