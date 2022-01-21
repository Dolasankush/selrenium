package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	
public static void main(String[] args)  throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
    driver.manage().window().maximize();
    
    driver.get("https://www.saucedemo.com/");
    //for login 
    WebElement s=driver.findElement(By.id("user-name"));
    s.sendKeys("standard_user");
    driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
    driver.findElement(By.name("login-button")).click();
    Thread.sleep(2000);
    
    String s1=driver.getCurrentUrl();
    if(s1.equalsIgnoreCase("https://www.saucedemo.com/inventory.html")) {
    	System.out.println("login successfull-Test case 1 passed");
    }
    else {
    	System.out.println("unsuccessfull-test case 1 failed");
    	
    }// for logout
    driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
    Thread.sleep(2000);
    String s2=driver.getCurrentUrl();
    if(s2.equalsIgnoreCase("https://www.saucedemo.com/")) {
    	System.out.println("test case2 passed");
    }
    else {
    	System.out.println("Test case2 failed");
    }
}


}
