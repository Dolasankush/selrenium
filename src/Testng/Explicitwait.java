package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Explicitwait {
	public static WebDriver driver;

	@BeforeTest
	public void initBrowser() {
 System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");

		// Step-1
		driver =new ChromeDriver();

		// Step-2 
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}

	
	  @Test(priority=1) 
	  public void login() throws InterruptedException {
	  
	

			WebElement button = driver.findElement(By.id("alert"));
			button.click();
			//Explicit wait 
			WebDriverWait wa=new WebDriverWait(driver, 11);
			
			wa.until(ExpectedConditions.alertIsPresent());
			
			driver.switchTo().alert().accept();
	  
	  }
	 
	}


  

