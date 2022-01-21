package Testng;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class Fluentwait  {
	public static WebDriver driver;
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\VELOCITY\\chromedriver.exe");

	// Step-1
	driver =new ChromeDriver();

	// Step-2 
	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
    WebElement web05 = driver.findElement(By.id("checkbox"));

	web05.click();

	WebElement web06 = driver.findElement(By.id("ch"));

	FluentWait <WebDriver> fwait =new FluentWait(driver);

	fwait.withTimeout(15,TimeUnit.SECONDS).pollingEvery(10,TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
	
	fwait.until(ExpectedConditions.elementToBeSelected(web06));

	System.out.println("Checkbox is checked");
}
}
