package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.gecko.driver","D:\\VELOCITY\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("9604747754");
		driver.findElement(By.id("pass")).sendKeys("Ankush@1410");
		
		
		
		
		
	}

}
