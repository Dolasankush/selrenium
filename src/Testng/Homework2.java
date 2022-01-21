package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Homework2 {
	WebDriver driver;
    @BeforeSuite
    public void initBrowser() {
   	 System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");
        
        driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
  		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
  		driver.findElement(By.id("btnLogin")).click();
  		
  		driver.findElement(By.linkText("Recruitment")).click();
  		
       }
    @Test
    public void login() throws InterruptedException {
  		
  		WebElement title=driver.findElement(By.id("candidateSearch_jobTitle"));
  		title.click();
  		
  		Select sel=new Select(title);
  		sel.selectByValue("8");
  		Thread.sleep(2000);
}
    @Test
    public void login2() throws InterruptedException
    {
    	WebElement vacancy=driver.findElement(By.id("candidateSearch_jobVacancy"));
		vacancy.click(); 
		Select sel=new Select(vacancy); 
		sel.selectByValue("9");
		Thread.sleep(2000);
    }
    
    
    @Test
    public void login3() throws InterruptedException{
    	WebElement manager=driver.findElement(By.id("candidateSearch_hiringManager"));
		  manager.click(); 
		  Select sel=new Select(manager); 
		  sel.selectByIndex(1);
		  Thread.sleep(2000);
    }
    @Test
    public void login4() throws InterruptedException{
    	WebElement status=driver.findElement(By.id("candidateSearch_status"));
		  status.click(); 
		  Select sel=new Select(status);
		  sel.selectByValue("JOB OFFERED"); 
		  Thread.sleep(2000);
		  driver.close();
		  
   }
    }
 
