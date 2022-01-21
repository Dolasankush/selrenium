package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Homework {
	WebDriver driver;
    @BeforeSuite
    public void initBrowser() {
    	 System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
        
        driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
       }
	@Test
  public void login() throws InterruptedException {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Recruitment")).click();
		
		driver.findElement(By.partialLinkText("ment")).click();
		
		WebElement title=driver.findElement(By.id("candidateSearch_jobTitle"));
		title.click();
		
		Select sel=new Select(title);
		sel.selectByValue("8");
		Thread.sleep(2000);
		
		/*
		 * WebElement vacancy=driver.findElement(By.id("candidateSearch_jobVacancy"));
		 * vacancy.click(); Select sel2=new Select(vacancy); sel2.selectByValue("9");
		 * Thread.sleep(2000);
		 */
		
		  WebElement manager=driver.findElement(By.id("candidateSearch_hiringManager"));
		  manager.click(); 
		  Select sel3=new Select(manager); 
		  sel3.selectByIndex(0);
		  Thread.sleep(2000);
		  
		  WebElement status=driver.findElement(By.id("candidateSearch_status"));
		  status.click(); 
		  Select sel4=new Select(status);
		  sel4.selectByVisibleText("JOB OFFERED"); 
		  Thread.sleep(2000);
		 
		
		
	  
  }
}
  
