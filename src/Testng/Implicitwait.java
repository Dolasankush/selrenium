package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Implicitwait {
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
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}

  
}
